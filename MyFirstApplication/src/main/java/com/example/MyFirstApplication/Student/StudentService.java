package com.example.MyFirstApplication.Student;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;
import java.sql.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StudentService {
	@Autowired
	public StudentRepository studrep;
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Optional<StudentEntity> getData(String name) {
		return studrep.findById(name);
		}

	public StudentEntity insertData(StudentEntity se) {
		return studrep.save(se);
	}

	/*public void delete(int id) {
		studrep.deleteById(id);
	}*/
	public void delete(String name) {
		studrep.deleteById(name);
	}

	public int saveOrUpdate(int studid, StudentEntity se) {
		// Optional<StudentEntity> id =studrep.findById(studid);
		/*
		 * StudentEntity student=id.get(); student.setStudname(se.getStudname());
		 * studrep.save(student);
		 */
		// Using JDBCTemplate
		
		/*
		 * System.out.println(sql); return jdbcTemplate.update(sql);
		 */		
		//JDBCTemplate using preparedStatement
		String sql = "update student set studname= ? where studid=" + studid + ";";
		jdbcTemplate.update(connection -> {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, se.getStudname());
			return preparedStatement;
		});
		return 0;

	}
	 public List<StudentEntity> getAllStudents() {
	        return studrep.findAll();
	    }
}
