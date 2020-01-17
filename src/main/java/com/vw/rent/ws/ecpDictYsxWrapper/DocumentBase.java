
package com.vw.rent.ws.ecpDictYsxWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>documentBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="documentBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentDefinition" type="{http://irwx508.ecpvw.credit.faf.com/}documentDefinition" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sequenceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentBase", propOrder = {
    "documentDefinition",
    "id",
    "sequenceName"
})
@XmlSeeAlso({
    DictYsxQuery.class
})
public abstract class DocumentBase {

    protected DocumentDefinition documentDefinition;
    protected long id;
    protected String sequenceName;

    /**
     * 获取documentDefinition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocumentDefinition }
     *     
     */
    public DocumentDefinition getDocumentDefinition() {
        return documentDefinition;
    }

    /**
     * 设置documentDefinition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDefinition }
     *     
     */
    public void setDocumentDefinition(DocumentDefinition value) {
        this.documentDefinition = value;
    }

    /**
     * 获取id属性的值。
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * 获取sequenceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceName() {
        return sequenceName;
    }

    /**
     * 设置sequenceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceName(String value) {
        this.sequenceName = value;
    }

}
