//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.04.12 at 03:14:00 AM PDT 
//


package com.fusiontech.bank.transports.impl;

public class VerifyDepositImpl
    extends com.fusiontech.bank.transports.impl.VerifyDepositTransportRequestImpl
    implements com.fusiontech.bank.transports.VerifyDeposit, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.fusiontech.bank.model.impl.runtime.UnmarshallableObject, com.fusiontech.bank.model.impl.runtime.XMLSerializable, com.fusiontech.bank.model.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.fusiontech.bank.transports.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.fusiontech.bank.transports.VerifyDeposit.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://www.fusiontech.com/bankservice/transports/xsd/1.0";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "verifyDeposit";
    }

    public com.fusiontech.bank.model.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.fusiontech.bank.model.impl.runtime.UnmarshallingContext context) {
        return new com.fusiontech.bank.transports.impl.VerifyDepositImpl.Unmarshaller(context);
    }

    public void serializeBody(com.fusiontech.bank.model.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "verifyDeposit");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(com.fusiontech.bank.model.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(com.fusiontech.bank.model.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.fusiontech.bank.transports.VerifyDeposit.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bpps"
+"q\u0000~\u0000\u0000sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007ppsr"
+"\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng"
+"/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util"
+"/StringPair;xq\u0000~\u0000\u0004ppsr\u0000#com.sun.msv.datatype.xsd.StringType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.datatype.xsd.Built"
+"inAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Concrete"
+"Type\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000"
+"\u001bL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcess"
+"or;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u00005com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
+",com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001s"
+"r\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u0000\u0004ppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocal"
+"Nameq\u0000~\u0000\u001bL\u0000\fnamespaceURIq\u0000~\u0000\u001bxpq\u0000~\u0000\u001fq\u0000~\u0000\u001esq\u0000~\u0000\rppsr\u0000 com.sun"
+".msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq"
+"\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0011psq\u0000~\u0000\u0013ppsr\u0000\"com.sun.msv.datatype.xsd.QnameTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0018q\u0000~\u0000\u001et\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd"
+".WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000!q\u0000~\u0000$sq\u0000~\u0000%q\u0000~"
+"\u0000-q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\t"
+"localNameq\u0000~\u0000\u001bL\u0000\fnamespaceURIq\u0000~\u0000\u001bxr\u0000\u001dcom.sun.msv.grammar.Na"
+"meClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSche"
+"ma-instancesr\u00000com.sun.msv.grammar.Expression$EpsilonExpress"
+"ion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0010\u0001q\u0000~\u00007sq\u0000~\u00001t\u0000\ncardNumbert\u00008http:/"
+"/www.fusiontech.com/bankservice/transports/xsd/1.0q\u0000~\u00007sq\u0000~\u0000"
+"\rppsq\u0000~\u0000\u0000q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0013ppsr\u0000 com.sun.msv.datatype.xsd"
+".IntType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.IntegerDeriv"
+"edType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetst\u0000)Lcom/sun/msv/datatype/xsd/X"
+"SDatatypeImpl;xq\u0000~\u0000\u0018q\u0000~\u0000\u001et\u0000\u0003intq\u0000~\u0000/sr\u0000*com.sun.msv.datatype"
+".xsd.MaxInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xs"
+"d.RangeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimitValuet\u0000\u0012Ljava/lang/Object;xr\u0000"
+"9com.sun.msv.datatype.xsd.DataTypeWithValueConstraintFacet\"\u00a7"
+"Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypeq\u0000~\u0000BL\u0000"
+"\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfa"
+"cetNameq\u0000~\u0000\u001bxq\u0000~\u0000\u001appq\u0000~\u0000/\u0000\u0001sr\u0000*com.sun.msv.datatype.xsd.MinI"
+"nclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Fppq\u0000~\u0000/\u0000\u0000sr\u0000!com.sun.msv.datat"
+"ype.xsd.LongType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Aq\u0000~\u0000\u001et\u0000\u0004longq\u0000~\u0000/sq\u0000~\u0000Eppq\u0000"
+"~\u0000/\u0000\u0001sq\u0000~\u0000Lppq\u0000~\u0000/\u0000\u0000sr\u0000$com.sun.msv.datatype.xsd.IntegerType"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Aq\u0000~\u0000\u001et\u0000\u0007integerq\u0000~\u0000/sr\u0000,com.sun.msv.datatyp"
+"e.xsd.FractionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;com.sun.msv."
+"datatype.xsd.DataTypeWithLexicalConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq"
+"\u0000~\u0000Ippq\u0000~\u0000/\u0001\u0000sr\u0000#com.sun.msv.datatype.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0018q\u0000~\u0000\u001et\u0000\u0007decimalq\u0000~\u0000/q\u0000~\u0000Zt\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000T"
+"t\u0000\fminInclusivesr\u0000\u000ejava.lang.Long;\u008b\u00e4\u0090\u00cc\u008f#\u00df\u0002\u0000\u0001J\u0000\u0005valuexr\u0000\u0010java"
+".lang.Number\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000xp\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000Tt\u0000\fmaxInclusivesq\u0000~\u0000^\u007f"
+"\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff\u00ffq\u0000~\u0000Oq\u0000~\u0000]sr\u0000\u0011java.lang.Integer\u0012\u00e2\u00a0\u00a4\u00f7\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valuexq\u0000"
+"~\u0000_\u0080\u0000\u0000\u0000q\u0000~\u0000Oq\u0000~\u0000asq\u0000~\u0000c\u007f\u00ff\u00ff\u00ffq\u0000~\u0000$sq\u0000~\u0000%q\u0000~\u0000Dq\u0000~\u0000\u001esq\u0000~\u0000\rppsq\u0000~"
+"\u0000(q\u0000~\u0000\u0011pq\u0000~\u0000*q\u0000~\u00003q\u0000~\u00007sq\u0000~\u00001t\u0000\u0007cardPinq\u0000~\u0000;q\u0000~\u00007sq\u0000~\u0000\rppsq\u0000"
+"~\u0000\u0000q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000?sq\u0000~\u0000\rppsq\u0000~\u0000(q\u0000~\u0000\u0011pq\u0000~\u0000*q\u0000~\u00003q\u0000~\u00007sq"
+"\u0000~\u00001t\u0000\taccountIdq\u0000~\u0000;q\u0000~\u00007sq\u0000~\u0000\rppsq\u0000~\u0000\u0000q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000"
+"\u0013ppsr\u0000#com.sun.msv.datatype.xsd.DoubleType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com"
+".sun.msv.datatype.xsd.FloatingNumberType\u00fc\u00e3\u00b6\u0087\u008c\u00a8|\u00e0\u0002\u0000\u0000xq\u0000~\u0000\u0018q\u0000~"
+"\u0000\u001et\u0000\u0006doubleq\u0000~\u0000/q\u0000~\u0000$sq\u0000~\u0000%q\u0000~\u0000yq\u0000~\u0000\u001esq\u0000~\u0000\rppsq\u0000~\u0000(q\u0000~\u0000\u0011pq\u0000~"
+"\u0000*q\u0000~\u00003q\u0000~\u00007sq\u0000~\u00001t\u0000\u0006amountq\u0000~\u0000;q\u0000~\u00007sq\u0000~\u0000\rppsq\u0000~\u0000(q\u0000~\u0000\u0011pq\u0000~"
+"\u0000*q\u0000~\u00003q\u0000~\u00007sq\u0000~\u00001t\u0000\rverifyDepositq\u0000~\u0000;sr\u0000\"com.sun.msv.gramm"
+"ar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gramm"
+"ar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expre"
+"ssionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006pa"
+"rentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0011\u0001pq\u0000~\u0000tq\u0000~\u0000"
+"\u000bq\u0000~\u0000<q\u0000~\u0000kq\u0000~\u0000rq\u0000~\u0000\nq\u0000~\u0000\tq\u0000~\u0000\'q\u0000~\u0000gq\u0000~\u0000nq\u0000~\u0000{q\u0000~\u0000\u007fq\u0000~\u0000\u000eq\u0000~\u0000"
+">q\u0000~\u0000mq\u0000~\u0000\fq\u0000~\u0000\u0012x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.fusiontech.bank.model.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.fusiontech.bank.model.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.fusiontech.bank.model.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.fusiontech.bank.transports.impl.VerifyDepositImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("cardNumber" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.fusiontech.bank.transports.impl.VerifyDepositTransportRequestImpl)com.fusiontech.bank.transports.impl.VerifyDepositImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("cardPin" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.fusiontech.bank.transports.impl.VerifyDepositTransportRequestImpl)com.fusiontech.bank.transports.impl.VerifyDepositImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("accountId" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.fusiontech.bank.transports.impl.VerifyDepositTransportRequestImpl)com.fusiontech.bank.transports.impl.VerifyDepositImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("amount" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.fusiontech.bank.transports.impl.VerifyDepositTransportRequestImpl)com.fusiontech.bank.transports.impl.VerifyDepositImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((com.fusiontech.bank.transports.impl.VerifyDepositTransportRequestImpl)com.fusiontech.bank.transports.impl.VerifyDepositImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("verifyDeposit" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("verifyDeposit" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromLeaveElement((((com.fusiontech.bank.transports.impl.VerifyDepositTransportRequestImpl)com.fusiontech.bank.transports.impl.VerifyDepositImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromEnterAttribute((((com.fusiontech.bank.transports.impl.VerifyDepositTransportRequestImpl)com.fusiontech.bank.transports.impl.VerifyDepositImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromLeaveAttribute((((com.fusiontech.bank.transports.impl.VerifyDepositTransportRequestImpl)com.fusiontech.bank.transports.impl.VerifyDepositImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            spawnHandlerFromText((((com.fusiontech.bank.transports.impl.VerifyDepositTransportRequestImpl)com.fusiontech.bank.transports.impl.VerifyDepositImpl.this).new Unmarshaller(context)), 2, value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}