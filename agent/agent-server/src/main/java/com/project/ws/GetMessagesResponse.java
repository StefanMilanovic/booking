package com.project.ws;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="messageRes" type="{http://bookingxml.com/soap-example}messageRes" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "messageRes"
})
@XmlRootElement(name = "getMessagesResponse")
public class GetMessagesResponse {

    @XmlElement(required = true)
    protected List<MessageRes> messageRes;

    /**
     * Gets the value of the messageRes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageRes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageRes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageRes }
     */
    public List<MessageRes> getMessageRes() {
        if (messageRes == null) {
            messageRes = new ArrayList<MessageRes>();
        }
        return this.messageRes;
    }

}
