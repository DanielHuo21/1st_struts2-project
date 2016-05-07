package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.briup.cms.bean.Student;
import com.briup.cms.common.ConnectionFactory;

public class StudentDao {
	public void save(Student student){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				//获取连接
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_student(name,stuId) values(?,?)";
				//预处理sql
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, student.getName());
				pstmt.setString(2, student.getStuId());
				//执行sql
				pstmt.executeUpdate();
				
			} finally {
				if(pstmt!=null){
					pstmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<Student> findAll(){
		return null;
	}
}
