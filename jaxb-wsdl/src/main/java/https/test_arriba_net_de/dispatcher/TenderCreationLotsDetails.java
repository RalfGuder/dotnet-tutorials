
package https.test_arriba_net_de.dispatcher;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TenderCreation_LotsDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TenderCreation_LotsDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="nr" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gaebfile" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}TenderCreation_Gaeb"/&gt;
 *         &lt;element name="_CPV_List" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfTenderCreation_CPV"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderCreation_LotsDetails", propOrder = {

})
public class TenderCreationLotsDetails {

    protected int nr;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected TenderCreationGaeb gaebfile;
    @XmlElement(name = "_CPV_List", required = true)
    protected ArrayOfTenderCreationCPV cpvList;

    /**
     * Ruft den Wert der nr-Eigenschaft ab.
     * 
     */
    public int getNr() {
        return nr;
    }

    /**
     * Legt den Wert der nr-Eigenschaft fest.
     * 
     */
    public void setNr(int value) {
        this.nr = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

}
