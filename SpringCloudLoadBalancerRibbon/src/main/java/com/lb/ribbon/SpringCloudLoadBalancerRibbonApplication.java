package com.lb.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.lb.ribbon.config.RibbonConfiguration;

@RibbonClient(name = "hello-service", configuration = RibbonConfiguration.class)
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudLoadBalancerRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLoadBalancerRibbonApplication.class, args);
		
	}
	

}
