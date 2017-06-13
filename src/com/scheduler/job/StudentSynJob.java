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
 * 学员数据同步
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
		System.out.println("学员同步");
		List<AutoJobTime> jobTimes =  autoJobTimeServiceImpl.getJobTimeByName(jobName);
		if (jobTimes!=null && jobTimes.size()==1) {
			
		}else{
			AutoJobErrorLog errorLog = new AutoJobErrorLog();
			errorLog.setJobName(jobName);
			errorLog.setErrorMsg("未查到任务studentSyn的业务时间或者存在多个!");
			autoJobErrorLogServiceImpl.saveJobErrorLog(errorLog );
		}
	}

	
	  

}
