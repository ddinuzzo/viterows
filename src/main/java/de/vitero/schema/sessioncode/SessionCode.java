package de.vitero.schema.sessioncode;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-08-23T08:45:11.560+02:00
 * Generated source version: 2.7.5
 * 
 */
@WebService(targetNamespace = "http://www.vitero.de/schema/sessioncode", name = "SessionCode")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SessionCode {

    @WebResult(name = "getSessionCodeInformationResponse", targetNamespace = "http://www.vitero.de/schema/sessioncode", partName = "getSessionCodeInformationResponse")
    @WebMethod
    public GetSessionCodeInformationResponse getSessionCodeInformation(
        @WebParam(partName = "getSessionCodeInformationRequest", name = "getSessionCodeInformationRequest", targetNamespace = "http://www.vitero.de/schema/sessioncode")
        GetSessionCodeInformationRequest getSessionCodeInformationRequest
    );

    @WebResult(name = "createPersonalGroupSessionCodeResponse", targetNamespace = "http://www.vitero.de/schema/sessioncode", partName = "createPersonalGroupSessionCodeResponse")
    @WebMethod
    public Codetype createPersonalGroupSessionCode(
        @WebParam(partName = "createPersonalGroupSessionCodeRequest", name = "createPersonalGroupSessionCodeRequest", targetNamespace = "http://www.vitero.de/schema/sessioncode")
        CreatePersonalGroupSessionCodeRequest createPersonalGroupSessionCodeRequest
    );

    @WebResult(name = "getPersonalBookingSessionCodesResponse", targetNamespace = "http://www.vitero.de/schema/sessioncode", partName = "getPersonalBookingSessionCodesResponse")
    @WebMethod
    public GetPersonalBookingSessionCodesResponse getPersonalBookingSessionCodes(
        @WebParam(partName = "getPersonalBookingSessionCodesRequest", name = "getPersonalBookingSessionCodesRequest", targetNamespace = "http://www.vitero.de/schema/sessioncode")
        GetPersonalBookingSessionCodesRequest getPersonalBookingSessionCodesRequest
    );

    @WebResult(name = "getTestroomSessionCodeResponse", targetNamespace = "http://www.vitero.de/schema/sessioncode", partName = "getTestroomSessionCodeResponse")
    @WebMethod
    public Codetype getTestroomSessionCode(
        @WebParam(partName = "getTestroomSessionCodeRequest", name = "getTestroomSessionCodeRequest", targetNamespace = "http://www.vitero.de/schema/sessioncode")
        GetTestroomSessionCodeRequest getTestroomSessionCodeRequest
    );

    @WebResult(name = "createVmsSessionCodeResponse", targetNamespace = "http://www.vitero.de/schema/sessioncode", partName = "createVmsSessionCodeResponse")
    @WebMethod
    public Codetype createVmsSessionCode(
        @WebParam(partName = "createVmsSessionCodeRequest", name = "createVmsSessionCodeRequest", targetNamespace = "http://www.vitero.de/schema/sessioncode")
        CreateVmsSessionCodeRequest createVmsSessionCodeRequest
    );

    @WebResult(name = "getPersonalGroupSessionCodesResponse", targetNamespace = "http://www.vitero.de/schema/sessioncode", partName = "getPersonalGroupSessionCodesResponse")
    @WebMethod
    public GetPersonalGroupSessionCodesResponse getPersonalGroupSessionCodes(
        @WebParam(partName = "getPersonalGroupSessionCodesRequest", name = "getPersonalGroupSessionCodesRequest", targetNamespace = "http://www.vitero.de/schema/sessioncode")
        GetPersonalGroupSessionCodesRequest getPersonalGroupSessionCodesRequest
    );

    @WebResult(name = "createBookingSessionCodeResponse", targetNamespace = "http://www.vitero.de/schema/sessioncode", partName = "createBookingSessionCodeResponse")
    @WebMethod
    public Codetype createBookingSessionCode(
        @WebParam(partName = "createBookingSessionCodeRequest", name = "createBookingSessionCodeRequest", targetNamespace = "http://www.vitero.de/schema/sessioncode")
        CreateBookingSessionCodeRequest createBookingSessionCodeRequest
    );

    @WebResult(name = "createPersonalBookingSessionCodeResponse", targetNamespace = "http://www.vitero.de/schema/sessioncode", partName = "createPersonalBookingSessionCodeResponse")
    @WebMethod
    public Codetype createPersonalBookingSessionCode(
        @WebParam(partName = "createPersonalBookingSessionCodeRequest", name = "createPersonalBookingSessionCodeRequest", targetNamespace = "http://www.vitero.de/schema/sessioncode")
        CreatePersonalBookingSessionCodeRequest createPersonalBookingSessionCodeRequest
    );

    @Oneway
    @WebMethod
    public void deleteSessionCode(
        @WebParam(partName = "deleteSessionCodeRequest", name = "deleteSessionCodeRequest", targetNamespace = "http://www.vitero.de/schema/sessioncode")
        Codetype deleteSessionCodeRequest
    );
}
