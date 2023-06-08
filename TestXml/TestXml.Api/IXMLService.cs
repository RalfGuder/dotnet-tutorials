namespace Gudchensoft.TestXml.Api
{
	using System;
	using System.Collections.Generic;
	using System.Linq;
	using System.Text;
	using System.Threading.Tasks;
	using System.Xml;

    
	 /**<summary>
	  * Schnittstelle für den Service Provider
	  * </summary>
	  */
	public interface IXmlService
    {
		/**
		 * <summary>
		 * Parser abrufen.
		 * </summary>
		 * <returns>
		 * Ein Array vom Typ <code>IXmlParser</code>
		 * </returns>
		 */
		IXmlParser[] GetXmlParsers();

    }
}
