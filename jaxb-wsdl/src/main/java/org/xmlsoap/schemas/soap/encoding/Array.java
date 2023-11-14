
package org.xmlsoap.schemas.soap.encoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import https.test_arriba_net_de.dispatcher.ArrayOfAttachment;
import https.test_arriba_net_de.dispatcher.ArrayOfCPV;
import https.test_arriba_net_de.dispatcher.ArrayOfCompanyImport;
import https.test_arriba_net_de.dispatcher.ArrayOfCompanyReturn;
import https.test_arriba_net_de.dispatcher.ArrayOfDateConfigReturn;
import https.test_arriba_net_de.dispatcher.ArrayOfGaebReturn;
import https.test_arriba_net_de.dispatcher.ArrayOfLotTender;
import https.test_arriba_net_de.dispatcher.ArrayOfPublicProcurementLaw;
import https.test_arriba_net_de.dispatcher.ArrayOfRegulationDetail;
import https.test_arriba_net_de.dispatcher.ArrayOfSpecificsPublicProcurementLaw;
import https.test_arriba_net_de.dispatcher.ArrayOfStatusResultData;
import https.test_arriba_net_de.dispatcher.ArrayOfTenderConfigFederalStates;
import https.test_arriba_net_de.dispatcher.ArrayOfTenderConfigFormsets;
import https.test_arriba_net_de.dispatcher.ArrayOfTenderCreationCPV;
import https.test_arriba_net_de.dispatcher.ArrayOfTenderCreationKriterien;
import https.test_arriba_net_de.dispatcher.ArrayOfTenderCreationLotsDetails;
import https.test_arriba_net_de.dispatcher.ArrayOfTenderCreationNachweise;
import https.test_arriba_net_de.dispatcher.ArrayOfTenderRegulation;
import https.test_arriba_net_de.dispatcher.ArrayOfUnclassifiedKeyValue;
import https.test_arriba_net_de.dispatcher.ArrayOfVobagVergabeBez;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 'Array' is a complex type for accessors identified by position
 * 
 * <p>Java-Klasse für Array complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Array"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://schemas.xmlsoap.org/soap/encoding/}Array" minOccurs="0"/&gt;
 *       &lt;attGroup ref="{http://schemas.xmlsoap.org/soap/encoding/}arrayAttributes"/&gt;
 *       &lt;attGroup ref="{http://schemas.xmlsoap.org/soap/encoding/}commonAttributes"/&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Array", propOrder = {
    "any"
})
@XmlSeeAlso({
    ArrayOfUnclassifiedKeyValue.class,
    ArrayOfStatusResultData.class,
    ArrayOfLotTender.class,
    ArrayOfCPV.class,
    ArrayOfCompanyReturn.class,
    ArrayOfDateConfigReturn.class,
    ArrayOfPublicProcurementLaw.class,
    ArrayOfTenderRegulation.class,
    ArrayOfSpecificsPublicProcurementLaw.class,
    ArrayOfVobagVergabeBez.class,
    ArrayOfTenderConfigFormsets.class,
    ArrayOfRegulationDetail.class,
    ArrayOfTenderConfigFederalStates.class,
    ArrayOfTenderCreationCPV.class,
    ArrayOfAttachment.class,
    ArrayOfTenderCreationLotsDetails.class,
    ArrayOfTenderCreationNachweise.class,
    ArrayOfTenderCreationKriterien.class,
    ArrayOfCompanyImport.class,
    ArrayOfGaebReturn.class
})
public class Array {

    @XmlAnyElement(lax = true)
    protected List<?> any;
    @XmlAttribute(name = "arrayType", namespace = "http://schemas.xmlsoap.org/soap/encoding/")
    protected java.lang.String arrayType;
    @XmlAttribute(name = "offset", namespace = "http://schemas.xmlsoap.org/soap/encoding/")
    protected java.lang.String offset;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;
    @XmlAttribute(name = "href")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String href;
    @XmlAnyAttribute
    private Map<QName, java.lang.String> otherAttributes = new HashMap<QName, java.lang.String>();

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<?> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Ruft den Wert der arrayType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getArrayType() {
        return arrayType;
    }

    /**
     * Legt den Wert der arrayType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setArrayType(java.lang.String value) {
        this.arrayType = value;
    }

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOffset() {
        return offset;
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOffset(java.lang.String value) {
        this.offset = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der href-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getHref() {
        return href;
    }

    /**
     * Legt den Wert der href-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setHref(java.lang.String value) {
        this.href = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, java.lang.String> getOtherAttributes() {
        return otherAttributes;
    }

}
