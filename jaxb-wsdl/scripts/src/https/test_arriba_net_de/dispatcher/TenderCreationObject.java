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
 * <p>Java-Klasse für TenderCreationObject complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TenderCreationObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Project_Config" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ProjectConfig"/>
 *         &lt;element name="Tender_Config" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}TenderConfig"/>
 *         &lt;element name="Dates_Config" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DatesConfig"/>
 *         &lt;element name="Bidder_Config" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}Bidder_Config"/>
 *         &lt;element name="session_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="is_auto_tender" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderCreationObject", propOrder = {

})
public class TenderCreationObject {

    @XmlElement(name = "Project_Config", required = true)
    protected ProjectConfig projectConfig;
    @XmlElement(name = "Tender_Config", required = true)
    protected TenderConfig tenderConfig;
    @XmlElement(name = "Dates_Config", required = true)
    protected DatesConfig datesConfig;
    @XmlElement(name = "Bidder_Config", required = true)
    protected BidderConfig bidderConfig;
    @XmlElement(name = "session_id", required = true)
    protected String sessionId;
    @XmlElement(name = "is_auto_tender")
    protected boolean isAutoTender;

    /**
     * Ruft den Wert der projectConfig-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProjectConfig }
     *     
     */
    public ProjectConfig getProjectConfig() {
        return projectConfig;
    }

    /**
     * Legt den Wert der projectConfig-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectConfig }
     *     
     */
    public void setProjectConfig(ProjectConfig value) {
        this.projectConfig = value;
    }

    /**
     * Ruft den Wert der tenderConfig-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TenderConfig }
     *     
     */
    public TenderConfig getTenderConfig() {
        return tenderConfig;
    }

    /**
     * Legt den Wert der tenderConfig-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderConfig }
     *     
     */
    public void setTenderConfig(TenderConfig value) {
        this.tenderConfig = value;
    }

    /**
     * Ruft den Wert der datesConfig-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DatesConfig }
     *     
     */
    public DatesConfig getDatesConfig() {
        return datesConfig;
    }

    /**
     * Legt den Wert der datesConfig-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DatesConfig }
     *     
     */
    public void setDatesConfig(DatesConfig value) {
        this.datesConfig = value;
    }

    /**
     * Ruft den Wert der bidderConfig-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BidderConfig }
     *     
     */
    public BidderConfig getBidderConfig() {
        return bidderConfig;
    }

    /**
     * Legt den Wert der bidderConfig-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BidderConfig }
     *     
     */
    public void setBidderConfig(BidderConfig value) {
        this.bidderConfig = value;
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
     * Ruft den Wert der isAutoTender-Eigenschaft ab.
     * 
     */
    public boolean isIsAutoTender() {
        return isAutoTender;
    }

    /**
     * Legt den Wert der isAutoTender-Eigenschaft fest.
     * 
     */
    public void setIsAutoTender(boolean value) {
        this.isAutoTender = value;
    }

}
