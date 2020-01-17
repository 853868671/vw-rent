
package com.vw.rent.ws.ecpDictYsxWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>selDictYsxByObject complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="selDictYsxByObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestDTO" type="{http://irwx508.ecpvw.credit.faf.com/}ecpDictYsxRequestDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selDictYsxByObjectRequest", propOrder = {
    "requestDTO"
})
public class SelDictYsxByObject {

    protected EcpDictYsxRequestDTO requestDTO;

    /**
     * 获取requestDTO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EcpDictYsxRequestDTO }
     *     
     */
    public EcpDictYsxRequestDTO getRequestDTO() {
        return requestDTO;
    }

    /**
     * 设置requestDTO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EcpDictYsxRequestDTO }
     *     
     */
    public void setRequestDTO(EcpDictYsxRequestDTO value) {
        this.requestDTO = value;
    }

}
