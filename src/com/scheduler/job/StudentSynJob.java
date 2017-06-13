package com.scheduler.job;

import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.main.autojob.dao.IAutoJobErrorLogDao;
import com.main.autojob.dao.IAutoJobTimeDao;
import com.main.autojob.model.AutoJobErrorLog;
import com.main.autojob.model.AutoJobTime;

/**
 * ѧԱ����ͬ��
 * @author pc-zw
 *
 */
public class StudentSynJob extends QuartzJobBean {

	@Autowired
	private IAutoJobTimeDao jobTimeDao;
	@Autowired
	private IAutoJobErrorLogDao errorLogDao;	
	private static String jobName = "studentSyn";
	
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		System.out.println("ѧԱͬ��");
		List<AutoJobTime> jobTimes =  jobTimeDao.getJobTimeByName(jobName);
		if (jobTimes!=null && jobTimes.size()==1) {
			
		}else{
			AutoJobErrorLog errorLog = new AutoJobErrorLog();
			errorLog.setJobName(jobName);
			errorLog.setErrorMsg("δ�鵽����studentSyn��ҵ��ʱ����ߴ��ڶ��!");
			errorLogDao.insetJobErrorLog(errorLog );
		}
	}

	
	  

}
