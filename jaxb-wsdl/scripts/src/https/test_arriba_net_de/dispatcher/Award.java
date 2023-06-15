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
 * <p>Java-Klasse für Award complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Award">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Auftragnehmer" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}Company"/>
 *         &lt;element name="auftragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="auftragsversand_datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hoehe_buergschaft" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Award", propOrder = {

})
public class Award {

    @XmlElement(name = "Auftragnehmer", required = true)
    protected Company auftragnehmer;
    @XmlElement(required = true)
    protected String auftragsnummer;
    @XmlElement(name = "auftragsversand_datum", required = true)
    protected String auftragsversandDatum;
    @XmlElement(name = "hoehe_buergschaft")
    protected float hoeheBuergschaft;

    /**
     * Ruft den Wert der auftragnehmer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getAuftragnehmer() {
        return auftragnehmer;
    }

    /**
     * Legt den Wert der auftragnehmer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setAuftragnehmer(Company value) {
        this.auftragnehmer = value;
    }

    /**
     * Ruft den Wert der auftragsnummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuftragsnummer() {
        return auftragsnummer;
    }

    /**
     * Legt den Wert der auftragsnummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuftragsnummer(String value) {
        this.auftragsnummer = value;
    }

    /**
     * Ruft den Wert der auftragsversandDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuftragsversandDatum() {
        return auftragsversandDatum;
    }

    /**
     * Legt den Wert der auftragsversandDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuftragsversandDatum(String value) {
        this.auftragsversandDatum = value;
    }

    /**
     * Ruft den Wert der hoeheBuergschaft-Eigenschaft ab.
     * 
     */
    public float getHoeheBuergschaft() {
        return hoeheBuergschaft;
    }

    /**
     * Legt den Wert der hoeheBuergschaft-Eigenschaft fest.
     * 
     */
    public void setHoeheBuergschaft(float value) {
        this.hoeheBuergschaft = value;
    }

}
