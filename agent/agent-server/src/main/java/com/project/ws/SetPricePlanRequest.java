
package com.project.ws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="lodging" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="january" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="february" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="mart" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="april" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="may" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="june" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="july" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="august" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="september" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="october" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="november" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="december" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
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
    "year",
    "lodging",
    "january",
    "february",
    "mart",
    "april",
    "may",
    "june",
    "july",
    "august",
    "september",
    "october",
    "november",
    "december"
})
@XmlRootElement(name = "setPricePlanRequest")
public class SetPricePlanRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger year;
    @XmlElement(required = true)
    protected String lodging;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger january;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger february;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger mart;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger april;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger may;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger june;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger july;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger august;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger september;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger october;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger november;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger december;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYear(BigInteger value) {
        this.year = value;
    }

    /**
     * Gets the value of the lodging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLodging() {
        return lodging;
    }

    /**
     * Sets the value of the lodging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLodging(String value) {
        this.lodging = value;
    }

    /**
     * Gets the value of the january property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJanuary() {
        return january;
    }

    /**
     * Sets the value of the january property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJanuary(BigInteger value) {
        this.january = value;
    }

    /**
     * Gets the value of the february property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFebruary() {
        return february;
    }

    /**
     * Sets the value of the february property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFebruary(BigInteger value) {
        this.february = value;
    }

    /**
     * Gets the value of the mart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMart() {
        return mart;
    }

    /**
     * Sets the value of the mart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMart(BigInteger value) {
        this.mart = value;
    }

    /**
     * Gets the value of the april property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApril() {
        return april;
    }

    /**
     * Sets the value of the april property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApril(BigInteger value) {
        this.april = value;
    }

    /**
     * Gets the value of the may property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMay() {
        return may;
    }

    /**
     * Sets the value of the may property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMay(BigInteger value) {
        this.may = value;
    }

    /**
     * Gets the value of the june property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJune() {
        return june;
    }

    /**
     * Sets the value of the june property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJune(BigInteger value) {
        this.june = value;
    }

    /**
     * Gets the value of the july property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJuly() {
        return july;
    }

    /**
     * Sets the value of the july property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJuly(BigInteger value) {
        this.july = value;
    }

    /**
     * Gets the value of the august property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAugust() {
        return august;
    }

    /**
     * Sets the value of the august property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAugust(BigInteger value) {
        this.august = value;
    }

    /**
     * Gets the value of the september property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeptember() {
        return september;
    }

    /**
     * Sets the value of the september property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeptember(BigInteger value) {
        this.september = value;
    }

    /**
     * Gets the value of the october property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOctober() {
        return october;
    }

    /**
     * Sets the value of the october property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOctober(BigInteger value) {
        this.october = value;
    }

    /**
     * Gets the value of the november property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNovember() {
        return november;
    }

    /**
     * Sets the value of the november property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNovember(BigInteger value) {
        this.november = value;
    }

    /**
     * Gets the value of the december property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecember() {
        return december;
    }

    /**
     * Sets the value of the december property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecember(BigInteger value) {
        this.december = value;
    }

}
