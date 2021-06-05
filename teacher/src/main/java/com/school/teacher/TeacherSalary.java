package com.school.teacher;


import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class TeacherSalary {
	
	
	private int salary;
	public int age;
	public String name;
	public String location;
	
	public void salaries() {
		
		System.out.println("salary given for may month");
	}
	

}
