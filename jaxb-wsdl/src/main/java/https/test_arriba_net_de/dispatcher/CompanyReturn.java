
package https.test_arriba_net_de.dispatcher;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CompanyReturn complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CompanyReturn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="platform_company_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="company_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="company_zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="company_location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="company_street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="company_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyReturn", propOrder = {

})
public class CompanyReturn {

    @XmlElement(name = "platform_company_id")
    protected int platformCompanyId;
    @XmlElement(name = "company_name", required = true)
    protected String companyName;
    @XmlElement(name = "company_zipcode", required = true)
    protected String companyZipcode;
    @XmlElement(name = "company_location", required = true)
    protected String companyLocation;
    @XmlElement(name = "company_street", required = true)
    protected String companyStreet;
    @XmlElement(name = "company_id")
    protected int companyId;

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
     * Ruft den Wert der companyName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Legt den Wert der companyName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Ruft den Wert der companyZipcode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyZipcode() {
        return companyZipcode;
    }

    /**
     * Legt den Wert der companyZipcode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyZipcode(String value) {
        this.companyZipcode = value;
    }

    /**
     * Ruft den Wert der companyLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyLocation() {
        return companyLocation;
    }

    /**
     * Legt den Wert der companyLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyLocation(String value) {
        this.companyLocation = value;
    }

    /**
     * Ruft den Wert der companyStreet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyStreet() {
        return companyStreet;
    }

    /**
     * Legt den Wert der companyStreet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyStreet(String value) {
        this.companyStreet = value;
    }

    /**
     * Ruft den Wert der companyId-Eigenschaft ab.
     * 
     */
    public int getCompanyId() {
        return companyId;
    }

    /**
     * Legt den Wert der companyId-Eigenschaft fest.
     * 
     */
    public void setCompanyId(int value) {
        this.companyId = value;
    }

}
