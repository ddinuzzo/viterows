
package de.vitero.schema.cms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour wrappedFolder complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="wrappedFolder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="folder" type="{http://www.vitero.de/schema/cms}folder"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wrappedFolder", propOrder = {

})
public class WrappedFolder {

    @XmlElement(required = true)
    protected Folder folder;

    /**
     * Obtient la valeur de la propriété folder.
     * 
     * @return
     *     possible object is
     *     {@link Folder }
     *     
     */
    public Folder getFolder() {
        return folder;
    }

    /**
     * Définit la valeur de la propriété folder.
     * 
     * @param value
     *     allowed object is
     *     {@link Folder }
     *     
     */
    public void setFolder(Folder value) {
        this.folder = value;
    }

}
