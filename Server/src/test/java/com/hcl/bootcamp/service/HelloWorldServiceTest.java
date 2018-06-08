package com.hcl.bootcamp.service;

import com.hcl.bootcamp.service.HelloWorldService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Bojja
 */
public class HelloWorldServiceTest {

    private HelloWorldService m_HelloWorldService;

    @Before
    public void setUp() {
        m_HelloWorldService = new HelloWorldService();
    }

    @Test
    public void getMessage_ShouldReturnMessage() {
        assertEquals("Hello World!", m_HelloWorldService.getMessage());
    }
}
