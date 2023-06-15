namespace Gudchensoft.TextXml.Console
{
	using Gudchensoft.TestXml.Console;
	using System;
	public class ConsoleApp
	{
		ConsoleApp() { }

		public static void Main(string[] Args)
		{
			Console.WriteLine("Start");	
			ServiceLocator locator = new ServiceLocator();
			locator.AddLibs();


			// Konsole verlassen
			Environment.Exit(1);	

			
		}
	}
}
