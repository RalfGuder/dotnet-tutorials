
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RegulationDetail complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegulationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="detail_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="regulation_label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="is_framecontract" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
