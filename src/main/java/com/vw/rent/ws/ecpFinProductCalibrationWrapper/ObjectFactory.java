
package com.vw.rent.ws.ecpFinProductCalibrationWrapper;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vw.rent.ws.ecpFinProductCalibrationWrapper package. 
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

    private final static QName _GetLoanProvidePlanner_QNAME = new QName("http://irwx503.ecpvw.credit.faf.com/", "getLoanProvidePlanner");
    private final static QName _GetLoanProvidePlannerResponse_QNAME = new QName("http://irwx503.ecpvw.credit.faf.com/", "getLoanProvidePlannerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vw.rent.ws.ecpFinProductCalibrationWrapper
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLoanProvidePlanner }
     * 
     */
    public GetLoanProvidePlanner createGetLoanProvidePlanner() {
        return new GetLoanProvidePlanner();
    }

    /**
     * Create an instance of {@link GetLoanProvidePlannerResponse }
     * 
     */
    public GetLoanProvidePlannerResponse createGetLoanProvidePlannerResponse() {
        return new GetLoanProvidePlannerResponse();
    }

    /**
     * Create an instance of {@link EcpFinProductCalibrationResponseDTO }
     * 
     */
    public EcpFinProductCalibrationResponseDTO createEcpFinProductCalibrationResponseDTO() {
        return new EcpFinProductCalibrationResponseDTO();
    }

    /**
     * Create an instance of {@link EcpFinProductCalibrationRequestDTO }
     * 
     */
    public EcpFinProductCalibrationRequestDTO createEcpFinProductCalibrationRequestDTO() {
        return new EcpFinProductCalibrationRequestDTO();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link EcpFinProductCalcParam }
     * 
     */
    public EcpFinProductCalcParam createEcpFinProductCalcParam() {
        return new EcpFinProductCalcParam();
    }

    /**
     * Create an instance of {@link ResponseMessage }
     * 
     */
    public ResponseMessage createResponseMessage() {
        return new ResponseMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoanProvidePlanner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://irwx503.ecpvw.credit.faf.com/", name = "getLoanProvidePlanner")
    public JAXBElement<GetLoanProvidePlanner> createGetLoanProvidePlanner(GetLoanProvidePlanner value) {
        return new JAXBElement<GetLoanProvidePlanner>(_GetLoanProvidePlanner_QNAME, GetLoanProvidePlanner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoanProvidePlannerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://irwx503.ecpvw.credit.faf.com/", name = "getLoanProvidePlannerResponse")
    public JAXBElement<GetLoanProvidePlannerResponse> createGetLoanProvidePlannerResponse(GetLoanProvidePlannerResponse value) {
        return new JAXBElement<GetLoanProvidePlannerResponse>(_GetLoanProvidePlannerResponse_QNAME, GetLoanProvidePlannerResponse.class, null, value);
    }

}
