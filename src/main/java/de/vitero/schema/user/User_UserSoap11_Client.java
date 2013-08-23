
package de.vitero.schema.user;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-08-23T08:45:11.768+02:00
 * Generated source version: 2.7.5
 * 
 */
public final class User_UserSoap11_Client {

    private static final QName SERVICE_NAME = new QName("http://www.vitero.de/schema/user", "UserService");

    private User_UserSoap11_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = UserService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        UserService ss = new UserService(wsdlURL, SERVICE_NAME);
        User port = ss.getUserSoap11();  
        
        {
        System.out.println("Invoking deleteUser...");
        de.vitero.schema.user.Userid _deleteUser_deleteUserRequest = null;
        port.deleteUser(_deleteUser_deleteUserRequest);


        }
        {
        System.out.println("Invoking updateUser...");
        de.vitero.schema.user.UpdateUserRequest _updateUser_updateUserRequest = null;
        port.updateUser(_updateUser_updateUserRequest);


        }
        {
        System.out.println("Invoking getUserListByGroup...");
        de.vitero.schema.user.GetUserListByGroupRequest _getUserListByGroup_getUserListByGroupRequest = null;
        de.vitero.schema.user.Userlist _getUserListByGroup__return = port.getUserListByGroup(_getUserListByGroup_getUserListByGroupRequest);
        System.out.println("getUserListByGroup.result=" + _getUserListByGroup__return);


        }
        {
        System.out.println("Invoking getUserList...");
        java.lang.Object _getUserList_getUserListRequest = new java.lang.Object();
        de.vitero.schema.user.Userlist _getUserList__return = port.getUserList(_getUserList_getUserListRequest);
        System.out.println("getUserList.result=" + _getUserList__return);


        }
        {
        System.out.println("Invoking getUserListByCustomer...");
        de.vitero.schema.user.GetUserListByCustomerRequest _getUserListByCustomer_getUserListByCustomerRequest = null;
        de.vitero.schema.user.Userlist _getUserListByCustomer__return = port.getUserListByCustomer(_getUserListByCustomer_getUserListByCustomerRequest);
        System.out.println("getUserListByCustomer.result=" + _getUserListByCustomer__return);


        }
        {
        System.out.println("Invoking getUser...");
        de.vitero.schema.user.Userid _getUser_getUserRequest = null;
        de.vitero.schema.user.GetUserResponse _getUser__return = port.getUser(_getUser_getUserRequest);
        System.out.println("getUser.result=" + _getUser__return);


        }
        {
        System.out.println("Invoking getUserCount...");
        de.vitero.schema.user.GetUserCountRequest _getUserCount_getUserCountRequest = null;
        de.vitero.schema.user.GetUserCountResponse _getUserCount__return = port.getUserCount(_getUserCount_getUserCountRequest);
        System.out.println("getUserCount.result=" + _getUserCount__return);


        }
        {
        System.out.println("Invoking getUserListByPosition...");
        de.vitero.schema.user.GetUserListByPositionRequest _getUserListByPosition_getUserListByPositionRequest = null;
        de.vitero.schema.user.Userlist _getUserListByPosition__return = port.getUserListByPosition(_getUserListByPosition_getUserListByPositionRequest);
        System.out.println("getUserListByPosition.result=" + _getUserListByPosition__return);


        }
        {
        System.out.println("Invoking changePassword...");
        de.vitero.schema.user.ChangePasswordRequest _changePassword_changePasswordRequest = null;
        port.changePassword(_changePassword_changePasswordRequest);


        }
        {
        System.out.println("Invoking createUser...");
        de.vitero.schema.user.CreateUserRequest _createUser_createUserRequest = null;
        de.vitero.schema.user.Userid _createUser__return = port.createUser(_createUser_createUserRequest);
        System.out.println("createUser.result=" + _createUser__return);


        }

        System.exit(0);
    }

}
