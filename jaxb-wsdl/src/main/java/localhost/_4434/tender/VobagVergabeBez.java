
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Vobag_Vergabe_Bez complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Vobag_Vergabe_Bez"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="vobag_vergabe_bez_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stlb" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="vobc" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="stlk" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vobag_Vergabe_Bez", propOrder = {

})
public class VobagVergabeBez {

    @XmlElement(name = "vobag_vergabe_bez_id")
    protected int vobagVergabeBezId;
    @XmlElement(required = true)
    protected String nr;
    @XmlElement(required = true)
    protected String bezeichnung;
    protected boolean stlb;
    protected boolean vobc;
    protected boolean stlk;

    /**
     * Ruft den Wert der vobagVergabeBezId-Eigenschaft ab.
     * 
     */
    public int getVobagVergabeBezId() {
        return vobagVergabeBezId;
    }

    /**
     * Legt den Wert der vobagVergabeBezId-Eigenschaft fest.
     * 
     */
    public void setVobagVergabeBezId(int value) {
        this.vobagVergabeBezId = value;
    }

    /**
     * Ruft den Wert der nr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNr() {
        return nr;
    }

    /**
     * Legt den Wert der nr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNr(String value) {
        this.nr = value;
    }

    /**
     * Ruft den Wert der bezeichnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Legt den Wert der bezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Ruft den Wert der stlb-Eigenschaft ab.
     * 
     */
    public boolean isStlb() {
        return stlb;
    }

    /**
     * Legt den Wert der stlb-Eigenschaft fest.
     * 
     */
    public void setStlb(boolean value) {
        this.stlb = value;
    }

    /**
     * Ruft den Wert der vobc-Eigenschaft ab.
     * 
     */
    public boolean isVobc() {
        return vobc;
    }

    /**
     * Legt den Wert der vobc-Eigenschaft fest.
     * 
     */
    public void setVobc(boolean value) {
        this.vobc = value;
    }

    /**
     * Ruft den Wert der stlk-Eigenschaft ab.
     * 
     */
    public boolean isStlk() {
        return stlk;
    }

    /**
     * Legt den Wert der stlk-Eigenschaft fest.
     * 
     */
    public void setStlk(boolean value) {
        this.stlk = value;
    }

}
