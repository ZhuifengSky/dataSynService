package com.main.batch.processors;

import org.springframework.batch.item.ItemProcessor;

import com.main.student.model.StudentInfo;

/**
 * ѧԱ������
 * @author pc
 *
 */
public class StudentInfoProcessor implements ItemProcessor<StudentInfo, StudentInfo>{

	@Override
	public StudentInfo process(StudentInfo item) throws Exception {
		System.out.println("���ݴ����");
		System.out.println("�õ��û�"+item.getId()+"----"+item.getUserName());
		return item;
	}

}
