package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.beans.Vehicle;

/*
 * Spring @Configuration annotation is part of the Spring Core Framework.
 * Spring Configuration annotation indicates that the class has @Bean definition
 * methods. So Spring Container can process the class and generate
 * Spring Bean to be used in the application. 
 */

//ctrl + shift + o ===> To import respective packages and remove red lines
@Configuration
public class ProjectConfig {

	
	//ClassName MethodName with return
	
	/*
	 * @Bean annotation, which lets spring know that it needs to call
	 * this method when it initializes its context and adds the returned
	 * value to the context.
	 */
	@Bean
	Vehicle vehicle() {
		var veh = new Vehicle();
		veh.setName("Audi 8");
		return veh;
	}
	/*
	 * The method names usually follow verbs notation. But for methods
	 * which we be use to create beans, can be nouns as names.
	 * This will be good practice as the method names will become
	 * bean names as well in the context.
	 */
	
	@Bean
	String hello() {
		return "Hello World";
	}
	
	@Bean
	Integer number() {
		return 18;
	}
}
