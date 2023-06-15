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
 * <p>Java-Klasse für Lot_Tender complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Lot_Tender">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Award" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}Award"/>
 *         &lt;element name="CPV_haupt" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}CPV"/>
 *         &lt;element name="CPV_ergaenzend" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfCpv"/>
 *         &lt;element name="losnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="is_aufgehoben" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CSBF" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}CSBF"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lot_Tender", propOrder = {

})
public class LotTender {

    @XmlElement(name = "Award", required = true)
    protected Award award;
    @XmlElement(name = "CPV_haupt", required = true)
    protected CPV cpvHaupt;
    @XmlElement(name = "CPV_ergaenzend", required = true)
    protected ArrayOfCpv cpvErgaenzend;
    protected int losnummer;
    @XmlElement(name = "is_aufgehoben")
    protected boolean isAufgehoben;
    @XmlElement(name = "CSBF", required = true)
    protected CSBF csbf;

    /**
     * Ruft den Wert der award-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Award }
     *     
     */
    public Award getAward() {
        return award;
    }

    /**
     * Legt den Wert der award-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Award }
     *     
     */
    public void setAward(Award value) {
        this.award = value;
    }

    /**
     * Ruft den Wert der cpvHaupt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CPV }
     *     
     */
    public CPV getCPVHaupt() {
        return cpvHaupt;
    }

    /**
     * Legt den Wert der cpvHaupt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CPV }
     *     
     */
    public void setCPVHaupt(CPV value) {
        this.cpvHaupt = value;
    }

    /**
     * Ruft den Wert der cpvErgaenzend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCpv }
     *     
     */
    public ArrayOfCpv getCPVErgaenzend() {
        return cpvErgaenzend;
    }

    /**
     * Legt den Wert der cpvErgaenzend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCpv }
     *     
     */
    public void setCPVErgaenzend(ArrayOfCpv value) {
        this.cpvErgaenzend = value;
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
     * Ruft den Wert der csbf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CSBF }
     *     
     */
    public CSBF getCSBF() {
        return csbf;
    }

    /**
     * Legt den Wert der csbf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CSBF }
     *     
     */
    public void setCSBF(CSBF value) {
        this.csbf = value;
    }

}
