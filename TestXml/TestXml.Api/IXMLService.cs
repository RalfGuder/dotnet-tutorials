
namespace Gudchensoft.TestXml.Api
{
	using System;
	using System.Collections.Generic;
	using System.Linq;
	using System.Text;
	using System.Threading.Tasks;
	using System.Xml;

	public interface IXmlService
    {
		IXmlParser[] GetXmlParsers();

    }
}
