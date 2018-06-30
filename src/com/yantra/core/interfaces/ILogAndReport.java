/**
 * 
 */
package com.yantra.core.interfaces;

import org.apache.log4j.Logger;

/**
 * @author akashtyagi
 * new version
 *
 */
public interface ILogAndReport {

	//@arguments: logger=>log4j object
	//			  sLogLevel=>info, trace, warn, debug
	//			  sLogType: pass, fail, fail_not_exit, warn, pass_no_screenshot, fail_no_screenshot, fail_not_exit_no_screenshot
	public default void WriteLogAndReport(Logger logger, String sLogLevel, String sLogType, String sMessage){
		System.out.println("Log level:" + sLogType + " Message: " + sMessage);
		

		switch ( sLogLevel.toLowerCase() ){
		case "info":
			logger.info("Report Log Type: "+ sLogType + " Message: " + sMessage);
			break;
		case "trace":
			logger.trace("Report Log Type: "+ sLogType + " Message: " + sMessage);
			break;
		case "debug":
			logger.debug("Report Log Type: "+ sLogType + " Message: " + sMessage);
			break;
		case "warn":
			logger.warn("Report Log Type: "+ sLogType + " Message: " + sMessage);
			break;			
		}
		
	}
}
