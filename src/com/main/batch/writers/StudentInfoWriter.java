package com.main.batch.writers;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.main.student.model.StudentInfo;

/**
 * 学员写入
 * @author pc
 *
 */
public class StudentInfoWriter implements ItemWriter<StudentInfo>{

	@Override
	public void write(List<? extends StudentInfo> items) throws Exception {
		System.out.println("到写操作啦");
		System.out.println("拿到要存的数据");
		for (StudentInfo studentInfo : items) {
			System.out.println(studentInfo.getUid()+"---"+studentInfo.getuName());
		}
		
	}

	

}
