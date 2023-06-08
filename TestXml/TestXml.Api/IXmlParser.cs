using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Gudchensoft.TestXml.Api
{
	///<summary>
	///Schnittstelle für den Parser
	///</summary>
	public interface IXmlParser
	{
		/**
		 * <summary>Xml-Informationen einlesen</summary>
		 * <remarks>
		 * Der Parser durchläuft den <b>reader</b> solange, bis das Tag-Ende erreicht ist.
		 * </remarks>
		 * <param name="reader">Instanz vom Typ <c>System.Xml.XmlReader</c>
		 * </param>
		 */
		void Parse(System.Xml.XmlReader reader);

		/**
		 * <summary>
		 * Eigenschaft <i>Tag-Name</i> des Xml-Elementes.
		 * </summary>
		 * <remarks>
		 * Die Instanz des Parsers kann ein bestimmtes xml-Element verarbeiten. 
		 * Der <i>Tag-Name</i> gibt den Namen des xml-Elements als Zeichenfolge an.
		 * </remarks>
		 * 
		 */
		string Tagname { get; }
	}
}
