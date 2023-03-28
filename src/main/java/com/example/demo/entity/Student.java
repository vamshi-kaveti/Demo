package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student {
	
	private int id;
	
	private String name;
	
	private String college;

	public Student(int id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	

}
