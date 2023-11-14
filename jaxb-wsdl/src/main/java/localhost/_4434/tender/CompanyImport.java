
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CompanyImport complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CompanyImport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="platform_company_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hhv_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bidder_nr" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="anrede" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ust_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="firmenname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="plz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="land" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyImport", propOrder = {

})
public class CompanyImport {

    @XmlElement(name = "platform_company_id")
    protected int platformCompanyId;
    @XmlElement(name = "hhv_id")
    protected int hhvId;
    @XmlElement(name = "bidder_nr")
    protected int bidderNr;
    @XmlElement(required = true)
    protected String anrede;
    @XmlElement(required = true)
    protected String vname;
    @XmlElement(required = true)
    protected String nname;
    @XmlElement(name = "ust_id", required = true)
    protected String ustId;
    @XmlElement(required = true)
    protected String firmenname;
    @XmlElement(required = true)
    protected String strasse;
    @XmlElement(required = true)
    protected String plz;
    @XmlElement(required = true)
    protected String ort;
    @XmlElement(required = true)
    protected String tel;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String land;

    /**
     * Ruft den Wert der platformCompanyId-Eigenschaft ab.
     * 
     */
    public int getPlatformCompanyId() {
        return platformCompanyId;
    }

    /**
     * Legt den Wert der platformCompanyId-Eigenschaft fest.
     * 
     */
    public void setPlatformCompanyId(int value) {
        this.platformCompanyId = value;
    }

    /**
     * Ruft den Wert der hhvId-Eigenschaft ab.
     * 
     */
    public int getHhvId() {
        return hhvId;
    }

    /**
     * Legt den Wert der hhvId-Eigenschaft fest.
     * 
     */
    public void setHhvId(int value) {
        this.hhvId = value;
    }

    /**
     * Ruft den Wert der bidderNr-Eigenschaft ab.
     * 
     */
    public int getBidderNr() {
        return bidderNr;
    }

    /**
     * Legt den Wert der bidderNr-Eigenschaft fest.
     * 
     */
    public void setBidderNr(int value) {
        this.bidderNr = value;
    }

    /**
     * Ruft den Wert der anrede-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnrede() {
        return anrede;
    }

    /**
     * Legt den Wert der anrede-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnrede(String value) {
        this.anrede = value;
    }

    /**
     * Ruft den Wert der vname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVname() {
        return vname;
    }

    /**
     * Legt den Wert der vname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVname(String value) {
        this.vname = value;
    }

    /**
     * Ruft den Wert der nname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNname() {
        return nname;
    }

    /**
     * Legt den Wert der nname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNname(String value) {
        this.nname = value;
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

    /**
     * Ruft den Wert der firmenname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmenname() {
        return firmenname;
    }

    /**
     * Legt den Wert der firmenname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmenname(String value) {
        this.firmenname = value;
    }

    /**
     * Ruft den Wert der strasse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * Legt den Wert der strasse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrasse(String value) {
        this.strasse = value;
    }

    /**
     * Ruft den Wert der plz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlz() {
        return plz;
    }

    /**
     * Legt den Wert der plz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlz(String value) {
        this.plz = value;
    }

    /**
     * Ruft den Wert der ort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Legt den Wert der ort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Ruft den Wert der tel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Legt den Wert der tel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Ruft den Wert der email-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Legt den Wert der email-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Ruft den Wert der land-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLand() {
        return land;
    }

    /**
     * Legt den Wert der land-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLand(String value) {
        this.land = value;
    }

}
