package com.accn.ppes.product;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ramya.spring.annotations.packageC.BeanC1;

@SpringBootApplication
@ComponentScan(basePackages = { "com.javarticles.spring.annotations.packageA",
		"com.javarticles.spring.annotations.packageB",
		"com.javarticles.spring.annotations.packageE" }, basePackageClasses = BeanC1.class)
public class SpringBootApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootApp.class, args);
		System.out.println("Contains A  " + context.containsBeanDefinition("demoBeanA"));
		System.out.println("Contains B2  " + context.containsBeanDefinition("demoBeanB2"));
		System.out.println("Contains C   " + context.containsBeanDefinition("demoBeanC"));
	}
	
}
