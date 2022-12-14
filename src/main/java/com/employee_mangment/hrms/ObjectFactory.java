//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.17 at 10:18:14 PM EET 
//


package com.employee_mangment.hrms;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.employee_mangment.hrms package. 
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

    private final static QName _GetEmployeeRequest_QNAME = new QName("http://employee_mangment.com/hrms", "GetEmployeeRequest");
    private final static QName _RemoveEmployeeRequest_QNAME = new QName("http://employee_mangment.com/hrms", "RemoveEmployeeRequest");
    private final static QName _GetAllEmployeeResponse_QNAME = new QName("http://employee_mangment.com/hrms", "GetAllEmployeeResponse");
    private final static QName _GetAllEmployeeRequest_QNAME = new QName("http://employee_mangment.com/hrms", "GetAllEmployeeRequest");
    private final static QName _GetEmployeeResponse_QNAME = new QName("http://employee_mangment.com/hrms", "GetEmployeeResponse");
    private final static QName _RemoveEmployeeResponse_QNAME = new QName("http://employee_mangment.com/hrms", "RemoveEmployeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.employee_mangment.hrms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveEmployeeResponse }
     * 
     */
    public RemoveEmployeeResponse createRemoveEmployeeResponse() {
        return new RemoveEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetAllEmployeeResponse }
     * 
     */
    public GetAllEmployeeResponse createGetAllEmployeeResponse() {
        return new GetAllEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetAllEmployeeRequest }
     * 
     */
    public GetAllEmployeeRequest createGetAllEmployeeRequest() {
        return new GetAllEmployeeRequest();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeRequest }
     * 
     */
    public GetEmployeeRequest createGetEmployeeRequest() {
        return new GetEmployeeRequest();
    }

    /**
     * Create an instance of {@link RemoveEmployeeRequest }
     * 
     */
    public RemoveEmployeeRequest createRemoveEmployeeRequest() {
        return new RemoveEmployeeRequest();
    }

    /**
     * Create an instance of {@link EmployeeDetails }
     * 
     */
    public EmployeeDetails createEmployeeDetails() {
        return new EmployeeDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_mangment.com/hrms", name = "GetEmployeeRequest")
    public JAXBElement<GetEmployeeRequest> createGetEmployeeRequest(GetEmployeeRequest value) {
        return new JAXBElement<GetEmployeeRequest>(_GetEmployeeRequest_QNAME, GetEmployeeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEmployeeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_mangment.com/hrms", name = "RemoveEmployeeRequest")
    public JAXBElement<RemoveEmployeeRequest> createRemoveEmployeeRequest(RemoveEmployeeRequest value) {
        return new JAXBElement<RemoveEmployeeRequest>(_RemoveEmployeeRequest_QNAME, RemoveEmployeeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_mangment.com/hrms", name = "GetAllEmployeeResponse")
    public JAXBElement<GetAllEmployeeResponse> createGetAllEmployeeResponse(GetAllEmployeeResponse value) {
        return new JAXBElement<GetAllEmployeeResponse>(_GetAllEmployeeResponse_QNAME, GetAllEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployeeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_mangment.com/hrms", name = "GetAllEmployeeRequest")
    public JAXBElement<GetAllEmployeeRequest> createGetAllEmployeeRequest(GetAllEmployeeRequest value) {
        return new JAXBElement<GetAllEmployeeRequest>(_GetAllEmployeeRequest_QNAME, GetAllEmployeeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_mangment.com/hrms", name = "GetEmployeeResponse")
    public JAXBElement<GetEmployeeResponse> createGetEmployeeResponse(GetEmployeeResponse value) {
        return new JAXBElement<GetEmployeeResponse>(_GetEmployeeResponse_QNAME, GetEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_mangment.com/hrms", name = "RemoveEmployeeResponse")
    public JAXBElement<RemoveEmployeeResponse> createRemoveEmployeeResponse(RemoveEmployeeResponse value) {
        return new JAXBElement<RemoveEmployeeResponse>(_RemoveEmployeeResponse_QNAME, RemoveEmployeeResponse.class, null, value);
    }

}
