package com.ta.configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ta")
public class ApplicationConfiguration
{
	@Bean
	public EntityManagerFactory getEntityManagerFactory() 
	{

		return Persistence.createEntityManagerFactory("varsha");
	}

	

}
