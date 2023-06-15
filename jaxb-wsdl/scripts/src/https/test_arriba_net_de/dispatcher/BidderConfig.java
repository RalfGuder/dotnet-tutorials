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
 * <p>Java-Klasse für Bidder_Config complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Bidder_Config">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CompanyImport" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfCompanyimport"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bidder_Config", propOrder = {

})
public class BidderConfig {

    @XmlElement(name = "CompanyImport", required = true)
    protected ArrayOfCompanyimport companyImport;

    /**
     * Ruft den Wert der companyImport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyimport }
     *     
     */
    public ArrayOfCompanyimport getCompanyImport() {
        return companyImport;
    }

    /**
     * Legt den Wert der companyImport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyimport }
     *     
     */
    public void setCompanyImport(ArrayOfCompanyimport value) {
        this.companyImport = value;
    }

}
