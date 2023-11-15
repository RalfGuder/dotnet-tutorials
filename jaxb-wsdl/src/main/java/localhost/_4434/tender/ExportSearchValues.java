
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Export_Search_values complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Export_Search_values"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="project_nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tender_nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status_filter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status_changed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="find_deleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "Export_Search_values", propOrder = {

})
public class ExportSearchValues {

    @XmlElement(name = "project_nr", required = true)
    protected String projectNr;
    @XmlElement(name = "tender_nr", required = true)
    protected String tenderNr;
    @XmlElement(name = "status_filter", required = true)
    protected String statusFilter;
    @XmlElement(name = "status_changed", required = true)
    protected String statusChanged;
    @XmlElement(name = "find_deleted")
    protected boolean findDeleted;
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
     * Ruft den Wert der statusFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusFilter() {
        return statusFilter;
    }

    /**
     * Legt den Wert der statusFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusFilter(String value) {
        this.statusFilter = value;
    }

    /**
     * Ruft den Wert der statusChanged-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusChanged() {
        return statusChanged;
    }

    /**
     * Legt den Wert der statusChanged-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusChanged(String value) {
        this.statusChanged = value;
    }

    /**
     * Ruft den Wert der findDeleted-Eigenschaft ab.
     * 
     */
    public boolean isFindDeleted() {
        return findDeleted;
    }

    /**
     * Legt den Wert der findDeleted-Eigenschaft fest.
     * 
     */
    public void setFindDeleted(boolean value) {
        this.findDeleted = value;
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
