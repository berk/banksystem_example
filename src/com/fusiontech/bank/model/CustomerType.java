//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.04.12 at 03:14:00 AM PDT 
//


package com.fusiontech.bank.model;


/**
 * Java content class for CustomerType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/Documents and Settings/mberkovich/My Documents/My School/CSUN/3. 2006_Spring/COMP 380/workspace/banksystem/docroot/bankservicemodels.xsd line 16)
 * <p>
 * <pre>
 * &lt;complexType name="CustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="card" type="{http://www.fusiontech.com/bankservice/model/xsd/1.0}CardType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="account" type="{http://www.fusiontech.com/bankservice/model/xsd/1.0}AccountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface CustomerType {


    /**
     * Gets the value of the Account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.fusiontech.bank.model.AccountType}
     * 
     */
    java.util.List getAccount();

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getFirstName();

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setFirstName(java.lang.String value);

    /**
     * Gets the value of the Card property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Card property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.fusiontech.bank.model.CardType}
     * 
     */
    java.util.List getCard();

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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getLastName();

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setLastName(java.lang.String value);

}
