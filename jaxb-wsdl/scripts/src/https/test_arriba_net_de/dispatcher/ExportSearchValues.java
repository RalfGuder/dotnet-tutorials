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
 * <p>Java-Klasse für Export_Search_values complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Export_Search_values">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="project_nr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tender_nr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status_filter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status_changed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="find_deleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
