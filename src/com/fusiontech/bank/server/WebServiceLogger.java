package com.fusiontech.bank.server;

import java.util.Date;

import com.fusiontech.bank.server.utils.ConfigUtils;

public class WebServiceLogger {

	public static void log(String operation, String content) {
		if (ConfigUtils.getPropertyAsBoolean("logger.enable", true))
			System.out.println(new Date() + ": " + operation + " " + content);
	}
}
