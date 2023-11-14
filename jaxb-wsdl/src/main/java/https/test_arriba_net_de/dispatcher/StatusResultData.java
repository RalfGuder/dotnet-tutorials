
package https.test_arriba_net_de.dispatcher;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StatusResultData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StatusResultData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="project_nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tender_nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bookmark" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vergabe_status_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="vergabe_status_prosa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="opening_date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="starting_date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="end_accept_date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="regulation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EstimValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="EstimValueGross" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ungebundene_vorgesehene_mittel" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="verfuegbare_mittel" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="betrag_kostenkontrolle" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="regulation_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="is_eu" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cat_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="_Reason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="is_aufgehoben" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_AltOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_LocPrj" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="auftrags_datum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Status_csbf" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}Status"/&gt;
 *         &lt;element name="tender_deleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Lot_Tender" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfLot_Tender"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusResultData", propOrder = {

})
public class StatusResultData {

    @XmlElement(name = "project_nr", required = true)
    protected String projectNr;
    @XmlElement(name = "tender_nr", required = true)
    protected String tenderNr;
    @XmlElement(required = true)
    protected String bookmark;
    @XmlElement(name = "vergabe_status_id")
    protected int vergabeStatusId;
    @XmlElement(name = "vergabe_status_prosa", required = true)
    protected String vergabeStatusProsa;
    @XmlElement(name = "opening_date", required = true)
    protected String openingDate;
    @XmlElement(name = "starting_date", required = true)
    protected String startingDate;
    @XmlElement(name = "end_accept_date", required = true)
    protected String endAcceptDate;
    @XmlElement(required = true)
    protected String regulation;
    @XmlElement(name = "EstimValue")
    protected float estimValue;
    @XmlElement(name = "EstimValueGross")
    protected float estimValueGross;
    @XmlElement(name = "ungebundene_vorgesehene_mittel")
    protected float ungebundeneVorgeseheneMittel;
    @XmlElement(name = "verfuegbare_mittel")
    protected float verfuegbareMittel;
    @XmlElement(name = "betrag_kostenkontrolle")
    protected float betragKostenkontrolle;
    @XmlElement(name = "regulation_id")
    protected int regulationId;
    @XmlElement(name = "is_eu")
    protected boolean isEu;
    @XmlElement(required = true)
    protected String cat;
    @XmlElement(name = "cat_id")
    protected int catId;
    @XmlElement(name = "_Reason", required = true)
    protected String reason;
    @XmlElement(name = "is_aufgehoben")
    protected boolean isAufgehoben;
    @XmlElement(name = "_AltOffer")
    protected boolean altOffer;
    @XmlElement(name = "_LocPrj", required = true)
    protected String locPrj;
    @XmlElement(name = "auftrags_datum", required = true)
    protected String auftragsDatum;
    @XmlElement(name = "Status_csbf", required = true)
    protected Status statusCsbf;
    @XmlElement(name = "tender_deleted")
    protected boolean tenderDeleted;
    @XmlElement(name = "Lot_Tender", required = true)
    protected ArrayOfLotTender lotTender;

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
     * Ruft den Wert der bookmark-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookmark() {
        return bookmark;
    }

    /**
     * Legt den Wert der bookmark-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookmark(String value) {
        this.bookmark = value;
    }

    /**
     * Ruft den Wert der vergabeStatusId-Eigenschaft ab.
     * 
     */
    public int getVergabeStatusId() {
        return vergabeStatusId;
    }

    /**
     * Legt den Wert der vergabeStatusId-Eigenschaft fest.
     * 
     */
    public void setVergabeStatusId(int value) {
        this.vergabeStatusId = value;
    }

    /**
     * Ruft den Wert der vergabeStatusProsa-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVergabeStatusProsa() {
        return vergabeStatusProsa;
    }

    /**
     * Legt den Wert der vergabeStatusProsa-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVergabeStatusProsa(String value) {
        this.vergabeStatusProsa = value;
    }

    /**
     * Ruft den Wert der openingDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningDate() {
        return openingDate;
    }

    /**
     * Legt den Wert der openingDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningDate(String value) {
        this.openingDate = value;
    }

    /**
     * Ruft den Wert der startingDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingDate() {
        return startingDate;
    }

    /**
     * Legt den Wert der startingDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingDate(String value) {
        this.startingDate = value;
    }

    /**
     * Ruft den Wert der endAcceptDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndAcceptDate() {
        return endAcceptDate;
    }

    /**
     * Legt den Wert der endAcceptDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAcceptDate(String value) {
        this.endAcceptDate = value;
    }

    /**
     * Ruft den Wert der regulation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulation() {
        return regulation;
    }

    /**
     * Legt den Wert der regulation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulation(String value) {
        this.regulation = value;
    }

    /**
     * Ruft den Wert der estimValue-Eigenschaft ab.
     * 
     */
    public float getEstimValue() {
        return estimValue;
    }

    /**
     * Legt den Wert der estimValue-Eigenschaft fest.
     * 
     */
    public void setEstimValue(float value) {
        this.estimValue = value;
    }

    /**
     * Ruft den Wert der estimValueGross-Eigenschaft ab.
     * 
     */
    public float getEstimValueGross() {
        return estimValueGross;
    }

    /**
     * Legt den Wert der estimValueGross-Eigenschaft fest.
     * 
     */
    public void setEstimValueGross(float value) {
        this.estimValueGross = value;
    }

    /**
     * Ruft den Wert der ungebundeneVorgeseheneMittel-Eigenschaft ab.
     * 
     */
    public float getUngebundeneVorgeseheneMittel() {
        return ungebundeneVorgeseheneMittel;
    }

    /**
     * Legt den Wert der ungebundeneVorgeseheneMittel-Eigenschaft fest.
     * 
     */
    public void setUngebundeneVorgeseheneMittel(float value) {
        this.ungebundeneVorgeseheneMittel = value;
    }

    /**
     * Ruft den Wert der verfuegbareMittel-Eigenschaft ab.
     * 
     */
    public float getVerfuegbareMittel() {
        return verfuegbareMittel;
    }

    /**
     * Legt den Wert der verfuegbareMittel-Eigenschaft fest.
     * 
     */
    public void setVerfuegbareMittel(float value) {
        this.verfuegbareMittel = value;
    }

    /**
     * Ruft den Wert der betragKostenkontrolle-Eigenschaft ab.
     * 
     */
    public float getBetragKostenkontrolle() {
        return betragKostenkontrolle;
    }

    /**
     * Legt den Wert der betragKostenkontrolle-Eigenschaft fest.
     * 
     */
    public void setBetragKostenkontrolle(float value) {
        this.betragKostenkontrolle = value;
    }

    /**
     * Ruft den Wert der regulationId-Eigenschaft ab.
     * 
     */
    public int getRegulationId() {
        return regulationId;
    }

    /**
     * Legt den Wert der regulationId-Eigenschaft fest.
     * 
     */
    public void setRegulationId(int value) {
        this.regulationId = value;
    }

    /**
     * Ruft den Wert der isEu-Eigenschaft ab.
     * 
     */
    public boolean isIsEu() {
        return isEu;
    }

    /**
     * Legt den Wert der isEu-Eigenschaft fest.
     * 
     */
    public void setIsEu(boolean value) {
        this.isEu = value;
    }

    /**
     * Ruft den Wert der cat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCat() {
        return cat;
    }

    /**
     * Legt den Wert der cat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCat(String value) {
        this.cat = value;
    }

    /**
     * Ruft den Wert der catId-Eigenschaft ab.
     * 
     */
    public int getCatId() {
        return catId;
    }

    /**
     * Legt den Wert der catId-Eigenschaft fest.
     * 
     */
    public void setCatId(int value) {
        this.catId = value;
    }

    /**
     * Ruft den Wert der reason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Legt den Wert der reason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Ruft den Wert der isAufgehoben-Eigenschaft ab.
     * 
     */
    public boolean isIsAufgehoben() {
        return isAufgehoben;
    }

    /**
     * Legt den Wert der isAufgehoben-Eigenschaft fest.
     * 
     */
    public void setIsAufgehoben(boolean value) {
        this.isAufgehoben = value;
    }

    /**
     * Ruft den Wert der altOffer-Eigenschaft ab.
     * 
     */
    public boolean isAltOffer() {
        return altOffer;
    }

    /**
     * Legt den Wert der altOffer-Eigenschaft fest.
     * 
     */
    public void setAltOffer(boolean value) {
        this.altOffer = value;
    }

    /**
     * Ruft den Wert der locPrj-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocPrj() {
        return locPrj;
    }

    /**
     * Legt den Wert der locPrj-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocPrj(String value) {
        this.locPrj = value;
    }

    /**
     * Ruft den Wert der auftragsDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuftragsDatum() {
        return auftragsDatum;
    }

    /**
     * Legt den Wert der auftragsDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuftragsDatum(String value) {
        this.auftragsDatum = value;
    }

    /**
     * Ruft den Wert der statusCsbf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatusCsbf() {
        return statusCsbf;
    }

    /**
     * Legt den Wert der statusCsbf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatusCsbf(Status value) {
        this.statusCsbf = value;
    }

    /**
     * Ruft den Wert der tenderDeleted-Eigenschaft ab.
     * 
     */
    public boolean isTenderDeleted() {
        return tenderDeleted;
    }

    /**
     * Legt den Wert der tenderDeleted-Eigenschaft fest.
     * 
     */
    public void setTenderDeleted(boolean value) {
        this.tenderDeleted = value;
    }

    /**
     * Ruft den Wert der lotTender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLotTender }
     *     
     */
    public ArrayOfLotTender getLotTender() {
        return lotTender;
    }

    /**
     * Legt den Wert der lotTender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLotTender }
     *     
     */
    public void setLotTender(ArrayOfLotTender value) {
        this.lotTender = value;
    }

}
