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
 * <p>Java-Klasse für Gaeb_return complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Gaeb_return">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vobag_anh_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="losnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="los_anh_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gaeb_return", propOrder = {

})
public class GaebReturn {

    @XmlElement(required = true)
    protected String filename;
    @XmlElement(name = "vobag_anh_id")
    protected int vobagAnhId;
    protected int losnummer;
    @XmlElement(name = "los_anh_id")
    protected int losAnhId;

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

    /**
     * Ruft den Wert der losnummer-Eigenschaft ab.
     * 
     */
    public int getLosnummer() {
        return losnummer;
    }

    /**
     * Legt den Wert der losnummer-Eigenschaft fest.
     * 
     */
    public void setLosnummer(int value) {
        this.losnummer = value;
    }

    /**
     * Ruft den Wert der losAnhId-Eigenschaft ab.
     * 
     */
    public int getLosAnhId() {
        return losAnhId;
    }

    /**
     * Legt den Wert der losAnhId-Eigenschaft fest.
     * 
     */
    public void setLosAnhId(int value) {
        this.losAnhId = value;
    }

}
