package log;

import org.apache.log4j.Logger;


public class LogTest {

	private static Logger log = Logger.getLogger(LogTest.class);
	
	public static void main(String[] args) {
		log.debug("这是个调试日志");
	}
}
