
package com.vw.rent.ws.ecpFinProductCalibrationWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ecpFinProductCalibrationRequestDTO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ecpFinProductCalibrationRequestDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://irwx503.ecpvw.credit.faf.com/}requestHeader">
 *       &lt;sequence>
 *         &lt;element name="param" type="{http://irwx503.ecpvw.credit.faf.com/}ecpFinProductCalcParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecpFinProductCalibrationRequestDTO", propOrder = {
    "param"
})
public class EcpFinProductCalibrationRequestDTO
    extends RequestHeader
{

    protected EcpFinProductCalcParam param;

    /**
     * 获取param属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EcpFinProductCalcParam }
     *     
     */
    public EcpFinProductCalcParam getParam() {
        return param;
    }

    /**
     * 设置param属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EcpFinProductCalcParam }
     *     
     */
    public void setParam(EcpFinProductCalcParam value) {
        this.param = value;
    }

}
