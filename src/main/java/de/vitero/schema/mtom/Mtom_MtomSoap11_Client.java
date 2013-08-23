
package de.vitero.schema.mtom;

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
 * 2013-08-23T08:45:11.353+02:00
 * Generated source version: 2.7.5
 * 
 */
public final class Mtom_MtomSoap11_Client {

    private static final QName SERVICE_NAME = new QName("http://www.vitero.de/schema/mtom", "MtomService");

    private Mtom_MtomSoap11_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = MtomService.WSDL_LOCATION;
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
      
        MtomService ss = new MtomService(wsdlURL, SERVICE_NAME);
        Mtom port = ss.getMtomSoap11();  
        
        {
        System.out.println("Invoking loadFile...");
        de.vitero.schema.mtom.IdWrapper _loadFile_loadFileRequest = null;
        de.vitero.schema.mtom.FileWrapper _loadFile__return = port.loadFile(_loadFile_loadFileRequest);
        System.out.println("loadFile.result=" + _loadFile__return);


        }
        {
        System.out.println("Invoking storeFile...");
        de.vitero.schema.mtom.FileWrapper _storeFile_storeFileRequest = null;
        de.vitero.schema.mtom.IdWrapper _storeFile__return = port.storeFile(_storeFile_storeFileRequest);
        System.out.println("storeFile.result=" + _storeFile__return);


        }
        {
        System.out.println("Invoking storeAvatar...");
        de.vitero.schema.mtom.CompleteAvatarWrapper _storeAvatar_storeAvatarRequest = null;
        port.storeAvatar(_storeAvatar_storeAvatarRequest);


        }
        {
        System.out.println("Invoking loadAvatar...");
        de.vitero.schema.mtom.AvatarInformation _loadAvatar_loadAvatarRequest = null;
        de.vitero.schema.mtom.AvatarWrapper _loadAvatar__return = port.loadAvatar(_loadAvatar_loadAvatarRequest);
        System.out.println("loadAvatar.result=" + _loadAvatar__return);


        }

        System.exit(0);
    }

}
