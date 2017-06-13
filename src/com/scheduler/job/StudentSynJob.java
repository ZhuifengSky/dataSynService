package com.scheduler.job;

import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.main.autojob.model.AutoJobErrorLog;
import com.main.autojob.model.AutoJobTime;
import com.main.autojob.service.IAutoJobErrorLogService;
import com.main.autojob.service.IAutoJobTimeService;

/**
 * ѧԱ����ͬ��
 * @author pc-zw
 *
 */
public class StudentSynJob {

	@Autowired
	private IAutoJobTimeService autoJobTimeServiceImpl;
	@Autowired
	private IAutoJobErrorLogService autoJobErrorLogServiceImpl;
	
	private static String jobName = "studentSyn";
	private Logger log;

	protected void studentDataSyn()
			throws JobExecutionException {
		System.out.println("ѧԱͬ��");
		List<AutoJobTime> jobTimes =  autoJobTimeServiceImpl.getJobTimeByName(jobName);
		if (jobTimes!=null && jobTimes.size()==1) {
			System.out.println("�õ�ʱ��"+jobTimes.get(0).getJobName());
		}else{
			AutoJobErrorLog errorLog = new AutoJobErrorLog(jobName,"δ�鵽����studentSyn��ҵ��ʱ����ߴ��ڶ��!");
			autoJobErrorLogServiceImpl.saveJobErrorLog(errorLog );
		}
	}

	
	  

}
