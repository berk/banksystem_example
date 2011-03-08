//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.04.12 at 03:14:00 AM PDT 
//


package com.fusiontech.bank.transports;

import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fusiontech.bank.transports package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends com.fusiontech.bank.model.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(39, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static com.fusiontech.bank.model.impl.runtime.GrammarInfo grammarInfo = new com.fusiontech.bank.model.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (com.fusiontech.bank.transports.ObjectFactory.class));
    public final static java.lang.Class version = (com.fusiontech.bank.transports.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((com.fusiontech.bank.transports.VerifyDepositTransportResponse.class), "com.fusiontech.bank.transports.impl.VerifyDepositTransportResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.DepositTransportResponse.class), "com.fusiontech.bank.transports.impl.DepositTransportResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.GetAccountBalanceResponse.class), "com.fusiontech.bank.transports.impl.GetAccountBalanceResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.TransactionTransportRequest.class), "com.fusiontech.bank.transports.impl.TransactionTransportRequestImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.TransactionTransportResponse.class), "com.fusiontech.bank.transports.impl.TransactionTransportResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.TransferBalanceTransportRequest.class), "com.fusiontech.bank.transports.impl.TransferBalanceTransportRequestImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.GetAccountBalanceTransportRequest.class), "com.fusiontech.bank.transports.impl.GetAccountBalanceTransportRequestImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.WithdrawTransportRequest.class), "com.fusiontech.bank.transports.impl.WithdrawTransportRequestImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.BaseTransportResponse.class), "com.fusiontech.bank.transports.impl.BaseTransportResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.VerifyDepositResponse.class), "com.fusiontech.bank.transports.impl.VerifyDepositResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.TransferBalanceTransportResponse.class), "com.fusiontech.bank.transports.impl.TransferBalanceTransportResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.VerifyDeposit.class), "com.fusiontech.bank.transports.impl.VerifyDepositImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.GetAccountListTransportResponse.class), "com.fusiontech.bank.transports.impl.GetAccountListTransportResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.GetAccountBalance.class), "com.fusiontech.bank.transports.impl.GetAccountBalanceImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.GetAccountListTransportRequest.class), "com.fusiontech.bank.transports.impl.GetAccountListTransportRequestImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.WithdrawTransportResponse.class), "com.fusiontech.bank.transports.impl.WithdrawTransportResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.VerifyDepositTransportRequest.class), "com.fusiontech.bank.transports.impl.VerifyDepositTransportRequestImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.Deposit.class), "com.fusiontech.bank.transports.impl.DepositImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.DepositTransportRequest.class), "com.fusiontech.bank.transports.impl.DepositTransportRequestImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.GetAccountList.class), "com.fusiontech.bank.transports.impl.GetAccountListImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.DepositResponse.class), "com.fusiontech.bank.transports.impl.DepositResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.GetAccountListResponse.class), "com.fusiontech.bank.transports.impl.GetAccountListResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.BaseTransportRequest.class), "com.fusiontech.bank.transports.impl.BaseTransportRequestImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.WithdrawResponse.class), "com.fusiontech.bank.transports.impl.WithdrawResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.TransferBalance.class), "com.fusiontech.bank.transports.impl.TransferBalanceImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.GetAccountBalanceTransportResponse.class), "com.fusiontech.bank.transports.impl.GetAccountBalanceTransportResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.TransferBalanceResponse.class), "com.fusiontech.bank.transports.impl.TransferBalanceResponseImpl");
        defaultImplementations.put((com.fusiontech.bank.transports.Withdraw.class), "com.fusiontech.bank.transports.impl.WithdrawImpl");
        rootTagMap.put(new javax.xml.namespace.QName("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "deposit"), (com.fusiontech.bank.transports.Deposit.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "verifyDeposit"), (com.fusiontech.bank.transports.VerifyDeposit.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "getAccountBalanceResponse"), (com.fusiontech.bank.transports.GetAccountBalanceResponse.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "getAccountListResponse"), (com.fusiontech.bank.transports.GetAccountListResponse.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "transferBalance"), (com.fusiontech.bank.transports.TransferBalance.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "getAccountList"), (com.fusiontech.bank.transports.GetAccountList.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "withdraw"), (com.fusiontech.bank.transports.Withdraw.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "getAccountBalance"), (com.fusiontech.bank.transports.GetAccountBalance.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "withdrawResponse"), (com.fusiontech.bank.transports.WithdrawResponse.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "depositResponse"), (com.fusiontech.bank.transports.DepositResponse.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "transferBalanceResponse"), (com.fusiontech.bank.transports.TransferBalanceResponse.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "verifyDepositResponse"), (com.fusiontech.bank.transports.VerifyDepositResponse.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fusiontech.bank.transports
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param value
     *     the value of the property to be set
     * @param name
     *     the name of the property to retrieve
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of VerifyDepositTransportResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.VerifyDepositTransportResponse createVerifyDepositTransportResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.VerifyDepositTransportResponseImpl();
    }

    /**
     * Create an instance of DepositTransportResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.DepositTransportResponse createDepositTransportResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.DepositTransportResponseImpl();
    }

    /**
     * Create an instance of GetAccountBalanceResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.GetAccountBalanceResponse createGetAccountBalanceResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.GetAccountBalanceResponseImpl();
    }

    /**
     * Create an instance of TransactionTransportRequest
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.TransactionTransportRequest createTransactionTransportRequest()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.TransactionTransportRequestImpl();
    }

    /**
     * Create an instance of TransactionTransportResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.TransactionTransportResponse createTransactionTransportResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.TransactionTransportResponseImpl();
    }

    /**
     * Create an instance of TransferBalanceTransportRequest
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.TransferBalanceTransportRequest createTransferBalanceTransportRequest()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.TransferBalanceTransportRequestImpl();
    }

    /**
     * Create an instance of GetAccountBalanceTransportRequest
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.GetAccountBalanceTransportRequest createGetAccountBalanceTransportRequest()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.GetAccountBalanceTransportRequestImpl();
    }

    /**
     * Create an instance of WithdrawTransportRequest
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.WithdrawTransportRequest createWithdrawTransportRequest()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.WithdrawTransportRequestImpl();
    }

    /**
     * Create an instance of BaseTransportResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.BaseTransportResponse createBaseTransportResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.BaseTransportResponseImpl();
    }

    /**
     * Create an instance of VerifyDepositResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.VerifyDepositResponse createVerifyDepositResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.VerifyDepositResponseImpl();
    }

    /**
     * Create an instance of TransferBalanceTransportResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.TransferBalanceTransportResponse createTransferBalanceTransportResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.TransferBalanceTransportResponseImpl();
    }

    /**
     * Create an instance of VerifyDeposit
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.VerifyDeposit createVerifyDeposit()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.VerifyDepositImpl();
    }

    /**
     * Create an instance of GetAccountListTransportResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.GetAccountListTransportResponse createGetAccountListTransportResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.GetAccountListTransportResponseImpl();
    }

    /**
     * Create an instance of GetAccountBalance
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.GetAccountBalance createGetAccountBalance()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.GetAccountBalanceImpl();
    }

    /**
     * Create an instance of GetAccountListTransportRequest
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.GetAccountListTransportRequest createGetAccountListTransportRequest()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.GetAccountListTransportRequestImpl();
    }

    /**
     * Create an instance of WithdrawTransportResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.WithdrawTransportResponse createWithdrawTransportResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.WithdrawTransportResponseImpl();
    }

    /**
     * Create an instance of VerifyDepositTransportRequest
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.VerifyDepositTransportRequest createVerifyDepositTransportRequest()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.VerifyDepositTransportRequestImpl();
    }

    /**
     * Create an instance of Deposit
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.Deposit createDeposit()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.DepositImpl();
    }

    /**
     * Create an instance of DepositTransportRequest
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.DepositTransportRequest createDepositTransportRequest()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.DepositTransportRequestImpl();
    }

    /**
     * Create an instance of GetAccountList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.GetAccountList createGetAccountList()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.GetAccountListImpl();
    }

    /**
     * Create an instance of DepositResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.DepositResponse createDepositResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.DepositResponseImpl();
    }

    /**
     * Create an instance of GetAccountListResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.GetAccountListResponse createGetAccountListResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.GetAccountListResponseImpl();
    }

    /**
     * Create an instance of BaseTransportRequest
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.BaseTransportRequest createBaseTransportRequest()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.BaseTransportRequestImpl();
    }

    /**
     * Create an instance of WithdrawResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.WithdrawResponse createWithdrawResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.WithdrawResponseImpl();
    }

    /**
     * Create an instance of TransferBalance
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.TransferBalance createTransferBalance()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.TransferBalanceImpl();
    }

    /**
     * Create an instance of GetAccountBalanceTransportResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.GetAccountBalanceTransportResponse createGetAccountBalanceTransportResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.GetAccountBalanceTransportResponseImpl();
    }

    /**
     * Create an instance of TransferBalanceResponse
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.TransferBalanceResponse createTransferBalanceResponse()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.TransferBalanceResponseImpl();
    }

    /**
     * Create an instance of Withdraw
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.fusiontech.bank.transports.Withdraw createWithdraw()
        throws javax.xml.bind.JAXBException
    {
        return new com.fusiontech.bank.transports.impl.WithdrawImpl();
    }

}
