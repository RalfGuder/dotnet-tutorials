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
 * <p>Java-Klasse für Disabled_Items complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Disabled_Items">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="LblPrj" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NamePrj" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="_NameAward" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="_LblAward" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="_Lots" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
