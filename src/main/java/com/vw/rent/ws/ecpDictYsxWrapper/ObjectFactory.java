
package com.vw.rent.ws.ecpDictYsxWrapper;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vw.rent.ws.EcpDictYsxWrapper package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SelDictYsxByObject_QNAME = new QName("http://irwx508.ecpvw.credit.faf.com/", "selDictYsxByObject");
    private final static QName _SelDictYsxByObjectResponse_QNAME = new QName("http://irwx508.ecpvw.credit.faf.com/", "selDictYsxByObjectResponse");
    private final static QName _Exception_QNAME = new QName("http://irwx508.ecpvw.credit.faf.com/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vw.rent.ws.EcpDictYsxWrapper
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelDictYsxByObject }
     * 
     */
    public SelDictYsxByObject createSelDictYsxByObject() {
        return new SelDictYsxByObject();
    }

    /**
     * Create an instance of {@link SelDictYsxByObjectResponse }
     * 
     */
    public SelDictYsxByObjectResponse createSelDictYsxByObjectResponse() {
        return new SelDictYsxByObjectResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link DictYsxQuery }
     * 
     */
    public DictYsxQuery createDictYsxQuery() {
        return new DictYsxQuery();
    }

    /**
     * Create an instance of {@link DocumentAttributeCollection }
     * 
     */
    public DocumentAttributeCollection createDocumentAttributeCollection() {
        return new DocumentAttributeCollection();
    }

    /**
     * Create an instance of {@link EcpDictYsxRequestDTO }
     * 
     */
    public EcpDictYsxRequestDTO createEcpDictYsxRequestDTO() {
        return new EcpDictYsxRequestDTO();
    }

    /**
     * Create an instance of {@link EcpDictYsxResponseDTO }
     * 
     */
    public EcpDictYsxResponseDTO createEcpDictYsxResponseDTO() {
        return new EcpDictYsxResponseDTO();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link DocumentDefinition }
     * 
     */
    public DocumentDefinition createDocumentDefinition() {
        return new DocumentDefinition();
    }

    /**
     * Create an instance of {@link ResponseMessage }
     * 
     */
    public ResponseMessage createResponseMessage() {
        return new ResponseMessage();
    }

    /**
     * Create an instance of {@link CollectionBase }
     * 
     */
    public CollectionBase createCollectionBase() {
        return new CollectionBase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelDictYsxByObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://irwx508.ecpvw.credit.faf.com/", name = "selDictYsxByObject")
    public JAXBElement<SelDictYsxByObject> createSelDictYsxByObject(SelDictYsxByObject value) {
        return new JAXBElement<SelDictYsxByObject>(_SelDictYsxByObject_QNAME, SelDictYsxByObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelDictYsxByObjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://irwx508.ecpvw.credit.faf.com/", name = "selDictYsxByObjectResponse")
    public JAXBElement<SelDictYsxByObjectResponse> createSelDictYsxByObjectResponse(SelDictYsxByObjectResponse value) {
        return new JAXBElement<SelDictYsxByObjectResponse>(_SelDictYsxByObjectResponse_QNAME, SelDictYsxByObjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://irwx508.ecpvw.credit.faf.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
