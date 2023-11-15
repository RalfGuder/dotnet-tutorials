
package https.test_arriba_net_de.dispatcher;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Attachment complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Attachment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="file_content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filesize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="is_folder" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="childs" type="{https://test.arriba-net.de/dispatcher.php?plugin=TenderCreationPlugin}ArrayOfAttachment"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attachment", propOrder = {

})
public class Attachment {

    @XmlElement(required = true)
    protected String filename;
    @XmlElement(name = "file_content", required = true)
    protected String fileContent;
    protected int filesize;
    @XmlElement(name = "is_folder")
    protected boolean isFolder;
    @XmlElement(required = true)
    protected ArrayOfAttachment childs;

    /**
     * Ruft den Wert der filename-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Legt den Wert der filename-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Ruft den Wert der fileContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileContent() {
        return fileContent;
    }

    /**
     * Legt den Wert der fileContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileContent(String value) {
        this.fileContent = value;
    }

    /**
     * Ruft den Wert der filesize-Eigenschaft ab.
     * 
     */
    public int getFilesize() {
        return filesize;
    }

    /**
     * Legt den Wert der filesize-Eigenschaft fest.
     * 
     */
    public void setFilesize(int value) {
        this.filesize = value;
    }

    /**
     * Ruft den Wert der isFolder-Eigenschaft ab.
     * 
     */
    public boolean isIsFolder() {
        return isFolder;
    }

    /**
     * Legt den Wert der isFolder-Eigenschaft fest.
     * 
     */
    public void setIsFolder(boolean value) {
        this.isFolder = value;
    }

    /**
     * Ruft den Wert der childs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public ArrayOfAttachment getChilds() {
        return childs;
    }

    /**
     * Legt den Wert der childs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public void setChilds(ArrayOfAttachment value) {
        this.childs = value;
    }

}
