package com.subodh.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.subodh.SpringBeans.Address;
import com.subodh.SpringBeans.Student;

@Configuration
public class JavaConfiguration {
	
	@Bean
	public Address CreateAddObj() {
	
		Address add=new Address(100,"Ameerpet",500016);
		
		return add;
		
	}
	@Bean
	public Student CreateStdObj() {
		Student std=new Student(119,"subodh",CreateAddObj());
		return std;
	}

}
