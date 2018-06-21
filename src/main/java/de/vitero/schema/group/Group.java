package de.vitero.schema.group;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-15T21:49:27.047+02:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://www.vitero.de/schema/group", name = "Group")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Group {

    @WebMethod
    @WebResult(name = "createGroupResponse", targetNamespace = "http://www.vitero.de/schema/group", partName = "createGroupResponse")
    public Groupid createGroup(
        @WebParam(partName = "createGroupRequest", name = "createGroupRequest", targetNamespace = "http://www.vitero.de/schema/group")
        CreateGroupRequest createGroupRequest
    );

    @WebMethod
    @Oneway
    public void changeEnabled(
        @WebParam(partName = "changeEnabledRequest", name = "changeEnabledRequest", targetNamespace = "http://www.vitero.de/schema/group")
        ChangeEnabledRequest changeEnabledRequest
    );

    @WebMethod
    @WebResult(name = "successResponse", targetNamespace = "http://www.vitero.de/schema/group", partName = "successResponse")
    public SuccessResponse success(
        @WebParam(partName = "successRequest", name = "successRequest", targetNamespace = "http://www.vitero.de/schema/group")
        java.lang.String successRequest
    );

    @WebMethod
    @WebResult(name = "getGroupResponse", targetNamespace = "http://www.vitero.de/schema/group", partName = "getGroupResponse")
    public Group_Type getGroup(
        @WebParam(partName = "getGroupRequest", name = "getGroupRequest", targetNamespace = "http://www.vitero.de/schema/group")
        Groupid getGroupRequest
    );

    @WebMethod
    @WebResult(name = "getGroupByNameResponse", targetNamespace = "http://www.vitero.de/schema/group", partName = "getGroupByNameResponse")
    public Group_Type getGroupByName(
        @WebParam(partName = "getGroupByNameRequest", name = "getGroupByNameRequest", targetNamespace = "http://www.vitero.de/schema/group")
        Groupnamecustomerid getGroupByNameRequest
    );

    @WebMethod
    @WebResult(name = "getGroupListByCustomerResponse", targetNamespace = "http://www.vitero.de/schema/group", partName = "getGroupListByCustomerResponse")
    public GetGroupListByCustomerResponse getGroupListByCustomer(
        @WebParam(partName = "getGroupListByCustomerRequest", name = "getGroupListByCustomerRequest", targetNamespace = "http://www.vitero.de/schema/group")
        GetGroupListByCustomerRequest getGroupListByCustomerRequest
    );

    @WebMethod
    @Oneway
    public void updateGroup(
        @WebParam(partName = "updateGroupRequest", name = "updateGroupRequest", targetNamespace = "http://www.vitero.de/schema/group")
        UpdateGroupRequest updateGroupRequest
    );

    @WebMethod
    @Oneway
    public void removeUserFromGroup(
        @WebParam(partName = "removeUserFromGroupRequest", name = "removeUserFromGroupRequest", targetNamespace = "http://www.vitero.de/schema/group")
        Groupiduserid removeUserFromGroupRequest
    );

    @WebMethod
    @Oneway
    public void addUserToGroup(
        @WebParam(partName = "addUserToGroupRequest", name = "addUserToGroupRequest", targetNamespace = "http://www.vitero.de/schema/group")
        Groupiduserid addUserToGroupRequest
    );

    @WebMethod
    @Oneway
    public void deleteGroup(
        @WebParam(partName = "deleteGroupRequest", name = "deleteGroupRequest", targetNamespace = "http://www.vitero.de/schema/group")
        Groupid deleteGroupRequest
    );

    @WebMethod
    @Oneway
    public void changeGroupRole(
        @WebParam(partName = "changeGroupRoleRequest", name = "changeGroupRoleRequest", targetNamespace = "http://www.vitero.de/schema/group")
        ChangeGroupRoleRequest changeGroupRoleRequest
    );
}
