package edu.demo.springwithhibernate.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // required for any java based configuration inspring
@ComponentScan("edu.demo.springwtihhibernate") // scans package for anotated classes 
public class ApplicationConfiguration {
	
}
