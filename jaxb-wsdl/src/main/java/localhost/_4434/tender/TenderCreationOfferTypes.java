
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TenderCreation_OfferTypes complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TenderCreation_OfferTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ot_advanced_signature" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ot_qualified_signature" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ot_cover_sheet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ot_paper" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ot_eu_text" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderCreation_OfferTypes", propOrder = {

})
public class TenderCreationOfferTypes {

    @XmlElement(name = "ot_advanced_signature")
    protected boolean otAdvancedSignature;
    @XmlElement(name = "ot_qualified_signature")
    protected boolean otQualifiedSignature;
    @XmlElement(name = "ot_cover_sheet")
    protected boolean otCoverSheet;
    @XmlElement(name = "ot_paper")
    protected boolean otPaper;
    @XmlElement(name = "ot_eu_text")
    protected boolean otEuText;

    /**
     * Ruft den Wert der otAdvancedSignature-Eigenschaft ab.
     * 
     */
    public boolean isOtAdvancedSignature() {
        return otAdvancedSignature;
    }

    /**
     * Legt den Wert der otAdvancedSignature-Eigenschaft fest.
     * 
     */
    public void setOtAdvancedSignature(boolean value) {
        this.otAdvancedSignature = value;
    }

    /**
     * Ruft den Wert der otQualifiedSignature-Eigenschaft ab.
     * 
     */
    public boolean isOtQualifiedSignature() {
        return otQualifiedSignature;
    }

    /**
     * Legt den Wert der otQualifiedSignature-Eigenschaft fest.
     * 
     */
    public void setOtQualifiedSignature(boolean value) {
        this.otQualifiedSignature = value;
    }

    /**
     * Ruft den Wert der otCoverSheet-Eigenschaft ab.
     * 
     */
    public boolean isOtCoverSheet() {
        return otCoverSheet;
    }

    /**
     * Legt den Wert der otCoverSheet-Eigenschaft fest.
     * 
     */
    public void setOtCoverSheet(boolean value) {
        this.otCoverSheet = value;
    }

    /**
     * Ruft den Wert der otPaper-Eigenschaft ab.
     * 
     */
    public boolean isOtPaper() {
        return otPaper;
    }

    /**
     * Legt den Wert der otPaper-Eigenschaft fest.
     * 
     */
    public void setOtPaper(boolean value) {
        this.otPaper = value;
    }

    /**
     * Ruft den Wert der otEuText-Eigenschaft ab.
     * 
     */
    public boolean isOtEuText() {
        return otEuText;
    }

    /**
     * Legt den Wert der otEuText-Eigenschaft fest.
     * 
     */
    public void setOtEuText(boolean value) {
        this.otEuText = value;
    }

}
