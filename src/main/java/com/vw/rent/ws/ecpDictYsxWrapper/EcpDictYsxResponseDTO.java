
package com.vw.rent.ws.ecpDictYsxWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ecpDictYsxResponseDTO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ecpDictYsxResponseDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://irwx508.ecpvw.credit.faf.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="dictList" type="{http://irwx508.ecpvw.credit.faf.com/}dictYsxQuery" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecpDictYsxResponseDTO", propOrder = {
    "dictList"
})
public class EcpDictYsxResponseDTO
    extends ResponseMessage
{

    @XmlElement(nillable = true)
    protected List<DictYsxQuery> dictList;

    /**
     * Gets the value of the dictList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dictList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDictList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DictYsxQuery }
     * 
     * 
     */
    public List<DictYsxQuery> getDictList() {
        if (dictList == null) {
            dictList = new ArrayList<DictYsxQuery>();
        }
        return this.dictList;
    }

}
