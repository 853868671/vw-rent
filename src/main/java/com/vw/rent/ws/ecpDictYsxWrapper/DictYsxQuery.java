
package com.vw.rent.ws.ecpDictYsxWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>dictYsxQuery complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="dictYsxQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://irwx508.ecpvw.credit.faf.com/}documentBase">
 *       &lt;sequence>
 *         &lt;element name="comType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dicType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="factoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dictYsxQuery", propOrder = {
    "comType",
    "dicType",
    "factoryType",
    "fatherId",
    "name",
    "status",
    "value",
    "pType"
})
public class DictYsxQuery
    extends DocumentBase
{

    protected long comType;
    protected String dicType;
    protected String factoryType;
    protected String fatherId;
    protected String name;
    protected long status;
    protected String value;
    protected long pType;

    /**
     * 获取comType属性的值。
     * 
     */
    public long getComType() {
        return comType;
    }

    /**
     * 设置comType属性的值。
     * 
     */
    public void setComType(long value) {
        this.comType = value;
    }

    /**
     * 获取dicType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicType() {
        return dicType;
    }

    /**
     * 设置dicType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicType(String value) {
        this.dicType = value;
    }

    /**
     * 获取factoryType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoryType() {
        return factoryType;
    }

    /**
     * 设置factoryType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactoryType(String value) {
        this.factoryType = value;
    }

    /**
     * 获取fatherId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherId() {
        return fatherId;
    }

    /**
     * 设置fatherId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherId(String value) {
        this.fatherId = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取status属性的值。
     * 
     */
    public long getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     */
    public void setStatus(long value) {
        this.status = value;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取pType属性的值。
     * 
     */
    public long getPType() {
        return pType;
    }

    /**
     * 设置pType属性的值。
     * 
     */
    public void setPType(long value) {
        this.pType = value;
    }

}
