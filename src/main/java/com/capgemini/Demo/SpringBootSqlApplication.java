package com.capgemini.Demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.Demo.SpringBootSqlApplication;

@SpringBootApplication
public class SpringBootSqlApplication {

	//private static Logger logger = LogManager.getLogger(SpringBootSqlApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSqlApplication.class, args);
		/*logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");*/

}
}

