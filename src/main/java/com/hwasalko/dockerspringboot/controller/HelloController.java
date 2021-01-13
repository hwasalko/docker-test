package com.hwasalko.dockerspringboot.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
private Logger logger = LoggerFactory.getLogger(HelloController.class);

@GetMapping("/")
public String hello(){
    
    String message = "Hello World. Now is " + new Date().toString();
    logger.info("message => " + message );

    return message;
}

}
