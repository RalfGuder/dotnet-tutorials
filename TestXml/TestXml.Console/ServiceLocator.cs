using Gudchensoft.TestXml.Api;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;


namespace Gudchensoft.TestXml.Console
{
	internal class ServiceLocator
	{
		private readonly List<IXmlParser> _assemblies;
		private readonly StringBuilder _log;

		public ServiceLocator()
		{

			_assemblies = new List<IXmlParser>();
			_log = new StringBuilder();
		}

		private Assembly? CurrentDomain_AssemblyResolve(string fullName)
		{
		

			System.Console.WriteLine($@"Trying to resolve assembly {fullName}...");


			// check for assemblies already loaded
			Assembly? assembly = AppDomain.CurrentDomain.GetAssemblies().FirstOrDefault(a => a.FullName == fullName);
			if (assembly != null)
			{
				System.Console.WriteLine($@"Assembly exists: {fullName}");
				return assembly;
			}

			System.Console.WriteLine($@"Failed to load assmbly '{fullName}'!");
			return null;
		}


		private void AddLog(string message)
		{
			_log.AppendLine($"{DateTime.Now.ToShortDateString()} {message}");
			System.Console.WriteLine(message);

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

		internal void AddLibs()
		{
			var files = Directory.GetFiles("./dll/", "*.dll", SearchOption.AllDirectories).ToList();
			AddLog("Found following files:");
			files.ForEach(x => AddLog(x));

			foreach (var file in files)
			{
				AddDriverLib<IXmlParser>(file, out var lib);
				if (lib == null) continue;

				
				_assemblies.Add(lib);
				AddLog($"Added and initialized lib '{lib.GetType().Assembly.FullName}'");



			}
		}

	}

}
