
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Award complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Award"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Auftragnehmer" type="{http://localhost:4434/tender}Company"/&gt;
 *         &lt;element name="auftragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="auftragsversand_datum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hoehe_buergschaft" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
