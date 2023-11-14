
package https.test_arriba_net_de.dispatcher;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DatesConfig complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DatesConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CnstStart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CnstEnd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_SendDate" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DateTime"/&gt;
 *         &lt;element name="OpenDateTime" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DateTime"/&gt;
 *         &lt;element name="EvalEnd" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DateTime"/&gt;
 *         &lt;element name="_PartCompDateTime" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DateTime"/&gt;
 *         &lt;element name="_ApplyPeriodStart" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DateTime"/&gt;
 *         &lt;element name="_ApplyPeriodEnd" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DateTime"/&gt;
 *         &lt;element name="vertragslaufzeit_angabe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ag_dauer_einheit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ag_dauer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ag_dauer_spanne_beginn" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DateTime"/&gt;
 *         &lt;element name="ag_dauer_spanne_ende" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DateTime"/&gt;
 *         &lt;element name="_OfferDeadline" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DateTime"/&gt;
 *         &lt;element name="fristverkuerzung" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fristverkuerzung_begruendung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="frist_schriftl_anfragen" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DateTime"/&gt;
 *         &lt;element name="frist_schrift_frag_tnw_folgend" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DateTime"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatesConfig", propOrder = {

})
public class DatesConfig {

    @XmlElement(name = "CnstStart", required = true)
    protected String cnstStart;
    @XmlElement(name = "CnstEnd", required = true)
    protected String cnstEnd;
    @XmlElement(name = "_SendDate", required = true)
    protected DateTime sendDate;
    @XmlElement(name = "OpenDateTime", required = true)
    protected DateTime openDateTime;
    @XmlElement(name = "EvalEnd", required = true)
    protected DateTime evalEnd;
    @XmlElement(name = "_PartCompDateTime", required = true)
    protected DateTime partCompDateTime;
    @XmlElement(name = "_ApplyPeriodStart", required = true)
    protected DateTime applyPeriodStart;
    @XmlElement(name = "_ApplyPeriodEnd", required = true)
    protected DateTime applyPeriodEnd;
    @XmlElement(name = "vertragslaufzeit_angabe", required = true)
    protected String vertragslaufzeitAngabe;
    @XmlElement(name = "ag_dauer_einheit", required = true)
    protected String agDauerEinheit;
    @XmlElement(name = "ag_dauer")
    protected int agDauer;
    @XmlElement(name = "ag_dauer_spanne_beginn", required = true)
    protected DateTime agDauerSpanneBeginn;
    @XmlElement(name = "ag_dauer_spanne_ende", required = true)
    protected DateTime agDauerSpanneEnde;
    @XmlElement(name = "_OfferDeadline", required = true)
    protected DateTime offerDeadline;
    protected int fristverkuerzung;
    @XmlElement(name = "fristverkuerzung_begruendung", required = true)
    protected String fristverkuerzungBegruendung;
    @XmlElement(name = "frist_schriftl_anfragen", required = true)
    protected DateTime fristSchriftlAnfragen;
    @XmlElement(name = "frist_schrift_frag_tnw_folgend", required = true)
    protected DateTime fristSchriftFragTnwFolgend;

    /**
     * Ruft den Wert der cnstStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnstStart() {
        return cnstStart;
    }

    /**
     * Legt den Wert der cnstStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnstStart(String value) {
        this.cnstStart = value;
    }

    /**
     * Ruft den Wert der cnstEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnstEnd() {
        return cnstEnd;
    }

    /**
     * Legt den Wert der cnstEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnstEnd(String value) {
        this.cnstEnd = value;
    }

    /**
     * Ruft den Wert der sendDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getSendDate() {
        return sendDate;
    }

    /**
     * Legt den Wert der sendDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setSendDate(DateTime value) {
        this.sendDate = value;
    }

    /**
     * Ruft den Wert der openDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getOpenDateTime() {
        return openDateTime;
    }

    /**
     * Legt den Wert der openDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setOpenDateTime(DateTime value) {
        this.openDateTime = value;
    }

    /**
     * Ruft den Wert der evalEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEvalEnd() {
        return evalEnd;
    }

    /**
     * Legt den Wert der evalEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEvalEnd(DateTime value) {
        this.evalEnd = value;
    }

    /**
     * Ruft den Wert der partCompDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getPartCompDateTime() {
        return partCompDateTime;
    }

    /**
     * Legt den Wert der partCompDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setPartCompDateTime(DateTime value) {
        this.partCompDateTime = value;
    }

    /**
     * Ruft den Wert der applyPeriodStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getApplyPeriodStart() {
        return applyPeriodStart;
    }

    /**
     * Legt den Wert der applyPeriodStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setApplyPeriodStart(DateTime value) {
        this.applyPeriodStart = value;
    }

    /**
     * Ruft den Wert der applyPeriodEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getApplyPeriodEnd() {
        return applyPeriodEnd;
    }

    /**
     * Legt den Wert der applyPeriodEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setApplyPeriodEnd(DateTime value) {
        this.applyPeriodEnd = value;
    }

    /**
     * Ruft den Wert der vertragslaufzeitAngabe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVertragslaufzeitAngabe() {
        return vertragslaufzeitAngabe;
    }

    /**
     * Legt den Wert der vertragslaufzeitAngabe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVertragslaufzeitAngabe(String value) {
        this.vertragslaufzeitAngabe = value;
    }

    /**
     * Ruft den Wert der agDauerEinheit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgDauerEinheit() {
        return agDauerEinheit;
    }

    /**
     * Legt den Wert der agDauerEinheit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgDauerEinheit(String value) {
        this.agDauerEinheit = value;
    }

    /**
     * Ruft den Wert der agDauer-Eigenschaft ab.
     * 
     */
    public int getAgDauer() {
        return agDauer;
    }

    /**
     * Legt den Wert der agDauer-Eigenschaft fest.
     * 
     */
    public void setAgDauer(int value) {
        this.agDauer = value;
    }

    /**
     * Ruft den Wert der agDauerSpanneBeginn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getAgDauerSpanneBeginn() {
        return agDauerSpanneBeginn;
    }

    /**
     * Legt den Wert der agDauerSpanneBeginn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setAgDauerSpanneBeginn(DateTime value) {
        this.agDauerSpanneBeginn = value;
    }

    /**
     * Ruft den Wert der agDauerSpanneEnde-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getAgDauerSpanneEnde() {
        return agDauerSpanneEnde;
    }

    /**
     * Legt den Wert der agDauerSpanneEnde-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setAgDauerSpanneEnde(DateTime value) {
        this.agDauerSpanneEnde = value;
    }

    /**
     * Ruft den Wert der offerDeadline-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getOfferDeadline() {
        return offerDeadline;
    }

    /**
     * Legt den Wert der offerDeadline-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setOfferDeadline(DateTime value) {
        this.offerDeadline = value;
    }

    /**
     * Ruft den Wert der fristverkuerzung-Eigenschaft ab.
     * 
     */
    public int getFristverkuerzung() {
        return fristverkuerzung;
    }

    /**
     * Legt den Wert der fristverkuerzung-Eigenschaft fest.
     * 
     */
    public void setFristverkuerzung(int value) {
        this.fristverkuerzung = value;
    }

    /**
     * Ruft den Wert der fristverkuerzungBegruendung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFristverkuerzungBegruendung() {
        return fristverkuerzungBegruendung;
    }

    /**
     * Legt den Wert der fristverkuerzungBegruendung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFristverkuerzungBegruendung(String value) {
        this.fristverkuerzungBegruendung = value;
    }

    /**
     * Ruft den Wert der fristSchriftlAnfragen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getFristSchriftlAnfragen() {
        return fristSchriftlAnfragen;
    }

    /**
     * Legt den Wert der fristSchriftlAnfragen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setFristSchriftlAnfragen(DateTime value) {
        this.fristSchriftlAnfragen = value;
    }

    /**
     * Ruft den Wert der fristSchriftFragTnwFolgend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getFristSchriftFragTnwFolgend() {
        return fristSchriftFragTnwFolgend;
    }

    /**
     * Legt den Wert der fristSchriftFragTnwFolgend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setFristSchriftFragTnwFolgend(DateTime value) {
        this.fristSchriftFragTnwFolgend = value;
    }

}
