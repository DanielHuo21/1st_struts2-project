package com.briup.cms.bean;

public class Student {
	private Long id;
	private String name;
	private String stuId;
	public Student() {
	}
	public Student(Long id, String name, String stuId) {
		super();
		this.id = id;
		this.name = name;
		this.stuId = stuId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	
}
