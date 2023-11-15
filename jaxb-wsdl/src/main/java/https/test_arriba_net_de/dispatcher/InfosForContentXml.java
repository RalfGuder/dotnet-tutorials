
package https.test_arriba_net_de.dispatcher;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InfosForContentXml complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InfosForContentXml"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Gaeb_return" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfGaeb_return"/&gt;
 *         &lt;element name="OfferDocument_return" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}OfferDocument_return"/&gt;
 *         &lt;element name="vobag_lv_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
