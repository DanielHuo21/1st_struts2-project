package com.briup.cms.web.action.manager;

import org.apache.struts2.convention.annotation.Action;

import com.briup.cms.bean.Student;
import com.briup.cms.service.IStudentService;
import com.briup.cms.service.impl.StudentServiceImpl;

public class StudentAction {
	
	private String name;
	private String stuId;
	private IStudentService studentService = new StudentServiceImpl();
	
	@Action(value="addStudent")
	public void addStudent(){
		Student student = new Student(null,name,stuId);
		studentService.add(student);
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
