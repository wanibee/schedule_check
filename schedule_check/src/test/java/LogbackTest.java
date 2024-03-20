package test.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {

	public static void main(String[] args) {
		Logger LOGGER = LoggerFactory.getLogger(LogbackTest.class);
		
		LOGGER.info("Hello world");
		
	}

}
