
package https.test_arriba_net_de.dispatcher;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TenderRegulation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TenderRegulation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="vergabeverfahren" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="virtual_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="is_tnw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderRegulation", propOrder = {

})
public class TenderRegulation {

    @XmlElement(required = true)
    protected String vergabeverfahren;
    @XmlElement(name = "virtual_id")
    protected int virtualId;
    @XmlElement(name = "is_tnw")
    protected boolean isTnw;

    /**
     * Ruft den Wert der vergabeverfahren-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVergabeverfahren() {
        return vergabeverfahren;
    }

    /**
     * Legt den Wert der vergabeverfahren-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVergabeverfahren(String value) {
        this.vergabeverfahren = value;
    }

    /**
     * Ruft den Wert der virtualId-Eigenschaft ab.
     * 
     */
    public int getVirtualId() {
        return virtualId;
    }

    /**
     * Legt den Wert der virtualId-Eigenschaft fest.
     * 
     */
    public void setVirtualId(int value) {
        this.virtualId = value;
    }

    /**
     * Ruft den Wert der isTnw-Eigenschaft ab.
     * 
     */
    public boolean isIsTnw() {
        return isTnw;
    }

    /**
     * Legt den Wert der isTnw-Eigenschaft fest.
     * 
     */
    public void setIsTnw(boolean value) {
        this.isTnw = value;
    }

}
