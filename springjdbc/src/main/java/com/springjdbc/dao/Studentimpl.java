package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entitiy.Student;

public class Studentimpl implements StudentDao {
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	private JdbcTemplate jt;

	public int insert(Student st) {
		
		String  q = "insert into student (sid,name,city) values(?,?,?)";
		
		int result = this.jt.update(q,st.getId(),st.getName(),st.getCity());
		
		return result;
	}

	public int delete(Student st) {
		// TODO Auto-generated method stub
        String  q = "delete from student where sid = ?";
		
		int result = this.jt.update(q,st.getId());
		
		return result;
	}

	public int change(Student st) {
        String  q = "update student set name = ?, city = ? where sid=?";
		
		int result = this.jt.update(q,st.getName(),st.getCity(),st.getId());
		
		return result;
	}

	public Student getStudent(int sid) {
		  String  q = "select * from student where sid=?";
		  RowMapper<Student> rowMapper = new RowmapperImpl(); 
	
		Student st =  this.jt.queryForObject(q, rowMapper,sid);
		return st;
	}

	public List<Student> getAllReord() {
		String  q = "select * from student";
		RowMapper<Student> rw = new RowmapperImpl();
        List<Student> st  =	this.jt.query(q,rw);
		return st;
	}

}
