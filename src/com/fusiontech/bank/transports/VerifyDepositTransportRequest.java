//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.04.12 at 03:14:00 AM PDT 
//


package com.fusiontech.bank.transports;


/**
 * Java content class for VerifyDepositTransportRequest complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/Documents and Settings/mberkovich/My Documents/My School/CSUN/3. 2006_Spring/COMP 380/workspace/banksystem/docroot/bankservicetransports.xsd line 63)
 * <p>
 * <pre>
 * &lt;complexType name="VerifyDepositTransportRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fusiontech.com/bankservice/transports/xsd/1.0}TransactionTransportRequest">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface VerifyDepositTransportRequest
    extends com.fusiontech.bank.transports.TransactionTransportRequest
{


    /**
     * Gets the value of the amount property.
     * 
     */
    double getAmount();

    /**
     * Sets the value of the amount property.
     * 
     */
    void setAmount(double value);

    /**
     * Gets the value of the accountId property.
     * 
     */
    int getAccountId();

    /**
     * Sets the value of the accountId property.
     * 
     */
    void setAccountId(int value);

}