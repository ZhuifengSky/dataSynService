package com.main.batch.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.main.student.model.StudentInfo;

/**
 * ӳ����
 * @author pc-zw
 *
 */
public class StudentInfoMapper implements RowMapper<StudentInfo>{

	

///��װΪ����
@Override
public StudentInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
	StudentInfo s = new  StudentInfo();   
	s.setUserName(rs.getString("STUDENTNAME" ));
	s.setId(Long.parseLong(rs.getString("id")));
     return  s;        
}

}
