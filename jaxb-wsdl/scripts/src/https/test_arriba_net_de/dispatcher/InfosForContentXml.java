//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.06.21 um 04:00:26 PM CEST 
//


package https.test_arriba_net_de.dispatcher;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InfosForContentXml complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InfosForContentXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Gaeb_return" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfGaeb_return"/>
 *         &lt;element name="OfferDocument_return" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}OfferDocument_return"/>
 *         &lt;element name="vobag_lv_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfosForContentXml", propOrder = {

})
public class InfosForContentXml {

    @XmlElement(name = "Gaeb_return", required = true)
    protected ArrayOfGaebReturn gaebReturn;
    @XmlElement(name = "OfferDocument_return", required = true)
    protected OfferDocumentReturn offerDocumentReturn;
    @XmlElement(name = "vobag_lv_id")
    protected int vobagLvId;

    /**
     * Ruft den Wert der gaebReturn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGaebReturn }
     *     
     */
    public ArrayOfGaebReturn getGaebReturn() {
        return gaebReturn;
    }

    /**
     * Legt den Wert der gaebReturn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGaebReturn }
     *     
     */
    public void setGaebReturn(ArrayOfGaebReturn value) {
        this.gaebReturn = value;
    }

    /**
     * Ruft den Wert der offerDocumentReturn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OfferDocumentReturn }
     *     
     */
    public OfferDocumentReturn getOfferDocumentReturn() {
        return offerDocumentReturn;
    }

    /**
     * Legt den Wert der offerDocumentReturn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDocumentReturn }
     *     
     */
    public void setOfferDocumentReturn(OfferDocumentReturn value) {
        this.offerDocumentReturn = value;
    }

    /**
     * Ruft den Wert der vobagLvId-Eigenschaft ab.
     * 
     */
    public int getVobagLvId() {
        return vobagLvId;
    }

    /**
     * Legt den Wert der vobagLvId-Eigenschaft fest.
     * 
     */
    public void setVobagLvId(int value) {
        this.vobagLvId = value;
    }

}
