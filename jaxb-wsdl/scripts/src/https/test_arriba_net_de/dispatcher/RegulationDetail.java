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
 * <p>Java-Klasse für RegulationDetail complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegulationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="detail_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="regulation_label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="is_framecontract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulationDetail", propOrder = {

})
public class RegulationDetail {

    @XmlElement(name = "detail_id")
    protected int detailId;
    @XmlElement(name = "regulation_label", required = true)
    protected String regulationLabel;
    @XmlElement(name = "is_framecontract")
    protected boolean isFramecontract;

    /**
     * Ruft den Wert der detailId-Eigenschaft ab.
     * 
     */
    public int getDetailId() {
        return detailId;
    }

    /**
     * Legt den Wert der detailId-Eigenschaft fest.
     * 
     */
    public void setDetailId(int value) {
        this.detailId = value;
    }

    /**
     * Ruft den Wert der regulationLabel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationLabel() {
        return regulationLabel;
    }

    /**
     * Legt den Wert der regulationLabel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationLabel(String value) {
        this.regulationLabel = value;
    }

    /**
     * Ruft den Wert der isFramecontract-Eigenschaft ab.
     * 
     */
    public boolean isIsFramecontract() {
        return isFramecontract;
    }

    /**
     * Legt den Wert der isFramecontract-Eigenschaft fest.
     * 
     */
    public void setIsFramecontract(boolean value) {
        this.isFramecontract = value;
    }

}
