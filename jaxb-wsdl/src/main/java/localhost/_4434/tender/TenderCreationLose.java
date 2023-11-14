
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TenderCreation_Lose complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TenderCreation_Lose"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ag_lose_one" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ag_lose_select" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ag_lose_all" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Lot_details" type="{http://localhost:4434/tender}ArrayOfTenderCreation_LotsDetails"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderCreation_Lose", propOrder = {

})
public class TenderCreationLose {

    @XmlElement(name = "ag_lose_one")
    protected boolean agLoseOne;
    @XmlElement(name = "ag_lose_select")
    protected boolean agLoseSelect;
    @XmlElement(name = "ag_lose_all")
    protected boolean agLoseAll;
    @XmlElement(name = "Lot_details", required = true)
    protected ArrayOfTenderCreationLotsDetails lotDetails;

    /**
     * Ruft den Wert der agLoseOne-Eigenschaft ab.
     * 
     */
    public boolean isAgLoseOne() {
        return agLoseOne;
    }

    /**
     * Legt den Wert der agLoseOne-Eigenschaft fest.
     * 
     */
    public void setAgLoseOne(boolean value) {
        this.agLoseOne = value;
    }

    /**
     * Ruft den Wert der agLoseSelect-Eigenschaft ab.
     * 
     */
    public boolean isAgLoseSelect() {
        return agLoseSelect;
    }

    /**
     * Legt den Wert der agLoseSelect-Eigenschaft fest.
     * 
     */
    public void setAgLoseSelect(boolean value) {
        this.agLoseSelect = value;
    }

    /**
     * Ruft den Wert der agLoseAll-Eigenschaft ab.
     * 
     */
    public boolean isAgLoseAll() {
        return agLoseAll;
    }

    /**
     * Legt den Wert der agLoseAll-Eigenschaft fest.
     * 
     */
    public void setAgLoseAll(boolean value) {
        this.agLoseAll = value;
    }

    /**
     * Ruft den Wert der lotDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTenderCreationLotsDetails }
     *     
     */
    public ArrayOfTenderCreationLotsDetails getLotDetails() {
        return lotDetails;
    }

    /**
     * Legt den Wert der lotDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTenderCreationLotsDetails }
     *     
     */
    public void setLotDetails(ArrayOfTenderCreationLotsDetails value) {
        this.lotDetails = value;
    }

}
