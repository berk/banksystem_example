//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.04.12 at 03:14:00 AM PDT 
//


package com.fusiontech.bank.model;


/**
 * Java content class for TransactionType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/Documents and Settings/mberkovich/My Documents/My School/CSUN/3. 2006_Spring/COMP 380/workspace/banksystem/docroot/bankservicemodels.xsd line 47)
 * <p>
 * <pre>
 * &lt;complexType name="TransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="availableBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="clearFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface TransactionType {


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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setType(java.lang.String value);

    /**
     * Gets the value of the currentBalance property.
     * 
     */
    double getCurrentBalance();

    /**
     * Sets the value of the currentBalance property.
     * 
     */
    void setCurrentBalance(double value);

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getDateCreated();

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setDateCreated(java.util.Calendar value);

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

    /**
     * Gets the value of the customerId property.
     * 
     */
    int getCustomerId();

    /**
     * Sets the value of the customerId property.
     * 
     */
    void setCustomerId(int value);

    /**
     * Gets the value of the transactionId property.
     * 
     */
    int getTransactionId();

    /**
     * Sets the value of the transactionId property.
     * 
     */
    void setTransactionId(int value);

    /**
     * Gets the value of the clearFlag property.
     * 
     */
    int getClearFlag();

    /**
     * Sets the value of the clearFlag property.
     * 
     */
    void setClearFlag(int value);

    /**
     * Gets the value of the availableBalance property.
     * 
     */
    double getAvailableBalance();

    /**
     * Sets the value of the availableBalance property.
     * 
     */
    void setAvailableBalance(double value);

}
