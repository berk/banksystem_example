package com.fusiontech.bank.server.tasks;

import com.fusiontech.bank.server.WebServiceLogger;
import com.fusiontech.bank.server.bean.AccountManagerBean;
import com.fusiontech.bank.server.utils.ConfigUtils;

public class ClearTransactionsTask implements Runnable {
	public static final int TASK_SLEEP_TIME_SEC = ConfigUtils.getPropertyAsInt("task.cleartransaction.interval_in_sec", 30); 
	public static final boolean DEBUG = ConfigUtils.getPropertyAsBoolean("task.cleartransaction.debug", false);
	
	public void run() {
		
		while(true) {
			if (DEBUG) WebServiceLogger.log("Clear Transactions Task", "woke up");
			
			try {
				int count = new AccountManagerBean().clearTransactions();
				if (DEBUG) WebServiceLogger.log("Clear Transactions Task", "cleared " + count + " transactions");
			} catch (Exception e) {
				WebServiceLogger.log("Clear Transactions Task", "failed: " + e.getMessage());
			}
			
			if (DEBUG) WebServiceLogger.log("Clear Transactions Task", "went back to sleep");
			
			try { Thread.sleep(TASK_SLEEP_TIME_SEC * 1000); } catch (Exception e) { } 
		}
		
	}
}
