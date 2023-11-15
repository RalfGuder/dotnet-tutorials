
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Company complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Company"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Name1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_SummeAuftrag" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="_NachlassAngebot" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="_AngebotsDatum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ust_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company", propOrder = {

})
public class Company {

    @XmlElement(name = "Name1", required = true)
    protected String name1;
    @XmlElement(name = "Street", required = true)
    protected String street;
    @XmlElement(name = "PCode", required = true)
    protected String pCode;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "_SummeAuftrag")
    protected float summeAuftrag;
    @XmlElement(name = "_NachlassAngebot")
    protected float nachlassAngebot;
    @XmlElement(name = "_AngebotsDatum", required = true)
    protected String angebotsDatum;
    @XmlElement(name = "ust_id", required = true)
    protected String ustId;

    /**
     * Ruft den Wert der name1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * Legt den Wert der name1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * Ruft den Wert der street-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Legt den Wert der street-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Ruft den Wert der pCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCode() {
        return pCode;
    }

    /**
     * Legt den Wert der pCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCode(String value) {
        this.pCode = value;
    }

    /**
     * Ruft den Wert der city-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Legt den Wert der city-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Ruft den Wert der summeAuftrag-Eigenschaft ab.
     * 
     */
    public float getSummeAuftrag() {
        return summeAuftrag;
    }

    /**
     * Legt den Wert der summeAuftrag-Eigenschaft fest.
     * 
     */
    public void setSummeAuftrag(float value) {
        this.summeAuftrag = value;
    }

    /**
     * Ruft den Wert der nachlassAngebot-Eigenschaft ab.
     * 
     */
    public float getNachlassAngebot() {
        return nachlassAngebot;
    }

    /**
     * Legt den Wert der nachlassAngebot-Eigenschaft fest.
     * 
     */
    public void setNachlassAngebot(float value) {
        this.nachlassAngebot = value;
    }

    /**
     * Ruft den Wert der angebotsDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAngebotsDatum() {
        return angebotsDatum;
    }

    /**
     * Legt den Wert der angebotsDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAngebotsDatum(String value) {
        this.angebotsDatum = value;
    }

    /**
     * Ruft den Wert der ustId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUstId() {
        return ustId;
    }

    /**
     * Legt den Wert der ustId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUstId(String value) {
        this.ustId = value;
    }

}
