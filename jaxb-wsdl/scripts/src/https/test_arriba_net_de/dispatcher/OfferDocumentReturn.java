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
 * <p>Java-Klasse für OfferDocument_return complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OfferDocument_return">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vobag_anh_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferDocument_return", propOrder = {

})
public class OfferDocumentReturn {

    @XmlElement(required = true)
    protected String filename;
    @XmlElement(name = "vobag_anh_id")
    protected int vobagAnhId;

    /**
     * Ruft den Wert der filename-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Legt den Wert der filename-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Ruft den Wert der vobagAnhId-Eigenschaft ab.
     * 
     */
    public int getVobagAnhId() {
        return vobagAnhId;
    }

    /**
     * Legt den Wert der vobagAnhId-Eigenschaft fest.
     * 
     */
    public void setVobagAnhId(int value) {
        this.vobagAnhId = value;
    }

}
