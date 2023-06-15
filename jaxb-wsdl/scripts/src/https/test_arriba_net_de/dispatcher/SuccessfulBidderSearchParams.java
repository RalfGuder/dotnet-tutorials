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
 * <p>Java-Klasse für SuccessfulBidderSearchParams complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SuccessfulBidderSearchParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="project_nr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tender_nr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="losnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="session_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuccessfulBidderSearchParams", propOrder = {

})
public class SuccessfulBidderSearchParams {

    @XmlElement(name = "project_nr", required = true)
    protected String projectNr;
    @XmlElement(name = "tender_nr", required = true)
    protected String tenderNr;
    protected int losnummer;
    @XmlElement(name = "session_id", required = true)
    protected String sessionId;

    /**
     * Ruft den Wert der projectNr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectNr() {
        return projectNr;
    }

    /**
     * Legt den Wert der projectNr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectNr(String value) {
        this.projectNr = value;
    }

    /**
     * Ruft den Wert der tenderNr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderNr() {
        return tenderNr;
    }

    /**
     * Legt den Wert der tenderNr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderNr(String value) {
        this.tenderNr = value;
    }

    /**
     * Ruft den Wert der losnummer-Eigenschaft ab.
     * 
     */
    public int getLosnummer() {
        return losnummer;
    }

    /**
     * Legt den Wert der losnummer-Eigenschaft fest.
     * 
     */
    public void setLosnummer(int value) {
        this.losnummer = value;
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

}
