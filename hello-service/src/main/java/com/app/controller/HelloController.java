package com.app.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.object.HelloObject;

@RestController
public class HelloController {

	private AtomicLong counter = new AtomicLong();
	
	
	@RequestMapping(value = "/greeting")
	  public String greet() {
	    //log.info("Access /greeting");

	    List<String> greetings = Arrays.asList("Hi there service1", "Greetings sevice1", "Salutations service1");
	    Random rand = new Random();

	    int randomNum = rand.nextInt(greetings.size());
	    return greetings.get(randomNum);
	  }
	
	
	@RequestMapping(value = "/hello")
	public HelloObject getHelloWorldObject() {
		HelloObject hello = new HelloObject();
		hello.setMessage("Hi there Service1! you are number "+ counter.incrementAndGet());
		return hello;
	}
	
}
