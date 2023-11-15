
package https.test_arriba_net_de.dispatcher;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TenderCreationObject complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TenderCreationObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Project_Config" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ProjectConfig"/&gt;
 *         &lt;element name="Tender_Config" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}TenderConfig"/&gt;
 *         &lt;element name="Dates_Config" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DatesConfig"/&gt;
 *         &lt;element name="Bidder_Config" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}Bidder_Config"/&gt;
 *         &lt;element name="session_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="is_auto_tender" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
