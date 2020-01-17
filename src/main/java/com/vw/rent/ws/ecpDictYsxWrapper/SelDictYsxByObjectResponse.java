
package com.vw.rent.ws.ecpDictYsxWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>selDictYsxByObjectResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="selDictYsxByObjectResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://irwx508.ecpvw.credit.faf.com/}ecpDictYsxResponseDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selDictYsxByObjectResult", propOrder = {
    "_return"
})
public class SelDictYsxByObjectResponse {

    @XmlElement(name = "return")
    protected EcpDictYsxResponseDTO _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EcpDictYsxResponseDTO }
     *     
     */
    public EcpDictYsxResponseDTO getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EcpDictYsxResponseDTO }
     *     
     */
    public void setReturn(EcpDictYsxResponseDTO value) {
        this._return = value;
    }

}
