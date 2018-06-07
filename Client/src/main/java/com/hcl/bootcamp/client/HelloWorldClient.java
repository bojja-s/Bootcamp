package com.hcl.bootcamp.client;

import com.hcl.bootcamp.HelloWorldService;
import org.apache.log4j.Logger;

/**
 * @author Bojja
 */
public class HelloWorldClient {

    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        HelloWorldService i_HelloWorldService = new HelloWorldService();

        String message = i_HelloWorldService.getMessage();
        LOGGER.info("Received message: " + message);
    }
}
