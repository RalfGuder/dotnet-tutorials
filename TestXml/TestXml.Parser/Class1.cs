using Gudchensoft.TestXml.Api;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace Gudchensoft.TestXml.Parser
{
	public class XmlParser : IXmlParser
	{
		string IXmlParser.Tagname 
		{
			get { return ""; }
		}

		void IXmlParser.Parse(XmlReader reader)
		{
			throw new NotImplementedException();
		}
	}
}
