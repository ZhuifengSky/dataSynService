package com.main.batch.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.main.student.model.StudentInfo;

/**
 * 映射类
 * @author pc-zw
 *
 */
public class StudentInfoMapper implements RowMapper<StudentInfo>{

	

///封装为对象
@Override
public StudentInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
	StudentInfo s = new  StudentInfo();   
	s.setuName(rs.getString("STUDENTNAME"));
	s.setUid(Long.parseLong(rs.getString("id")));
     return  s;        
}

}
