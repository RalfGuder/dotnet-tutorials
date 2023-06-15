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
 * <p>Java-Klasse für ProjectConfig complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProjectConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="NamePrj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LblPrj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Descrip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AddText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_LocPrj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="verfuegbare_mittel" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ungebundene_vorgesehene_mittel" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
