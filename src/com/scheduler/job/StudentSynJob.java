package com.scheduler.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * ѧԱ����ͬ��
 * @author pc-zw
 *
 */
public class StudentSynJob extends QuartzJobBean {

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		System.out.println("ѧԱͬ��");
		
	}

	
	  

}
