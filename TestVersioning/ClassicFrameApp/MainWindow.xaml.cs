/* The MIT License (MIT)
 * 
 * Copyright (c) 2017 Michael Horstmann
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES 
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, 
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.   
 * 
 */
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Reflection;
using System.Windows;
using FrameApp;
using System.IO;
using System.Text;

namespace ClassicFrameApp
{
    public partial class MainWindow
    {
        private readonly List<ILib> _assemblies;
        private readonly List<ILib2> _assemblies2;
        private readonly StringBuilder _log;

        public MainWindow()
        {
            AppDomain.CurrentDomain.AssemblyResolve += CurrentDomain_AssemblyResolve;
            InitializeComponent();
            _assemblies = new List<ILib>();
            _assemblies2 = new List<ILib2>();
            _log = new StringBuilder();
        }

        private Assembly CurrentDomain_AssemblyResolve(object sender, ResolveEventArgs args)
        {
            // Ignore missing resources
            if (args.Name.Contains(".resources")) return null;
            if (args.RequestingAssembly == null) return null;

            Console.WriteLine($@"Trying to resolve assembly {args.Name}...");
            Console.WriteLine($@"Requesting assembly: {args.RequestingAssembly.FullName}");

            // check for assemblies already loaded
            Assembly assembly = AppDomain.CurrentDomain.GetAssemblies().FirstOrDefault(a => a.FullName == args.Name);
            if (assembly != null)
            {
                Console.WriteLine($@"Assembly exists: {args.Name}");
                return assembly;
            }

            Console.WriteLine($@"Failed to load assmbly '{args.Name}'!");
            return null;
        }

        private void ButtonLoadAllDrivers_Click(object sender, RoutedEventArgs e)
        {
            AddLibs();
        }

        private void AddLog(string message)
        {
            _log.AppendLine($"{DateTime.Now.ToShortDateString()} {message}");
            TextLog.Text = _log.ToString();
        }

        private IEnumerable<Type> GetLoadableTypes(Assembly assembly)
        {
            try
            {
                return assembly.GetTypes();
            }
            catch (ReflectionTypeLoadException e)
            {
                return e.Types.Where(t => t != null);
            }
        }

        /// <summary>
        /// Checks and returns a matching assembly which implements the interface we specified.
        /// </summary>
        /// <typeparam name="T">Interface type T.</typeparam>
        /// <param name="filename">The assembly filename.</param>
        /// <param name="newDriver">The new driver plugin.</param>
        private void AddDriverLib<T>(string filename, out T newDriver)
        {
            newDriver = default(T);

            try
            {
                var driverAssembly = Assembly.LoadFrom(filename);
                var types = GetLoadableTypes(driverAssembly);

                foreach (Type driverType in types)
                {
                    // only look at public and non-abstract types
                    if ((driverType.IsPublic) && (!driverType.IsAbstract))
                    {
                        // get object type of the specified interface
                        var typeInterface = driverType.GetInterface(typeof(T).FullName ?? throw new InvalidOperationException(), true);

                        // If assembly contains the interface, create new driver instance and store to output param
                        if (typeInterface != null)
                        {
                            newDriver = (T)Activator.CreateInstance(driverAssembly.GetType(driverType.ToString()));
                        }
                    }
                }
            }
            catch (Exception ex)
            {
                Debug.WriteLine(ex.Message);
            }
        }

        private void AddLibs()
        {
            var files = Directory.GetFiles(Path.Combine(TextBoxStartPath.Text), "TestDriver*.dll", SearchOption.AllDirectories).ToList();
            AddLog("Found following files:");
            files.ForEach(x => AddLog(x));

            foreach (var file in files)
            {
                AddDriverLib<ILib>(file, out var lib);
                if (lib == null) continue;

                lib.Initialize();
                _assemblies.Add(lib);
                AddLog($"Added and initialized lib '{lib.GetName()}'");
                AddLog($"Information about lib: {lib.GetInformation()} ");

                if (lib is ILib2 lib2)
                {
                    _assemblies2.Add(lib2);
                    AddLog($"Information about lib2: {lib2.GetAdditionalInformations()} ");
                }
            }
        }

        private void ButtonCheckLoadedAssemblies_Click(object sender, RoutedEventArgs e)
        {
            AddLog("Currently loaded specific assemblies: ");
            var loadedAssemblies = AppDomain.CurrentDomain.GetAssemblies().ToList().FindAll(x => x.FullName.Contains("TestDriver")).ToList();

            if (loadedAssemblies.Count == 0)
            {
                AddLog("Nothing found!");
                return;
            }

            foreach (var asm in loadedAssemblies)
            {
                AddLog(asm.FullName);
            }
        }

        private void ButtonDeleteLog_Click(object sender, RoutedEventArgs e)
        {
            _log.Clear();
            TextLog.Text = _log.ToString();
        }
    }
}
