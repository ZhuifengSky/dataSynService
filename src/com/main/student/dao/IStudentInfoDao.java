package com.main.student.dao;

import java.util.List;

import com.main.student.model.StudentInfo;

/**
 * 学员Dao
 * @author pc
 *
 */
public interface IStudentInfoDao {

	/**
	 * 批量插入学员
	 * @param students
	 * @return
	 */
	public int batchInsertStudent(List<StudentInfo> students);
	
	/**
	 * 批量插入代理商学员
	 * @param students
	 * @return
	 */
	public int batchInsertAgentStudent(List<StudentInfo> students);
	
	
}
