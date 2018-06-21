
package com.project.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lodgingRes" type="{http://bookingxml.com/soap-example}lodgingRes" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lodgingRes"
})
@XmlRootElement(name = "getLodgingsResponse")
public class GetLodgingsResponse {

    @XmlElement(required = true)
    protected List<LodgingRes> lodgingRes;

    /**
     * Gets the value of the lodgingRes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lodgingRes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLodgingRes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LodgingRes }
     * 
     * 
     */
    public List<LodgingRes> getLodgingRes() {
        if (lodgingRes == null) {
            lodgingRes = new ArrayList<LodgingRes>();
        }
        return this.lodgingRes;
    }

}