package com.main.batch.processors;

import org.springframework.batch.item.ItemProcessor;

import com.main.student.model.StudentInfo;

/**
 * 学员对象处理
 * @author pc
 *
 */
public class StudentInfoProcessor implements ItemProcessor<StudentInfo, StudentInfo>{

	@Override
	public StudentInfo process(StudentInfo item) throws Exception {
		System.out.println("数据处理层");
		System.out.println("拿到用户"+item.getUid()+"----"+item.getuName());
		return item;
	}

}
