
package https.test_arriba_net_de.dispatcher;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TenderCreation_TNW complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TenderCreation_TNW"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="_Nachweise" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfTenderCreation_Nachweise"/&gt;
 *         &lt;element name="_Bewerberbogen_Pflicht" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_Kriterien" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfTenderCreation_Kriterien"/&gt;
 *         &lt;element name="_Bewertung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tvgg_docs_neccessary" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderCreation_TNW", propOrder = {

})
public class TenderCreationTNW {

    @XmlElement(name = "_Nachweise", required = true)
    protected ArrayOfTenderCreationNachweise nachweise;
    @XmlElement(name = "_Bewerberbogen_Pflicht")
    protected boolean bewerberbogenPflicht;
    @XmlElement(name = "_Kriterien", required = true)
    protected ArrayOfTenderCreationKriterien kriterien;
    @XmlElement(name = "_Bewertung", required = true)
    protected String bewertung;
    @XmlElement(name = "tvgg_docs_neccessary")
    protected boolean tvggDocsNeccessary;

    /**
     * Ruft den Wert der nachweise-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTenderCreationNachweise }
     *     
     */
    public ArrayOfTenderCreationNachweise getNachweise() {
        return nachweise;
    }

    /**
     * Legt den Wert der nachweise-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTenderCreationNachweise }
     *     
     */
    public void setNachweise(ArrayOfTenderCreationNachweise value) {
        this.nachweise = value;
    }

    /**
     * Ruft den Wert der bewerberbogenPflicht-Eigenschaft ab.
     * 
     */
    public boolean isBewerberbogenPflicht() {
        return bewerberbogenPflicht;
    }

    /**
     * Legt den Wert der bewerberbogenPflicht-Eigenschaft fest.
     * 
     */
    public void setBewerberbogenPflicht(boolean value) {
        this.bewerberbogenPflicht = value;
    }

    /**
     * Ruft den Wert der kriterien-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTenderCreationKriterien }
     *     
     */
    public ArrayOfTenderCreationKriterien getKriterien() {
        return kriterien;
    }

    /**
     * Legt den Wert der kriterien-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTenderCreationKriterien }
     *     
     */
    public void setKriterien(ArrayOfTenderCreationKriterien value) {
        this.kriterien = value;
    }

    /**
     * Ruft den Wert der bewertung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBewertung() {
        return bewertung;
    }

    /**
     * Legt den Wert der bewertung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBewertung(String value) {
        this.bewertung = value;
    }

    /**
     * Ruft den Wert der tvggDocsNeccessary-Eigenschaft ab.
     * 
     */
    public boolean isTvggDocsNeccessary() {
        return tvggDocsNeccessary;
    }

    /**
     * Legt den Wert der tvggDocsNeccessary-Eigenschaft fest.
     * 
     */
    public void setTvggDocsNeccessary(boolean value) {
        this.tvggDocsNeccessary = value;
    }

}
