package de.vitero.schema.customer;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-09-20T15:11:12.644+02:00
 * Generated source version: 3.3.2
 *
 */
@WebService(targetNamespace = "http://www.vitero.de/schema/customer", name = "Customer")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@org.apache.cxf.annotations.EndpointProperty(key = "soap.no.validate.parts", value = "true")
public interface Customer {

    @WebMethod
    @WebResult(name = "successResponse", targetNamespace = "http://www.vitero.de/schema/customer", partName = "successResponse")
    public SuccessResponse success(

        @WebParam(partName = "successRequest", name = "successRequest", targetNamespace = "http://www.vitero.de/schema/customer")
        java.lang.String successRequest
    );

    @WebMethod
    @WebResult(name = "createCustomerResponse", targetNamespace = "http://www.vitero.de/schema/customer", partName = "createCustomerResponse")
    public Customerid createCustomer(

        @WebParam(partName = "createCustomerRequest", name = "createCustomerRequest", targetNamespace = "http://www.vitero.de/schema/customer")
        CreateCustomerRequest createCustomerRequest
    );

    @WebMethod
    @WebResult(name = "getCustomerByNameResponse", targetNamespace = "http://www.vitero.de/schema/customer", partName = "getCustomerByNameResponse")
    public Customer_Type getCustomerByName(

        @WebParam(partName = "getCustomerByNameRequest", name = "getCustomerByNameRequest", targetNamespace = "http://www.vitero.de/schema/customer")
        GetCustomerByNameRequest getCustomerByNameRequest
    );

    @WebMethod
    @Oneway
    public void moveUserToCustomer(

        @WebParam(partName = "moveUserToCustomerRequest", name = "moveUserToCustomerRequest", targetNamespace = "http://www.vitero.de/schema/customer")
        MoveUserToCustomerRequest moveUserToCustomerRequest
    );

    @WebMethod
    @WebResult(name = "getCustomerResponse", targetNamespace = "http://www.vitero.de/schema/customer", partName = "getCustomerResponse")
    public Customer_Type getCustomer(

        @WebParam(partName = "getCustomerRequest", name = "getCustomerRequest", targetNamespace = "http://www.vitero.de/schema/customer")
        Customerid getCustomerRequest
    );

    @WebMethod
    @WebResult(name = "deleteCustomerResponse", targetNamespace = "http://www.vitero.de/schema/customer", partName = "deleteCustomerResponse")
    public SuccessResponse deleteCustomer(

        @WebParam(partName = "deleteCustomerRequest", name = "deleteCustomerRequest", targetNamespace = "http://www.vitero.de/schema/customer")
        DeleteCustomerRequest deleteCustomerRequest
    );

    @WebMethod
    @WebResult(name = "removeUserFromCustomerResponse", targetNamespace = "http://www.vitero.de/schema/customer", partName = "removeUserFromCustomerResponse")
    public SuccessResponse removeUserFromCustomer(

        @WebParam(partName = "removeUserFromCustomerRequest", name = "removeUserFromCustomerRequest", targetNamespace = "http://www.vitero.de/schema/customer")
        Customeriduserid removeUserFromCustomerRequest
    );

    @WebMethod
    @WebResult(name = "getCustomerListResponse", targetNamespace = "http://www.vitero.de/schema/customer", partName = "getCustomerListResponse")
    public GetCustomerListResponse getCustomerList(

        @WebParam(partName = "getCustomerListRequest", name = "getCustomerListRequest", targetNamespace = "http://www.vitero.de/schema/customer")
        GetCustomerListRequest getCustomerListRequest
    );

    @WebMethod
    @WebResult(name = "updateCustomerResponse", targetNamespace = "http://www.vitero.de/schema/customer", partName = "updateCustomerResponse")
    public SuccessResponse updateCustomer(

        @WebParam(partName = "updateCustomerRequest", name = "updateCustomerRequest", targetNamespace = "http://www.vitero.de/schema/customer")
        UpdateCustomerRequest updateCustomerRequest
    );

    @WebMethod
    @WebResult(name = "addUserToCustomerResponse", targetNamespace = "http://www.vitero.de/schema/customer", partName = "addUserToCustomerResponse")
    public SuccessResponse addUserToCustomer(

        @WebParam(partName = "addUserToCustomerRequest", name = "addUserToCustomerRequest", targetNamespace = "http://www.vitero.de/schema/customer")
        Customeriduserid addUserToCustomerRequest
    );

    @WebMethod
    @WebResult(name = "moveAllUsersToCustomerResponse", targetNamespace = "http://www.vitero.de/schema/customer", partName = "moveAllUsersToCustomerResponse")
    public SuccessResponse moveAllUsersToCustomer(

        @WebParam(partName = "moveAllUsersToCustomerRequest", name = "moveAllUsersToCustomerRequest", targetNamespace = "http://www.vitero.de/schema/customer")
        MoveAllUsersToCustomerRequest moveAllUsersToCustomerRequest
    );
}
