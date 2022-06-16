package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Honda City");
		System.out.println("Vehicle name from non-spring context"
				+ " is "+ vehicle.getName());
		
		/*
		 * The var keyword was introduced in Java 10. Type Inference is used
		 * in var keyword in which it detects automatically the datatype of 
		 * variable based on the surrounding context.
		 */
		
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Vehicle veh = context.getBean(Vehicle.class);
		System.out.println("Vehicle name from Spring context is: "+ veh.getName());
		
		/*
		 * We Don't need to do any explicit casting while fetching a bean from context.
		 * Spring is smart enough to look for a bean of the type you requested in its context.
		 * If Such bean doesn't exist, Spring will throw an exception.
		 * 
		 */
		
		String hai = context.getBean(String.class);
		System.out.println("String value from Spring context is: "+ hai);
		
		Integer num = context.getBean(Integer.class);
		System.out.println("Integer value from Spring Context is: "+ num);
		
	}

}
