
package com.vw.rent.ws.ecpFinProductCalibrationWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getLoanProvidePlanner complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getLoanProvidePlanner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestDTO" type="{http://irwx503.ecpvw.credit.faf.com/}ecpFinProductCalibrationRequestDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLoanProvidePlanner", propOrder = {
    "requestDTO"
})
public class GetLoanProvidePlanner {

    protected EcpFinProductCalibrationRequestDTO requestDTO;

    /**
     * 获取requestDTO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EcpFinProductCalibrationRequestDTO }
     *     
     */
    public EcpFinProductCalibrationRequestDTO getRequestDTO() {
        return requestDTO;
    }

    /**
     * 设置requestDTO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EcpFinProductCalibrationRequestDTO }
     *     
     */
    public void setRequestDTO(EcpFinProductCalibrationRequestDTO value) {
        this.requestDTO = value;
    }

}
