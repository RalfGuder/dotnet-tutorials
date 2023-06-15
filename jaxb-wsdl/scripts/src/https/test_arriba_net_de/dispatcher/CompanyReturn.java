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
 * <p>Java-Klasse für CompanyReturn complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CompanyReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="platform_company_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="company_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="company_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
