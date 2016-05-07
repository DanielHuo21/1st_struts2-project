package com.briup.cms.service.impl;

import com.briup.cms.bean.Student;
import com.briup.cms.dao.StudentDao;
import com.briup.cms.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	
	//关联Dao对象
		private StudentDao studentDao = new StudentDao();
		/**
		 * 添加栏目
		 * */
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		studentDao.save(student);
	}

}
