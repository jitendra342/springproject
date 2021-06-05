package com.school.teacher.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.school.teacher.TeacherSalary;

@Controller
public class TeacherController {

	
	public TeacherSalary teacherSalary;
	
	
	@GetMapping(value="/user1")
	public String getUser() {
		
		teacherSalary.salaries();
		
		TeacherSalary teacherSalary1 = new TeacherSalary();
		System.out.println(teacherSalary1.getAge());
		System.out.println(teacherSalary.getAge());
		return "jithu";
	}
	
	
}
