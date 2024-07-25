package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dao.Student;

@RestController
public class HelloWorldSpringBoot {
	
	@GetMapping(value="/Hello")
	public String HelloWorld() {
		
		return "Hello to the SpringBoot Application World";
	}
	
	@GetMapping(value="/studentinfo")
	public Student studentInfo() {
		Student stu = new Student();
		stu.setId(101);
		stu.setName("Yuvan");
		stu.setSection("Mango");
		stu.setAddress("19, 1st floor, Gods Gift Layout,560049");
		return stu;
	}

}
