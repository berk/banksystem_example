//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.04.12 at 03:14:00 AM PDT 
//


package com.fusiontech.bank.transports;


/**
 * Java content class for BaseTransportResponse complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/Documents and Settings/mberkovich/My Documents/My School/CSUN/3. 2006_Spring/COMP 380/workspace/banksystem/docroot/bankservicetransports.xsd line 35)
 * <p>
 * <pre>
 * &lt;complexType name="BaseTransportResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface BaseTransportResponse {


    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getErrorMsg();

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setErrorMsg(java.lang.String value);

    /**
     * Gets the value of the errorId property.
     * 
     */
    int getErrorId();

    /**
     * Sets the value of the errorId property.
     * 
     */
    void setErrorId(int value);

}