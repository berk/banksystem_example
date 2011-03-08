package com.fusiontech.bank.server.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayUtils {

	public static byte[] readInputStreamBytes(InputStream in) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream(); 

		int inputdata = -1;
		while((inputdata = in.read()) > -1) {
			out.write(inputdata);
		}
		
		return out.toByteArray();
	}

}
