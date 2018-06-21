
package de.vitero.schema.customer;

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
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-15T21:49:26.886+02:00
 * Generated source version: 3.2.4
 *
 */
public final class Customer_CustomerSoap11_Client {

    private static final QName SERVICE_NAME = new QName("http://www.vitero.de/schema/customer", "CustomerService");

    private Customer_CustomerSoap11_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CustomerService.WSDL_LOCATION;
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

        CustomerService ss = new CustomerService(wsdlURL, SERVICE_NAME);
        Customer port = ss.getCustomerSoap11();

        {
        System.out.println("Invoking success...");
        java.lang.String _success_successRequest = "";
        de.vitero.schema.customer.SuccessResponse _success__return = port.success(_success_successRequest);
        System.out.println("success.result=" + _success__return);


        }
        {
        System.out.println("Invoking createCustomer...");
        de.vitero.schema.customer.CreateCustomerRequest _createCustomer_createCustomerRequest = null;
        de.vitero.schema.customer.Customerid _createCustomer__return = port.createCustomer(_createCustomer_createCustomerRequest);
        System.out.println("createCustomer.result=" + _createCustomer__return);


        }
        {
        System.out.println("Invoking getCustomerByName...");
        de.vitero.schema.customer.GetCustomerByNameRequest _getCustomerByName_getCustomerByNameRequest = null;
        de.vitero.schema.customer.Customer_Type _getCustomerByName__return = port.getCustomerByName(_getCustomerByName_getCustomerByNameRequest);
        System.out.println("getCustomerByName.result=" + _getCustomerByName__return);


        }
        {
        System.out.println("Invoking moveUserToCustomer...");
        de.vitero.schema.customer.MoveUserToCustomerRequest _moveUserToCustomer_moveUserToCustomerRequest = null;
        port.moveUserToCustomer(_moveUserToCustomer_moveUserToCustomerRequest);


        }
        {
        System.out.println("Invoking getCustomer...");
        de.vitero.schema.customer.Customerid _getCustomer_getCustomerRequest = null;
        de.vitero.schema.customer.Customer_Type _getCustomer__return = port.getCustomer(_getCustomer_getCustomerRequest);
        System.out.println("getCustomer.result=" + _getCustomer__return);


        }
        {
        System.out.println("Invoking deleteCustomer...");
        de.vitero.schema.customer.Customerid _deleteCustomer_deleteCustomerRequest = null;
        port.deleteCustomer(_deleteCustomer_deleteCustomerRequest);


        }
        {
        System.out.println("Invoking removeUserFromCustomer...");
        de.vitero.schema.customer.Customeriduserid _removeUserFromCustomer_removeUserFromCustomerRequest = null;
        port.removeUserFromCustomer(_removeUserFromCustomer_removeUserFromCustomerRequest);


        }
        {
        System.out.println("Invoking getCustomerList...");
        java.lang.Object _getCustomerList_getCustomerListRequest = new java.lang.Object();
        de.vitero.schema.customer.GetCustomerListResponse _getCustomerList__return = port.getCustomerList(_getCustomerList_getCustomerListRequest);
        System.out.println("getCustomerList.result=" + _getCustomerList__return);


        }
        {
        System.out.println("Invoking updateCustomer...");
        de.vitero.schema.customer.UpdateCustomerRequest _updateCustomer_updateCustomerRequest = null;
        port.updateCustomer(_updateCustomer_updateCustomerRequest);


        }
        {
        System.out.println("Invoking addUserToCustomer...");
        de.vitero.schema.customer.Customeriduserid _addUserToCustomer_addUserToCustomerRequest = null;
        port.addUserToCustomer(_addUserToCustomer_addUserToCustomerRequest);


        }
        {
        System.out.println("Invoking moveAllUsersToCustomer...");
        de.vitero.schema.customer.MoveAllUsersToCustomerRequest _moveAllUsersToCustomer_moveAllUsersToCustomerRequest = null;
        port.moveAllUsersToCustomer(_moveAllUsersToCustomer_moveAllUsersToCustomerRequest);


        }

        System.exit(0);
    }

}
