
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SuccessfulBidderParams complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SuccessfulBidderParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="vobag_vergabe_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="firmenname1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="firmenname2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="plz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tel1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="company_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ust_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gepruefte_summe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="auftragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vobag_auswertung_details_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="vobag_auswertung_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="vobag_lv_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="session_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuccessfulBidderParams", propOrder = {

})
public class SuccessfulBidderParams {

    @XmlElement(name = "vobag_vergabe_id", required = true)
    protected String vobagVergabeId;
    @XmlElement(required = true)
    protected String firmenname1;
    @XmlElement(required = true)
    protected String firmenname2;
    @XmlElement(required = true)
    protected String strasse;
    @XmlElement(required = true)
    protected String plz;
    @XmlElement(required = true)
    protected String ort;
    @XmlElement(required = true)
    protected String tel1;
    @XmlElement(required = true)
    protected String fax;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(name = "company_id", required = true)
    protected String companyId;
    @XmlElement(name = "ust_id", required = true)
    protected String ustId;
    @XmlElement(name = "gepruefte_summe", required = true)
    protected String gepruefteSumme;
    @XmlElement(required = true)
    protected String auftragsnummer;
    @XmlElement(name = "vobag_auswertung_details_id")
    protected int vobagAuswertungDetailsId;
    @XmlElement(name = "vobag_auswertung_id")
    protected int vobagAuswertungId;
    @XmlElement(name = "vobag_lv_id")
    protected int vobagLvId;
    @XmlElement(name = "session_id", required = true)
    protected String sessionId;
    @XmlElement(required = true)
    protected String error;

    /**
     * Ruft den Wert der vobagVergabeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVobagVergabeId() {
        return vobagVergabeId;
    }

    /**
     * Legt den Wert der vobagVergabeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVobagVergabeId(String value) {
        this.vobagVergabeId = value;
    }

    /**
     * Ruft den Wert der firmenname1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmenname1() {
        return firmenname1;
    }

    /**
     * Legt den Wert der firmenname1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmenname1(String value) {
        this.firmenname1 = value;
    }

    /**
     * Ruft den Wert der firmenname2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmenname2() {
        return firmenname2;
    }

    /**
     * Legt den Wert der firmenname2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmenname2(String value) {
        this.firmenname2 = value;
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
     * Ruft den Wert der tel1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel1() {
        return tel1;
    }

    /**
     * Legt den Wert der tel1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel1(String value) {
        this.tel1 = value;
    }

    /**
     * Ruft den Wert der fax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Legt den Wert der fax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
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
     * Ruft den Wert der companyId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Legt den Wert der companyId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
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
     * Ruft den Wert der gepruefteSumme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGepruefteSumme() {
        return gepruefteSumme;
    }

    /**
     * Legt den Wert der gepruefteSumme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGepruefteSumme(String value) {
        this.gepruefteSumme = value;
    }

    /**
     * Ruft den Wert der auftragsnummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuftragsnummer() {
        return auftragsnummer;
    }

    /**
     * Legt den Wert der auftragsnummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuftragsnummer(String value) {
        this.auftragsnummer = value;
    }

    /**
     * Ruft den Wert der vobagAuswertungDetailsId-Eigenschaft ab.
     * 
     */
    public int getVobagAuswertungDetailsId() {
        return vobagAuswertungDetailsId;
    }

    /**
     * Legt den Wert der vobagAuswertungDetailsId-Eigenschaft fest.
     * 
     */
    public void setVobagAuswertungDetailsId(int value) {
        this.vobagAuswertungDetailsId = value;
    }

    /**
     * Ruft den Wert der vobagAuswertungId-Eigenschaft ab.
     * 
     */
    public int getVobagAuswertungId() {
        return vobagAuswertungId;
    }

    /**
     * Legt den Wert der vobagAuswertungId-Eigenschaft fest.
     * 
     */
    public void setVobagAuswertungId(int value) {
        this.vobagAuswertungId = value;
    }

    /**
     * Ruft den Wert der vobagLvId-Eigenschaft ab.
     * 
     */
    public int getVobagLvId() {
        return vobagLvId;
    }

    /**
     * Legt den Wert der vobagLvId-Eigenschaft fest.
     * 
     */
    public void setVobagLvId(int value) {
        this.vobagLvId = value;
    }

    /**
     * Ruft den Wert der sessionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Legt den Wert der sessionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Ruft den Wert der error-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Legt den Wert der error-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

}
