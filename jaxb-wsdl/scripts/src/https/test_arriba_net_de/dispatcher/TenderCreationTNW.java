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
 * <p>Java-Klasse für TenderCreation_TNW complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TenderCreation_TNW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="_Nachweise" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfTendercreation_nachweise"/>
 *         &lt;element name="_Bewerberbogen_Pflicht" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="_Kriterien" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfTendercreation_kriterien"/>
 *         &lt;element name="_Bewertung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tvgg_docs_neccessary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderCreation_TNW", propOrder = {

})
public class TenderCreationTNW {

    @XmlElement(name = "_Nachweise", required = true)
    protected ArrayOfTendercreationNachweise nachweise;
    @XmlElement(name = "_Bewerberbogen_Pflicht")
    protected boolean bewerberbogenPflicht;
    @XmlElement(name = "_Kriterien", required = true)
    protected ArrayOfTendercreationKriterien kriterien;
    @XmlElement(name = "_Bewertung", required = true)
    protected String bewertung;
    @XmlElement(name = "tvgg_docs_neccessary")
    protected boolean tvggDocsNeccessary;

    /**
     * Ruft den Wert der nachweise-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTendercreationNachweise }
     *     
     */
    public ArrayOfTendercreationNachweise getNachweise() {
        return nachweise;
    }

    /**
     * Legt den Wert der nachweise-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTendercreationNachweise }
     *     
     */
    public void setNachweise(ArrayOfTendercreationNachweise value) {
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
     *     {@link ArrayOfTendercreationKriterien }
     *     
     */
    public ArrayOfTendercreationKriterien getKriterien() {
        return kriterien;
    }

    /**
     * Legt den Wert der kriterien-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTendercreationKriterien }
     *     
     */
    public void setKriterien(ArrayOfTendercreationKriterien value) {
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
