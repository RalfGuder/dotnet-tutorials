/* The MIT License (MIT)
 * 
 * Copyright (c) 2019 Michael Horstmann
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
using System.Diagnostics;
using System.Reflection;
using FrameApp;
using ModelTest;

namespace TestDriver2
{
    public class TestDriver2 : ILib, ILib2
    {
        private string _version;
        private string _fileVersion;
        private string _productVersion;
        private BaseModule _module;

        public TestDriver2()
        {
            _version = string.Empty;
            _fileVersion = string.Empty;
            _productVersion = string.Empty;
        }

        public void Initialize()
        {
            _version = Assembly.GetExecutingAssembly().GetName().Version.ToString();
            _fileVersion = FileVersionInfo.GetVersionInfo(Assembly.GetExecutingAssembly().Location).FileVersion;
            _productVersion = FileVersionInfo.GetVersionInfo(Assembly.GetExecutingAssembly().Location).ProductVersion;
            _module = new BaseModule();
            Console.WriteLine(_module.GetVersion());
            _module.Action1();
            _module.Action2();
        }

        public string GetName()
        {
            return Assembly.GetExecutingAssembly().GetName().FullName;
        }

        public string GetInformation()
        {
            return $"Assembly version: V{_version} // File version: V{_fileVersion} // Product version: V{_productVersion}";
        }

        public string GetAdditionalInformations()
        {
            return $"Some additional informations from {nameof(TestDriver2)}!";
        }
    }
}
