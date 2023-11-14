
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SuccessfulBidderSearchParams complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SuccessfulBidderSearchParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="project_nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tender_nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="losnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="session_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
