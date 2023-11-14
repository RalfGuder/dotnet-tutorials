
package https.test_arriba_net_de.dispatcher;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CPV complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CPV"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="cpv_nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cpv_bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPV", propOrder = {

})
public class CPV {

    @XmlElement(name = "cpv_nr", required = true)
    protected String cpvNr;
    @XmlElement(name = "cpv_bezeichnung", required = true)
    protected String cpvBezeichnung;

    /**
     * Ruft den Wert der cpvNr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpvNr() {
        return cpvNr;
    }

    /**
     * Legt den Wert der cpvNr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpvNr(String value) {
        this.cpvNr = value;
    }

    /**
     * Ruft den Wert der cpvBezeichnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpvBezeichnung() {
        return cpvBezeichnung;
    }

    /**
     * Legt den Wert der cpvBezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpvBezeichnung(String value) {
        this.cpvBezeichnung = value;
    }

}
