//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.04.12 at 03:14:00 AM PDT 
//


package com.fusiontech.bank.transports;


/**
 * Java content class for TransactionTransportResponse complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/Documents and Settings/mberkovich/My Documents/My School/CSUN/3. 2006_Spring/COMP 380/workspace/banksystem/docroot/bankservicetransports.xsd line 53)
 * <p>
 * <pre>
 * &lt;complexType name="TransactionTransportResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fusiontech.com/bankservice/transports/xsd/1.0}BaseTransportResponse">
 *       &lt;sequence>
 *         &lt;element name="transaction" type="{http://www.fusiontech.com/bankservice/model/xsd/1.0}TransactionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface TransactionTransportResponse
    extends com.fusiontech.bank.transports.BaseTransportResponse
{


    /**
     * Gets the value of the Transaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Transaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.fusiontech.bank.model.TransactionType}
     * 
     */
    java.util.List getTransaction();

}
