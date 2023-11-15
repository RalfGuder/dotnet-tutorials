
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ProjectConfig complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProjectConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="NamePrj" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LblPrj" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Descrip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AddText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_LocPrj" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="verfuegbare_mittel" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ungebundene_vorgesehene_mittel" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectConfig", propOrder = {

})
public class ProjectConfig {

    @XmlElement(name = "NamePrj", required = true)
    protected String namePrj;
    @XmlElement(name = "LblPrj", required = true)
    protected String lblPrj;
    @XmlElement(name = "Descrip", required = true)
    protected String descrip;
    @XmlElement(name = "AddText", required = true)
    protected String addText;
    @XmlElement(name = "_LocPrj", required = true)
    protected String locPrj;
    @XmlElement(name = "verfuegbare_mittel")
    protected float verfuegbareMittel;
    @XmlElement(name = "ungebundene_vorgesehene_mittel")
    protected float ungebundeneVorgeseheneMittel;

    /**
     * Ruft den Wert der namePrj-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrj() {
        return namePrj;
    }

    /**
     * Legt den Wert der namePrj-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrj(String value) {
        this.namePrj = value;
    }

    /**
     * Ruft den Wert der lblPrj-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLblPrj() {
        return lblPrj;
    }

    /**
     * Legt den Wert der lblPrj-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLblPrj(String value) {
        this.lblPrj = value;
    }

    /**
     * Ruft den Wert der descrip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrip() {
        return descrip;
    }

    /**
     * Legt den Wert der descrip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrip(String value) {
        this.descrip = value;
    }

    /**
     * Ruft den Wert der addText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddText() {
        return addText;
    }

    /**
     * Legt den Wert der addText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddText(String value) {
        this.addText = value;
    }

    /**
     * Ruft den Wert der locPrj-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocPrj() {
        return locPrj;
    }

    /**
     * Legt den Wert der locPrj-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocPrj(String value) {
        this.locPrj = value;
    }

    /**
     * Ruft den Wert der verfuegbareMittel-Eigenschaft ab.
     * 
     */
    public float getVerfuegbareMittel() {
        return verfuegbareMittel;
    }

    /**
     * Legt den Wert der verfuegbareMittel-Eigenschaft fest.
     * 
     */
    public void setVerfuegbareMittel(float value) {
        this.verfuegbareMittel = value;
    }

    /**
     * Ruft den Wert der ungebundeneVorgeseheneMittel-Eigenschaft ab.
     * 
     */
    public float getUngebundeneVorgeseheneMittel() {
        return ungebundeneVorgeseheneMittel;
    }

    /**
     * Legt den Wert der ungebundeneVorgeseheneMittel-Eigenschaft fest.
     * 
     */
    public void setUngebundeneVorgeseheneMittel(float value) {
        this.ungebundeneVorgeseheneMittel = value;
    }

}
