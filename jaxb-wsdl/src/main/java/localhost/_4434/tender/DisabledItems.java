
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Disabled_Items complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Disabled_Items"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="LblPrj" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NamePrj" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_NameAward" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_LblAward" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="_Lots" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disabled_Items", propOrder = {

})
public class DisabledItems {

    @XmlElement(name = "LblPrj")
    protected boolean lblPrj;
    @XmlElement(name = "NamePrj")
    protected boolean namePrj;
    @XmlElement(name = "_NameAward")
    protected boolean nameAward;
    @XmlElement(name = "_LblAward")
    protected boolean lblAward;
    @XmlElement(name = "_Lots")
    protected boolean lots;

    /**
     * Ruft den Wert der lblPrj-Eigenschaft ab.
     * 
     */
    public boolean isLblPrj() {
        return lblPrj;
    }

    /**
     * Legt den Wert der lblPrj-Eigenschaft fest.
     * 
     */
    public void setLblPrj(boolean value) {
        this.lblPrj = value;
    }

    /**
     * Ruft den Wert der namePrj-Eigenschaft ab.
     * 
     */
    public boolean isNamePrj() {
        return namePrj;
    }

    /**
     * Legt den Wert der namePrj-Eigenschaft fest.
     * 
     */
    public void setNamePrj(boolean value) {
        this.namePrj = value;
    }

    /**
     * Ruft den Wert der nameAward-Eigenschaft ab.
     * 
     */
    public boolean isNameAward() {
        return nameAward;
    }

    /**
     * Legt den Wert der nameAward-Eigenschaft fest.
     * 
     */
    public void setNameAward(boolean value) {
        this.nameAward = value;
    }

    /**
     * Ruft den Wert der lblAward-Eigenschaft ab.
     * 
     */
    public boolean isLblAward() {
        return lblAward;
    }

    /**
     * Legt den Wert der lblAward-Eigenschaft fest.
     * 
     */
    public void setLblAward(boolean value) {
        this.lblAward = value;
    }

    /**
     * Ruft den Wert der lots-Eigenschaft ab.
     * 
     */
    public boolean isLots() {
        return lots;
    }

    /**
     * Legt den Wert der lots-Eigenschaft fest.
     * 
     */
    public void setLots(boolean value) {
        this.lots = value;
    }

}
