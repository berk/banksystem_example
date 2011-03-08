package com.fusiontech.bank.server.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XMLUtils {
	
	public static void printDocument(Document doc) throws IOException {
		streamDocument(doc, System.out);
	}
	
	public static void streamDocument(Document doc, OutputStream out) throws IOException {
		OutputFormat format = new OutputFormat(doc);
		format.setEncoding("utf-8");
		format.setIndenting(true);
		XMLSerializer output = new XMLSerializer(out, format);
		output.serialize(doc);
	}
	
	public static Document loadDocumentFromByteArray(byte[] xmlBytes) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		InputStream is = new ByteArrayInputStream(xmlBytes);
		Document document = documentBuilder.parse(is);
		return document;
	}

	
	public static Document createNewDocument() throws ParserConfigurationException {
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		org.w3c.dom.Document doc = builder.newDocument();
		return doc;
	}
}
