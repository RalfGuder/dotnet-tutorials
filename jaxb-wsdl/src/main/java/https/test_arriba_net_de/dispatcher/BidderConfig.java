
package https.test_arriba_net_de.dispatcher;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Bidder_Config complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Bidder_Config"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CompanyImport" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfCompanyImport"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bidder_Config", propOrder = {

})
public class BidderConfig {

    @XmlElement(name = "CompanyImport", required = true)
    protected ArrayOfCompanyImport companyImport;

    /**
     * Ruft den Wert der companyImport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyImport }
     *     
     */
    public ArrayOfCompanyImport getCompanyImport() {
        return companyImport;
    }

    /**
     * Legt den Wert der companyImport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyImport }
     *     
     */
    public void setCompanyImport(ArrayOfCompanyImport value) {
        this.companyImport = value;
    }

}
