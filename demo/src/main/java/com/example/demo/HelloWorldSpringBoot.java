package com.example.demo;

import java.util.ArrayList;
import java.util.List;

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
	public List<Student> studentInfo() {
		Student stu = new Student();
		ArrayList<Student> students = new ArrayList<Student> ();
		stu.setId(101);
		stu.setName("Yuvan");
		stu.setSection("Mango");
		stu.setAddress("19, 1st floor, Gods Gift Layout,560049");
		stu.setSchoolName("Kidzee");
		students.add(stu);
	
		Student stu1 = new Student();
		stu1.setId(102);
		stu1.setName("Yashika");
		stu1.setSection("Mango");
		stu1.setAddress("19, 1st floor, Gods Gift Layout,560049");
		stu1.setSchoolName("Kidzee");
		students.add(stu1);
		return students;
	}

}
