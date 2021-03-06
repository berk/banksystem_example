//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.04.12 at 03:14:00 AM PDT 
//


package com.fusiontech.bank.transports.impl;

public class TransferBalanceTransportRequestImpl
    extends com.fusiontech.bank.transports.impl.TransactionTransportRequestImpl
    implements com.fusiontech.bank.transports.TransferBalanceTransportRequest, com.sun.xml.bind.JAXBObject, com.fusiontech.bank.model.impl.runtime.UnmarshallableObject, com.fusiontech.bank.model.impl.runtime.XMLSerializable, com.fusiontech.bank.model.impl.runtime.ValidatableObject
{

    protected boolean has_Amount;
    protected double _Amount;
    protected boolean has_AccountTo;
    protected int _AccountTo;
    protected boolean has_AccountFrom;
    protected int _AccountFrom;
    public final static java.lang.Class version = (com.fusiontech.bank.transports.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.fusiontech.bank.transports.TransferBalanceTransportRequest.class);
    }

    public double getAmount() {
        return _Amount;
    }

    public void setAmount(double value) {
        _Amount = value;
        has_Amount = true;
    }

    public int getAccountTo() {
        return _AccountTo;
    }

    public void setAccountTo(int value) {
        _AccountTo = value;
        has_AccountTo = true;
    }

    public int getAccountFrom() {
        return _AccountFrom;
    }

    public void setAccountFrom(int value) {
        _AccountFrom = value;
        has_AccountFrom = true;
    }

    public com.fusiontech.bank.model.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.fusiontech.bank.model.impl.runtime.UnmarshallingContext context) {
        return new com.fusiontech.bank.transports.impl.TransferBalanceTransportRequestImpl.Unmarshaller(context);
    }

    public void serializeBody(com.fusiontech.bank.model.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeBody(context);
        if (has_AccountFrom) {
            context.startElement("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "accountFrom");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(javax.xml.bind.DatatypeConverter.printInt(((int) _AccountFrom)), "AccountFrom");
            } catch (java.lang.Exception e) {
                com.fusiontech.bank.model.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (has_AccountTo) {
            context.startElement("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "accountTo");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(javax.xml.bind.DatatypeConverter.printInt(((int) _AccountTo)), "AccountTo");
            } catch (java.lang.Exception e) {
                com.fusiontech.bank.model.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (has_Amount) {
            context.startElement("http://www.fusiontech.com/bankservice/transports/xsd/1.0", "amount");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(javax.xml.bind.DatatypeConverter.printDouble(((double) _Amount)), "Amount");
            } catch (java.lang.Exception e) {
                com.fusiontech.bank.model.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
    }

    public void serializeAttributes(com.fusiontech.bank.model.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeAttributes(context);
    }

    public void serializeURIs(com.fusiontech.bank.model.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.fusiontech.bank.transports.TransferBalanceTransportRequest.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv."
+"grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar."
+"trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/gr"
+"ammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011"
+"java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000ppsr\u0000\u001bcom.sun"
+".msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype"
+"/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPa"
+"ir;xq\u0000~\u0000\u0003ppsr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicT"
+"ype\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003"
+"L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u001aL\u0000\nwhite"
+"Spacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 h"
+"ttp://www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u00005com.sun.msv.data"
+"type.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun."
+"msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.su"
+"n.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003p"
+"psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001a"
+"L\u0000\fnamespaceURIq\u0000~\u0000\u001axpq\u0000~\u0000\u001eq\u0000~\u0000\u001dsq\u0000~\u0000\tppsr\u0000 com.sun.msv.gram"
+"mar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\fxq\u0000~\u0000"
+"\u0003q\u0000~\u0000\u0010psq\u0000~\u0000\u0012ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0017q\u0000~\u0000\u001dt\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpa"
+"ceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000 q\u0000~\u0000#sq\u0000~\u0000$q\u0000~\u0000,q\u0000~\u0000\u001dsr"
+"\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalName"
+"q\u0000~\u0000\u001aL\u0000\fnamespaceURIq\u0000~\u0000\u001axr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instan"
+"cesr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u000f\u0001q\u0000~\u00006sq\u0000~\u00000t\u0000\ncardNumbert\u00008http://www.fusi"
+"ontech.com/bankservice/transports/xsd/1.0q\u0000~\u00006sq\u0000~\u0000\tppsq\u0000~\u0000\u000b"
+"q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0012ppsr\u0000 com.sun.msv.datatype.xsd.IntType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.IntegerDerivedType\u0099\u00f1]"
+"\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetst\u0000)Lcom/sun/msv/datatype/xsd/XSDatatype"
+"Impl;xq\u0000~\u0000\u0017q\u0000~\u0000\u001dt\u0000\u0003intq\u0000~\u0000.sr\u0000*com.sun.msv.datatype.xsd.MaxI"
+"nclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.RangeFa"
+"cet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimitValuet\u0000\u0012Ljava/lang/Object;xr\u00009com.sun."
+"msv.datatype.xsd.DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000"
+"xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\f"
+"isFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypeq\u0000~\u0000AL\u0000\fconcrete"
+"Typet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000"
+"~\u0000\u001axq\u0000~\u0000\u0019ppq\u0000~\u0000.\u0000\u0001sr\u0000*com.sun.msv.datatype.xsd.MinInclusiveF"
+"acet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Eppq\u0000~\u0000.\u0000\u0000sr\u0000!com.sun.msv.datatype.xsd.L"
+"ongType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000@q\u0000~\u0000\u001dt\u0000\u0004longq\u0000~\u0000.sq\u0000~\u0000Dppq\u0000~\u0000.\u0000\u0001sq\u0000~"
+"\u0000Kppq\u0000~\u0000.\u0000\u0000sr\u0000$com.sun.msv.datatype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u0000@q\u0000~\u0000\u001dt\u0000\u0007integerq\u0000~\u0000.sr\u0000,com.sun.msv.datatype.xsd.Fra"
+"ctionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;com.sun.msv.datatype."
+"xsd.DataTypeWithLexicalConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000Hppq\u0000~"
+"\u0000.\u0001\u0000sr\u0000#com.sun.msv.datatype.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0017"
+"q\u0000~\u0000\u001dt\u0000\u0007decimalq\u0000~\u0000.q\u0000~\u0000Yt\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000St\u0000\fminInc"
+"lusivesr\u0000\u000ejava.lang.Long;\u008b\u00e4\u0090\u00cc\u008f#\u00df\u0002\u0000\u0001J\u0000\u0005valuexr\u0000\u0010java.lang.Num"
+"ber\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000xp\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000St\u0000\fmaxInclusivesq\u0000~\u0000]\u007f\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff\u00ffq\u0000"
+"~\u0000Nq\u0000~\u0000\\sr\u0000\u0011java.lang.Integer\u0012\u00e2\u00a0\u00a4\u00f7\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valuexq\u0000~\u0000^\u0080\u0000\u0000\u0000q\u0000"
+"~\u0000Nq\u0000~\u0000`sq\u0000~\u0000b\u007f\u00ff\u00ff\u00ffq\u0000~\u0000#sq\u0000~\u0000$q\u0000~\u0000Cq\u0000~\u0000\u001dsq\u0000~\u0000\tppsq\u0000~\u0000\'q\u0000~\u0000\u0010pq"
+"\u0000~\u0000)q\u0000~\u00002q\u0000~\u00006sq\u0000~\u00000t\u0000\u0007cardPinq\u0000~\u0000:q\u0000~\u00006sq\u0000~\u0000\tppsq\u0000~\u0000\u000bq\u0000~\u0000\u0010p"
+"\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000>sq\u0000~\u0000\tppsq\u0000~\u0000\'q\u0000~\u0000\u0010pq\u0000~\u0000)q\u0000~\u00002q\u0000~\u00006sq\u0000~\u00000t\u0000\u000bac"
+"countFromq\u0000~\u0000:q\u0000~\u00006sq\u0000~\u0000\tppsq\u0000~\u0000\u000bq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000>sq\u0000~\u0000\tp"
+"psq\u0000~\u0000\'q\u0000~\u0000\u0010pq\u0000~\u0000)q\u0000~\u00002q\u0000~\u00006sq\u0000~\u00000t\u0000\taccountToq\u0000~\u0000:q\u0000~\u00006sq\u0000~"
+"\u0000\tppsq\u0000~\u0000\u000bq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0012ppsr\u0000#com.sun.msv.datatype.xs"
+"d.DoubleType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.Floating"
+"NumberType\u00fc\u00e3\u00b6\u0087\u008c\u00a8|\u00e0\u0002\u0000\u0000xq\u0000~\u0000\u0017q\u0000~\u0000\u001dt\u0000\u0006doubleq\u0000~\u0000.q\u0000~\u0000#sq\u0000~\u0000$q\u0000~"
+"\u0000\u007fq\u0000~\u0000\u001dsq\u0000~\u0000\tppsq\u0000~\u0000\'q\u0000~\u0000\u0010pq\u0000~\u0000)q\u0000~\u00002q\u0000~\u00006sq\u0000~\u00000t\u0000\u0006amountq\u0000~"
+"\u0000:q\u0000~\u00006sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\be"
+"xpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xps"
+"r\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I"
+"\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Expr"
+"essionPool;xp\u0000\u0000\u0000\u0013\u0001pq\u0000~\u0000zq\u0000~\u0000\u0007q\u0000~\u0000;q\u0000~\u0000jq\u0000~\u0000qq\u0000~\u0000xq\u0000~\u0000\u0005q\u0000~\u0000&q"
+"\u0000~\u0000fq\u0000~\u0000mq\u0000~\u0000tq\u0000~\u0000\u0081q\u0000~\u0000\nq\u0000~\u0000=q\u0000~\u0000lq\u0000~\u0000sq\u0000~\u0000\u0006q\u0000~\u0000\bq\u0000~\u0000\u0011x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.fusiontech.bank.model.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.fusiontech.bank.model.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(com.fusiontech.bank.model.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.fusiontech.bank.transports.impl.TransferBalanceTransportRequestImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("accountFrom" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 2;
                            return ;
                        }
                        state = 4;
                        continue outer;
                    case  10 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  4 :
                        if (("accountTo" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 5;
                            return ;
                        }
                        state = 7;
                        continue outer;
                    case  0 :
                        if (("cardNumber" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.fusiontech.bank.transports.impl.TransactionTransportRequestImpl)com.fusiontech.bank.transports.impl.TransferBalanceTransportRequestImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("cardPin" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.fusiontech.bank.transports.impl.TransactionTransportRequestImpl)com.fusiontech.bank.transports.impl.TransferBalanceTransportRequestImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((com.fusiontech.bank.transports.impl.TransactionTransportRequestImpl)com.fusiontech.bank.transports.impl.TransferBalanceTransportRequestImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  7 :
                        if (("amount" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 8;
                            return ;
                        }
                        state = 10;
                        continue outer;
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
                    case  1 :
                        state = 4;
                        continue outer;
                    case  10 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  3 :
                        if (("accountFrom" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("accountTo" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  0 :
                        spawnHandlerFromLeaveElement((((com.fusiontech.bank.transports.impl.TransactionTransportRequestImpl)com.fusiontech.bank.transports.impl.TransferBalanceTransportRequestImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        if (("amount" == ___local)&&("http://www.fusiontech.com/bankservice/transports/xsd/1.0" == ___uri)) {
                            context.popAttributes();
                            state = 10;
                            return ;
                        }
                        break;
                    case  7 :
                        state = 10;
                        continue outer;
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
                    case  1 :
                        state = 4;
                        continue outer;
                    case  10 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((com.fusiontech.bank.transports.impl.TransactionTransportRequestImpl)com.fusiontech.bank.transports.impl.TransferBalanceTransportRequestImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        state = 10;
                        continue outer;
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
                    case  1 :
                        state = 4;
                        continue outer;
                    case  10 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((com.fusiontech.bank.transports.impl.TransactionTransportRequestImpl)com.fusiontech.bank.transports.impl.TransferBalanceTransportRequestImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        state = 10;
                        continue outer;
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
                        case  1 :
                            state = 4;
                            continue outer;
                        case  8 :
                            state = 9;
                            eatText1(value);
                            return ;
                        case  5 :
                            state = 6;
                            eatText2(value);
                            return ;
                        case  10 :
                            revertToParentFromText(value);
                            return ;
                        case  2 :
                            state = 3;
                            eatText3(value);
                            return ;
                        case  4 :
                            state = 7;
                            continue outer;
                        case  0 :
                            spawnHandlerFromText((((com.fusiontech.bank.transports.impl.TransactionTransportRequestImpl)com.fusiontech.bank.transports.impl.TransferBalanceTransportRequestImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  7 :
                            state = 10;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Amount = javax.xml.bind.DatatypeConverter.parseDouble(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_Amount = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _AccountTo = javax.xml.bind.DatatypeConverter.parseInt(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_AccountTo = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _AccountFrom = javax.xml.bind.DatatypeConverter.parseInt(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_AccountFrom = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
