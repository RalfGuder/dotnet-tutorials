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
 * <p>Java-Klasse für TenderCreation_Lose complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TenderCreation_Lose">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ag_lose_one" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ag_lose_select" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ag_lose_all" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Lot_details" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfTendercreation_lotsdetails"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    protected ArrayOfTendercreationLotsdetails lotDetails;

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
     *     {@link ArrayOfTendercreationLotsdetails }
     *     
     */
    public ArrayOfTendercreationLotsdetails getLotDetails() {
        return lotDetails;
    }

    /**
     * Legt den Wert der lotDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTendercreationLotsdetails }
     *     
     */
    public void setLotDetails(ArrayOfTendercreationLotsdetails value) {
        this.lotDetails = value;
    }

}
