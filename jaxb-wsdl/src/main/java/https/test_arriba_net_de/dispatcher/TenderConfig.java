
package https.test_arriba_net_de.dispatcher;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TenderConfig complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TenderConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="_Formsatz" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="_NameAward" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vertragserfuell_buergschaft" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="maengelanspr_buergschaft" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="_LblAward" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_LocAward" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_CPV_List" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfTenderCreation_CPV"/&gt;
 *         &lt;element name="_Editor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attachments" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfAttachment"/&gt;
 *         &lt;element name="betrag_kostenkontrolle" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="_Annotation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_Lots" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_Lose" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}TenderCreation_Lose"/&gt;
 *         &lt;element name="_AltOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_PlacingNotice" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="additional_data" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfUnclassified_Key_Value"/&gt;
 *         &lt;element name="_EstimValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="_EstimValueGross" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="gew_preis" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="gew_leistung" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="_DateAward" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}DateTime"/&gt;
 *         &lt;element name="awardDocs_complete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="finalFirm_approve" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InviteBidders" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_Reason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_ContractType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="_ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_Testvergabe" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_EstimValueVat" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="show_discount_at_price_list" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_TNW" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}TenderCreation_TNW"/&gt;
 *         &lt;element name="_OfferTypes" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}TenderCreation_OfferTypes"/&gt;
 *         &lt;element name="_Depart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_PercentQuotaNational" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_AltOffer_ha" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_is_tx_client" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_is_hasta" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="virtual_va_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="_ZusGliederung" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="_SpezVergabeord" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="public_access" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="public_access_begruendung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="_OfferWithoutAvasign" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mit_preisen" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="gaebfile" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}TenderCreation_Gaeb"/&gt;
 *         &lt;element name="_FederalState" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Disabled_Items" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}Disabled_Items"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderConfig", propOrder = {

})
public class TenderConfig {

    @XmlElement(name = "_Formsatz")
    protected int formsatz;
    @XmlElement(name = "_NameAward", required = true)
    protected String nameAward;
    @XmlElement(name = "vertragserfuell_buergschaft")
    protected float vertragserfuellBuergschaft;
    @XmlElement(name = "maengelanspr_buergschaft")
    protected float maengelansprBuergschaft;
    @XmlElement(name = "_LblAward", required = true)
    protected String lblAward;
    @XmlElement(name = "_LocAward", required = true)
    protected String locAward;
    @XmlElement(name = "_CPV_List", required = true)
    protected ArrayOfTenderCreationCPV cpvList;
    @XmlElement(name = "_Editor", required = true)
    protected String editor;
    @XmlElement(required = true)
    protected ArrayOfAttachment attachments;
    @XmlElement(name = "betrag_kostenkontrolle")
    protected float betragKostenkontrolle;
    @XmlElement(name = "_Annotation", required = true)
    protected String annotation;
    @XmlElement(name = "_Lots")
    protected boolean lots;
    @XmlElement(name = "_Lose", required = true)
    protected TenderCreationLose lose;
    @XmlElement(name = "_AltOffer")
    protected boolean altOffer;
    @XmlElement(name = "_PlacingNotice")
    protected boolean placingNotice;
    @XmlElement(name = "additional_data", required = true)
    protected ArrayOfUnclassifiedKeyValue additionalData;
    @XmlElement(name = "_EstimValue")
    protected float estimValue;
    @XmlElement(name = "_EstimValueGross")
    protected float estimValueGross;
    @XmlElement(name = "gew_preis")
    protected int gewPreis;
    @XmlElement(name = "gew_leistung")
    protected int gewLeistung;
    @XmlElement(name = "_DateAward", required = true)
    protected DateTime dateAward;
    @XmlElement(name = "awardDocs_complete")
    protected boolean awardDocsComplete;
    @XmlElement(name = "finalFirm_approve")
    protected boolean finalFirmApprove;
    @XmlElement(name = "InviteBidders")
    protected boolean inviteBidders;
    @XmlElement(name = "_Reason", required = true)
    protected String reason;
    @XmlElement(name = "_ContractType")
    protected int contractType;
    @XmlElement(name = "_ShortDescription", required = true)
    protected String shortDescription;
    @XmlElement(name = "_Testvergabe")
    protected boolean testvergabe;
    @XmlElement(name = "_EstimValueVat")
    protected int estimValueVat;
    @XmlElement(name = "show_discount_at_price_list", required = true)
    protected String showDiscountAtPriceList;
    @XmlElement(name = "_TNW", required = true)
    protected TenderCreationTNW tnw;
    @XmlElement(name = "_OfferTypes", required = true)
    protected TenderCreationOfferTypes offerTypes;
    @XmlElement(name = "_Depart", required = true)
    protected String depart;
    @XmlElement(name = "_PercentQuotaNational")
    protected boolean percentQuotaNational;
    @XmlElement(name = "_AltOffer_ha")
    protected boolean altOfferHa;
    @XmlElement(name = "_is_tx_client")
    protected boolean isTxClient;
    @XmlElement(name = "_is_hasta")
    protected boolean isHasta;
    @XmlElement(name = "virtual_va_id")
    protected int virtualVaId;
    @XmlElement(name = "_ZusGliederung")
    protected int zusGliederung;
    @XmlElement(name = "_SpezVergabeord")
    protected int spezVergabeord;
    @XmlElement(name = "public_access")
    protected boolean publicAccess;
    @XmlElement(name = "public_access_begruendung", required = true)
    protected String publicAccessBegruendung;
    @XmlElement(name = "_OfferWithoutAvasign")
    protected boolean offerWithoutAvasign;
    @XmlElement(name = "mit_preisen")
    protected boolean mitPreisen;
    @XmlElement(required = true)
    protected TenderCreationGaeb gaebfile;
    @XmlElement(name = "_FederalState")
    protected int federalState;
    @XmlElement(name = "Disabled_Items", required = true)
    protected DisabledItems disabledItems;

    /**
     * Ruft den Wert der formsatz-Eigenschaft ab.
     * 
     */
    public int getFormsatz() {
        return formsatz;
    }

    /**
     * Legt den Wert der formsatz-Eigenschaft fest.
     * 
     */
    public void setFormsatz(int value) {
        this.formsatz = value;
    }

    /**
     * Ruft den Wert der nameAward-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAward() {
        return nameAward;
    }

    /**
     * Legt den Wert der nameAward-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAward(String value) {
        this.nameAward = value;
    }

    /**
     * Ruft den Wert der vertragserfuellBuergschaft-Eigenschaft ab.
     * 
     */
    public float getVertragserfuellBuergschaft() {
        return vertragserfuellBuergschaft;
    }

    /**
     * Legt den Wert der vertragserfuellBuergschaft-Eigenschaft fest.
     * 
     */
    public void setVertragserfuellBuergschaft(float value) {
        this.vertragserfuellBuergschaft = value;
    }

    /**
     * Ruft den Wert der maengelansprBuergschaft-Eigenschaft ab.
     * 
     */
    public float getMaengelansprBuergschaft() {
        return maengelansprBuergschaft;
    }

    /**
     * Legt den Wert der maengelansprBuergschaft-Eigenschaft fest.
     * 
     */
    public void setMaengelansprBuergschaft(float value) {
        this.maengelansprBuergschaft = value;
    }

    /**
     * Ruft den Wert der lblAward-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLblAward() {
        return lblAward;
    }

    /**
     * Legt den Wert der lblAward-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLblAward(String value) {
        this.lblAward = value;
    }

    /**
     * Ruft den Wert der locAward-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocAward() {
        return locAward;
    }

    /**
     * Legt den Wert der locAward-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocAward(String value) {
        this.locAward = value;
    }

    /**
     * Ruft den Wert der cpvList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTenderCreationCPV }
     *     
     */
    public ArrayOfTenderCreationCPV getCPVList() {
        return cpvList;
    }

    /**
     * Legt den Wert der cpvList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTenderCreationCPV }
     *     
     */
    public void setCPVList(ArrayOfTenderCreationCPV value) {
        this.cpvList = value;
    }

    /**
     * Ruft den Wert der editor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditor() {
        return editor;
    }

    /**
     * Legt den Wert der editor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditor(String value) {
        this.editor = value;
    }

    /**
     * Ruft den Wert der attachments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public ArrayOfAttachment getAttachments() {
        return attachments;
    }

    /**
     * Legt den Wert der attachments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public void setAttachments(ArrayOfAttachment value) {
        this.attachments = value;
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
     * Ruft den Wert der annotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * Legt den Wert der annotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotation(String value) {
        this.annotation = value;
    }

    /**
     * Ruft den Wert der lots-Eigenschaft ab.
     * 
     */
    public boolean isLots() {
        return lots;
    }

    /**
     * Legt den Wert der lots-Eigenschaft fest.
     * 
     */
    public void setLots(boolean value) {
        this.lots = value;
    }

    /**
     * Ruft den Wert der lose-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TenderCreationLose }
     *     
     */
    public TenderCreationLose getLose() {
        return lose;
    }

    /**
     * Legt den Wert der lose-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderCreationLose }
     *     
     */
    public void setLose(TenderCreationLose value) {
        this.lose = value;
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
     * Ruft den Wert der placingNotice-Eigenschaft ab.
     * 
     */
    public boolean isPlacingNotice() {
        return placingNotice;
    }

    /**
     * Legt den Wert der placingNotice-Eigenschaft fest.
     * 
     */
    public void setPlacingNotice(boolean value) {
        this.placingNotice = value;
    }

    /**
     * Ruft den Wert der additionalData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnclassifiedKeyValue }
     *     
     */
    public ArrayOfUnclassifiedKeyValue getAdditionalData() {
        return additionalData;
    }

    /**
     * Legt den Wert der additionalData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnclassifiedKeyValue }
     *     
     */
    public void setAdditionalData(ArrayOfUnclassifiedKeyValue value) {
        this.additionalData = value;
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
     * Ruft den Wert der gewPreis-Eigenschaft ab.
     * 
     */
    public int getGewPreis() {
        return gewPreis;
    }

    /**
     * Legt den Wert der gewPreis-Eigenschaft fest.
     * 
     */
    public void setGewPreis(int value) {
        this.gewPreis = value;
    }

    /**
     * Ruft den Wert der gewLeistung-Eigenschaft ab.
     * 
     */
    public int getGewLeistung() {
        return gewLeistung;
    }

    /**
     * Legt den Wert der gewLeistung-Eigenschaft fest.
     * 
     */
    public void setGewLeistung(int value) {
        this.gewLeistung = value;
    }

    /**
     * Ruft den Wert der dateAward-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateAward() {
        return dateAward;
    }

    /**
     * Legt den Wert der dateAward-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateAward(DateTime value) {
        this.dateAward = value;
    }

    /**
     * Ruft den Wert der awardDocsComplete-Eigenschaft ab.
     * 
     */
    public boolean isAwardDocsComplete() {
        return awardDocsComplete;
    }

    /**
     * Legt den Wert der awardDocsComplete-Eigenschaft fest.
     * 
     */
    public void setAwardDocsComplete(boolean value) {
        this.awardDocsComplete = value;
    }

    /**
     * Ruft den Wert der finalFirmApprove-Eigenschaft ab.
     * 
     */
    public boolean isFinalFirmApprove() {
        return finalFirmApprove;
    }

    /**
     * Legt den Wert der finalFirmApprove-Eigenschaft fest.
     * 
     */
    public void setFinalFirmApprove(boolean value) {
        this.finalFirmApprove = value;
    }

    /**
     * Ruft den Wert der inviteBidders-Eigenschaft ab.
     * 
     */
    public boolean isInviteBidders() {
        return inviteBidders;
    }

    /**
     * Legt den Wert der inviteBidders-Eigenschaft fest.
     * 
     */
    public void setInviteBidders(boolean value) {
        this.inviteBidders = value;
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
     * Ruft den Wert der contractType-Eigenschaft ab.
     * 
     */
    public int getContractType() {
        return contractType;
    }

    /**
     * Legt den Wert der contractType-Eigenschaft fest.
     * 
     */
    public void setContractType(int value) {
        this.contractType = value;
    }

    /**
     * Ruft den Wert der shortDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Legt den Wert der shortDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Ruft den Wert der testvergabe-Eigenschaft ab.
     * 
     */
    public boolean isTestvergabe() {
        return testvergabe;
    }

    /**
     * Legt den Wert der testvergabe-Eigenschaft fest.
     * 
     */
    public void setTestvergabe(boolean value) {
        this.testvergabe = value;
    }

    /**
     * Ruft den Wert der estimValueVat-Eigenschaft ab.
     * 
     */
    public int getEstimValueVat() {
        return estimValueVat;
    }

    /**
     * Legt den Wert der estimValueVat-Eigenschaft fest.
     * 
     */
    public void setEstimValueVat(int value) {
        this.estimValueVat = value;
    }

    /**
     * Ruft den Wert der showDiscountAtPriceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowDiscountAtPriceList() {
        return showDiscountAtPriceList;
    }

    /**
     * Legt den Wert der showDiscountAtPriceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowDiscountAtPriceList(String value) {
        this.showDiscountAtPriceList = value;
    }

    /**
     * Ruft den Wert der tnw-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TenderCreationTNW }
     *     
     */
    public TenderCreationTNW getTNW() {
        return tnw;
    }

    /**
     * Legt den Wert der tnw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderCreationTNW }
     *     
     */
    public void setTNW(TenderCreationTNW value) {
        this.tnw = value;
    }

    /**
     * Ruft den Wert der offerTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TenderCreationOfferTypes }
     *     
     */
    public TenderCreationOfferTypes getOfferTypes() {
        return offerTypes;
    }

    /**
     * Legt den Wert der offerTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderCreationOfferTypes }
     *     
     */
    public void setOfferTypes(TenderCreationOfferTypes value) {
        this.offerTypes = value;
    }

    /**
     * Ruft den Wert der depart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepart() {
        return depart;
    }

    /**
     * Legt den Wert der depart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepart(String value) {
        this.depart = value;
    }

    /**
     * Ruft den Wert der percentQuotaNational-Eigenschaft ab.
     * 
     */
    public boolean isPercentQuotaNational() {
        return percentQuotaNational;
    }

    /**
     * Legt den Wert der percentQuotaNational-Eigenschaft fest.
     * 
     */
    public void setPercentQuotaNational(boolean value) {
        this.percentQuotaNational = value;
    }

    /**
     * Ruft den Wert der altOfferHa-Eigenschaft ab.
     * 
     */
    public boolean isAltOfferHa() {
        return altOfferHa;
    }

    /**
     * Legt den Wert der altOfferHa-Eigenschaft fest.
     * 
     */
    public void setAltOfferHa(boolean value) {
        this.altOfferHa = value;
    }

    /**
     * Ruft den Wert der isTxClient-Eigenschaft ab.
     * 
     */
    public boolean isIsTxClient() {
        return isTxClient;
    }

    /**
     * Legt den Wert der isTxClient-Eigenschaft fest.
     * 
     */
    public void setIsTxClient(boolean value) {
        this.isTxClient = value;
    }

    /**
     * Ruft den Wert der isHasta-Eigenschaft ab.
     * 
     */
    public boolean isIsHasta() {
        return isHasta;
    }

    /**
     * Legt den Wert der isHasta-Eigenschaft fest.
     * 
     */
    public void setIsHasta(boolean value) {
        this.isHasta = value;
    }

    /**
     * Ruft den Wert der virtualVaId-Eigenschaft ab.
     * 
     */
    public int getVirtualVaId() {
        return virtualVaId;
    }

    /**
     * Legt den Wert der virtualVaId-Eigenschaft fest.
     * 
     */
    public void setVirtualVaId(int value) {
        this.virtualVaId = value;
    }

    /**
     * Ruft den Wert der zusGliederung-Eigenschaft ab.
     * 
     */
    public int getZusGliederung() {
        return zusGliederung;
    }

    /**
     * Legt den Wert der zusGliederung-Eigenschaft fest.
     * 
     */
    public void setZusGliederung(int value) {
        this.zusGliederung = value;
    }

    /**
     * Ruft den Wert der spezVergabeord-Eigenschaft ab.
     * 
     */
    public int getSpezVergabeord() {
        return spezVergabeord;
    }

    /**
     * Legt den Wert der spezVergabeord-Eigenschaft fest.
     * 
     */
    public void setSpezVergabeord(int value) {
        this.spezVergabeord = value;
    }

    /**
     * Ruft den Wert der publicAccess-Eigenschaft ab.
     * 
     */
    public boolean isPublicAccess() {
        return publicAccess;
    }

    /**
     * Legt den Wert der publicAccess-Eigenschaft fest.
     * 
     */
    public void setPublicAccess(boolean value) {
        this.publicAccess = value;
    }

    /**
     * Ruft den Wert der publicAccessBegruendung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicAccessBegruendung() {
        return publicAccessBegruendung;
    }

    /**
     * Legt den Wert der publicAccessBegruendung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicAccessBegruendung(String value) {
        this.publicAccessBegruendung = value;
    }

    /**
     * Ruft den Wert der offerWithoutAvasign-Eigenschaft ab.
     * 
     */
    public boolean isOfferWithoutAvasign() {
        return offerWithoutAvasign;
    }

    /**
     * Legt den Wert der offerWithoutAvasign-Eigenschaft fest.
     * 
     */
    public void setOfferWithoutAvasign(boolean value) {
        this.offerWithoutAvasign = value;
    }

    /**
     * Ruft den Wert der mitPreisen-Eigenschaft ab.
     * 
     */
    public boolean isMitPreisen() {
        return mitPreisen;
    }

    /**
     * Legt den Wert der mitPreisen-Eigenschaft fest.
     * 
     */
    public void setMitPreisen(boolean value) {
        this.mitPreisen = value;
    }

    /**
     * Ruft den Wert der gaebfile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TenderCreationGaeb }
     *     
     */
    public TenderCreationGaeb getGaebfile() {
        return gaebfile;
    }

    /**
     * Legt den Wert der gaebfile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderCreationGaeb }
     *     
     */
    public void setGaebfile(TenderCreationGaeb value) {
        this.gaebfile = value;
    }

    /**
     * Ruft den Wert der federalState-Eigenschaft ab.
     * 
     */
    public int getFederalState() {
        return federalState;
    }

    /**
     * Legt den Wert der federalState-Eigenschaft fest.
     * 
     */
    public void setFederalState(int value) {
        this.federalState = value;
    }

    /**
     * Ruft den Wert der disabledItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DisabledItems }
     *     
     */
    public DisabledItems getDisabledItems() {
        return disabledItems;
    }

    /**
     * Legt den Wert der disabledItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabledItems }
     *     
     */
    public void setDisabledItems(DisabledItems value) {
        this.disabledItems = value;
    }

}
