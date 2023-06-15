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
 * <p>Java-Klasse für TenderCreation_LotsDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TenderCreation_LotsDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="nr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gaebfile" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}TenderCreation_Gaeb"/>
 *         &lt;element name="_CPV_List" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfTendercreation_cpv"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    protected ArrayOfTendercreationCpv cpvList;

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
     *     {@link ArrayOfTendercreationCpv }
     *     
     */
    public ArrayOfTendercreationCpv getCPVList() {
        return cpvList;
    }

    /**
     * Legt den Wert der cpvList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTendercreationCpv }
     *     
     */
    public void setCPVList(ArrayOfTendercreationCpv value) {
        this.cpvList = value;
    }

}
