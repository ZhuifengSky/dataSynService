package com.main.student.dao;

import java.util.List;

import com.main.student.model.StudentInfo;

/**
 * ѧԱDao
 * @author pc
 *
 */
public interface IStudentInfoDao {

	/**
	 * ��������ѧԱ
	 * @param students
	 * @return
	 */
	public int batchInsertStudent(List<StudentInfo> students);
	
	/**
	 * �������������ѧԱ
	 * @param students
	 * @return
	 */
	public int batchInsertAgentStudent(List<StudentInfo> students);
	
	
}
