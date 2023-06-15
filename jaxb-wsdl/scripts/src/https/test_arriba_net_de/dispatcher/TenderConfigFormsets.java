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
 * <p>Java-Klasse für TenderConfig_Formsets complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TenderConfig_Formsets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="fs_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fs_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderConfig_Formsets", propOrder = {

})
public class TenderConfigFormsets {

    @XmlElement(name = "fs_name", required = true)
    protected String fsName;
    @XmlElement(name = "fs_id")
    protected int fsId;

    /**
     * Ruft den Wert der fsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsName() {
        return fsName;
    }

    /**
     * Legt den Wert der fsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsName(String value) {
        this.fsName = value;
    }

    /**
     * Ruft den Wert der fsId-Eigenschaft ab.
     * 
     */
    public int getFsId() {
        return fsId;
    }

    /**
     * Legt den Wert der fsId-Eigenschaft fest.
     * 
     */
    public void setFsId(int value) {
        this.fsId = value;
    }

}
