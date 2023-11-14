
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TenderConfig_Formsets complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TenderConfig_Formsets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="fs_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fs_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
