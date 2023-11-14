
package localhost._4434.tender;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.xmlsoap.schemas.soap.encoding.Array;


/**
 * <p>Java-Klasse für ArrayOfPublicProcurementLaw complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPublicProcurementLaw"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://schemas.xmlsoap.org/soap/encoding/}Array"&gt;
 *       &lt;attribute ref="{http://schemas.xmlsoap.org/soap/encoding/}arrayType"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPublicProcurementLaw")
public class ArrayOfPublicProcurementLaw
    extends Array
{
  
  @XmlElement(name = "item")
  private List<PublicProcurementLaw> items;

  
  
  public ArrayOfPublicProcurementLaw() {
    super();
    this.items = new ArrayList<PublicProcurementLaw>();
  }

  @Override
  public List<?> getAny() {
    return this.items;
  }

  public void add(PublicProcurementLaw item) {
    this.items.add(item);
  }
  


}
