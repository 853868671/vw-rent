
package com.vw.rent.ws.ecpDictYsxWrapper;

import com.vw.rent.ws.requestCommon.RequestHeaderCommon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>requestHeader complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="requestHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applyKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applySource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bussType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comtype" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ptype" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestHeader", propOrder = {
    "applyKey",
    "applySource",
    "bussType",
    "comtype",
    "ptype",
    "serialNo"
})
@XmlSeeAlso({
    EcpDictYsxRequestDTO.class
})
public class RequestHeader implements RequestHeaderCommon {

    protected String applyKey;
    protected String applySource;
    protected String bussType;
    protected long comtype;
    protected long ptype;
    protected String serialNo;

    /**
     * 获取applyKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyKey() {
        return applyKey;
    }

    /**
     * 设置applyKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyKey(String value) {
        this.applyKey = value;
    }

    /**
     * 获取applySource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplySource() {
        return applySource;
    }

    /**
     * 设置applySource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplySource(String value) {
        this.applySource = value;
    }

    /**
     * 获取bussType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBussType() {
        return bussType;
    }

    /**
     * 设置bussType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBussType(String value) {
        this.bussType = value;
    }

    /**
     * 获取comtype属性的值。
     * 
     */
    public long getComtype() {
        return comtype;
    }

    /**
     * 设置comtype属性的值。
     * 
     */
    public void setComtype(long value) {
        this.comtype = value;
    }

    /**
     * 获取ptype属性的值。
     * 
     */
    public long getPtype() {
        return ptype;
    }

    /**
     * 设置ptype属性的值。
     * 
     */
    public void setPtype(long value) {
        this.ptype = value;
    }

    /**
     * 获取serialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * 设置serialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

}
