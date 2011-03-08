@echo off

SET ROOTPATH=C:/projects/cs380/banksystem

SET DEPLOY=%ROOTPATH%/deploy
SET LIB=%ROOTPATH%/lib

SET CP=%DEPLOY%
SET CP=%CP%;%DEPLOY%/banksystem.jar
SET CP=%CP%;%LIB%/commons/commons-beanutils.jar
SET CP=%CP%;%LIB%/commons/commons-collections.jar
SET CP=%CP%;%LIB%/commons/commons-dbcp.jar
SET CP=%CP%;%LIB%/commons/commons-digester.jar
SET CP=%CP%;%LIB%/commons/commons-logging.jar
SET CP=%CP%;%LIB%/commons/commons-pool.jar
SET CP=%CP%;%LIB%/jaxb/jaxb-api.jar
SET CP=%CP%;%LIB%/jaxb/jaxb-impl.jar
SET CP=%CP%;%LIB%/jaxb/jaxb-libs.jar
SET CP=%CP%;%LIB%/jaxb/jaxb-xjc.jar
SET CP=%CP%;%LIB%/jaxb/jaxp-api.jar
SET CP=%CP%;%LIB%/jaxb/jax-qname.jar
SET CP=%CP%;%LIB%/jaxb/namespace.jar
SET CP=%CP%;%LIB%/jaxb/relaxngDatatype.jar
SET CP=%CP%;%LIB%/jdbc/commons-dbcp.jar
SET CP=%CP%;%LIB%/jdbc/jtds.jar
SET CP=%CP%;%LIB%/jdbc/mysql-connector-3.0.15-ga.jar
SET CP=%CP%;%LIB%/xml/xalan.jar
SET CP=%CP%;%LIB%/xml/xercesImpl.jar
SET CP=%CP%;%LIB%/xml/xml-apis.jar
SET CP=%CP%;%LIB%/xml/xmlParserAPIs.jar
SET CP=%CP%;%LIB%/xml/xmlsec.jar
SET CP=%CP%;%LIB%/xml/xsdlib.jar
SET CP=%CP%;%LIB%/jetty/org.mortbay.jetty.jar
SET CP=%CP%;%LIB%/jetty/org.mortbay.jmx.jar
SET CP=%CP%;%LIB%/activation.jar
SET CP=%CP%;%LIB%/jaas.jar
SET CP=%CP%;%LIB%/javax.servlet.jar
SET CP=%CP%;%LIB%/jta-spec1_0_1.jar
SET CP=%CP%;%LIB%/mail.jar

java -cp %CP% com.fusiontech.bank.server.BankServer
