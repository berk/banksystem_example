package com.fusiontech.bank.server;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Element;

import com.fusiontech.bank.transports.DepositResponse;

public class BankObjectFactory {
	static com.fusiontech.bank.transports.ObjectFactory transportFactory = null;
	static com.fusiontech.bank.model.ObjectFactory modelFactory = null;
	
	public static com.fusiontech.bank.transports.ObjectFactory getTransportsFactory() throws Exception {
		if (transportFactory==null) {
			transportFactory = new com.fusiontech.bank.transports.ObjectFactory();
		}
		
		return transportFactory;
	}
	
	public static com.fusiontech.bank.model.ObjectFactory getModelsFactory() throws Exception {
		if (modelFactory==null) {
			modelFactory = new com.fusiontech.bank.model.ObjectFactory();
		}
		
		return modelFactory;
	}
	
	public static JAXBContext getTransportsContext() throws JAXBException { 
		return JAXBContext.newInstance( "com.fusiontech.bank.transports" );
	}

	public static JAXBContext getModelsContext() throws JAXBException { 
		return JAXBContext.newInstance( "com.fusiontech.bank.model" );
	}
	
	public static void main(String[] args) {
		try {
			JAXBContext jc = JAXBContext.newInstance( "com.fusiontech.bank.transports" );
			
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			org.w3c.dom.Document doc = builder.newDocument();
			Element root = doc.createElementNS("http://schemas.xmlsoap.org/soap/envelope/", "Envelope");
			root.setPrefix("soap");
			doc.appendChild(root);
			Element body = doc.createElementNS("http://schemas.xmlsoap.org/soap/envelope/", "Body");
			body.setPrefix("soap");
			root.appendChild(body);
			// Node rsp = body.appendChild(doc.createElement("DepositTransportResponse"));
			
			DepositResponse resp = getTransportsFactory().createDepositResponse();
			resp.setErrorId(0);
			resp.setErrorMsg("fasdfasdf");
			
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
			marshaller.marshal(resp, body);
	
			OutputFormat format = new OutputFormat(doc);
			format.setIndenting(true);
			XMLSerializer output = new XMLSerializer(System.out, format);
			output.serialize(doc);
			
	//		System.out.println("\n");
			
	//		Unmarshaller unmarshaller = jc.createUnmarshaller();
	//		BaseTransportRequest request2 = (BaseTransportRequest) unmarshaller.unmarshal(root);

		//System.out.println(request2.getCardnumber());

			
/*			JAXBContext jc = JAXBContext.newInstance( "com.fusiontech.bank.model" );
			
			Account acc = new com.fusiontech.bank.model.ObjectFactory().createAccount();
			acc.setAccountId(222);
			acc.setAvailableBalance(22.22);
			acc.setCurrentBalance(22.22);
			acc.setName("sdfsfddf");
			
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
			marshaller.marshal(acc, System.out);
*/				
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
