
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CSBF complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CSBF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Koordinator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="csbf_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSBF", propOrder = {

})
public class CSBF {

    @XmlElement(name = "Koordinator", required = true)
    protected String koordinator;
    @XmlElement(name = "csbf_id", required = true)
    protected String csbfId;

    /**
     * Ruft den Wert der koordinator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoordinator() {
        return koordinator;
    }

    /**
     * Legt den Wert der koordinator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoordinator(String value) {
        this.koordinator = value;
    }

    /**
     * Ruft den Wert der csbfId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsbfId() {
        return csbfId;
    }

    /**
     * Legt den Wert der csbfId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsbfId(String value) {
        this.csbfId = value;
    }

}
