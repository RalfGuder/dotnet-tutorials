
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Lot_Tender complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Lot_Tender"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Award" type="{http://localhost:4434/tender}Award"/&gt;
 *         &lt;element name="CPV_haupt" type="{http://localhost:4434/tender}CPV"/&gt;
 *         &lt;element name="CPV_ergaenzend" type="{http://localhost:4434/tender}ArrayOfCPV"/&gt;
 *         &lt;element name="losnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="is_aufgehoben" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CSBF" type="{http://localhost:4434/tender}CSBF"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    protected ArrayOfCPV cpvErgaenzend;
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
     *     {@link ArrayOfCPV }
     *     
     */
    public ArrayOfCPV getCPVErgaenzend() {
        return cpvErgaenzend;
    }

    /**
     * Legt den Wert der cpvErgaenzend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCPV }
     *     
     */
    public void setCPVErgaenzend(ArrayOfCPV value) {
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
