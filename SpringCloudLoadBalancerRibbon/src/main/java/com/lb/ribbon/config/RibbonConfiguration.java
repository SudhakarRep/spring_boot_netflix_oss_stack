package com.lb.ribbon.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.PingUrl;
 
  
public class RibbonConfiguration {
     
    @Autowired
    private IClientConfig ribbonClientConfig;
  
    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }
  
    /*@Bean
    public IRule ribbonRule(IClientConfig config) {
        return new WeightedResponseTimeRule();
    }
    */
     
}