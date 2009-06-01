package org.homeunix.thecave.moss.common;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogUtil {

	/**
	 * Sets the Java Logger log level as specified for the given logger.  The logger name
	 * is a hierarchal name, generally which follows package naming.  Unless overridden
	 * at a lower level, the logger name will apply to all children as well; for instance,
	 * setting a given level for "org.homeunix.thecave" will also apply to logger 
	 * "org.thecave.homeunix.moss.common.LogUtil". 
	 * @param loggerName Name of the logger to set
	 * @param logLevel The log level to set; all logs at this level or higher will be shown.  
	 */
	public static void setLogLevel(String loggerName, String logLevel, Level defaultLevel){
		Level level = defaultLevel;
		if ("SEVERE".equals(logLevel)){
			level = Level.SEVERE;
		}
		else if ("WARNING".equals(logLevel)){
			level = Level.WARNING;
		} 
		else if ("INFO".equals(logLevel)){
			level = Level.INFO;
		} 
		else if ("FINE".equals(logLevel)){
			level = Level.FINE;
		} 
		else if ("FINER".equals(logLevel)){
			level = Level.FINER;
		} 
		else if ("FINEST".equals(logLevel)){
			level = Level.FINEST;
		} 
		
		Logger.getLogger(loggerName).setLevel(level);
	}
	
	/**
	 * Helper class which sets the log level for all "org.homeunix.thecave" to the given
	 * log value, defaulting to Level.INFO if the logLevel string is not a valid log level.
	 * @param logLevel Log level to set; one of SEVERE, WARNING, INFO, FINE, FINER, FINEST.
	 */
	public static void setLogLevel(String logLevel){
		setLogLevel("org.homeunix.thecave", logLevel, Level.INFO);
	}
}
