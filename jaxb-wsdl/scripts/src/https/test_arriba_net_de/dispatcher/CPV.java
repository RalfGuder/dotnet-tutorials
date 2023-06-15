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
 * <p>Java-Klasse für CPV complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CPV">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="cpv_nr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpv_bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
