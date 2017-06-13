package com.main.batch.writers;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.main.student.model.StudentInfo;

/**
 * ѧԱд��
 * @author pc
 *
 */
public class StudentInfoWriter implements ItemWriter<StudentInfo>{

	@Override
	public void write(List<? extends StudentInfo> items) throws Exception {
		System.out.println("��д������");
		System.out.println("�õ�Ҫ�������");
		for (StudentInfo studentInfo : items) {
			System.out.println(studentInfo.getId()+"---"+studentInfo.getUserName());
		}
		
	}

	

}
