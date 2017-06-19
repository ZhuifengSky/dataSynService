package com.scheduler.job;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.common.util.DateUtil;
import com.common.util.EnvironmentUtil;
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
	private static EnvironmentUtil util = new EnvironmentUtil();
	private static String jobName = "studentSyn";
	private static Logger log = Logger.getLogger(StudentSynJob.class);;

	protected void studentDataSyn(){
			List<AutoJobTime> jobTimes =  autoJobTimeServiceImpl.getJobTimeByName(jobName);
			if (jobTimes!=null && jobTimes.size()==1) {
				AutoJobTime jobTime = jobTimes.get(0);
				String serviceStartTime =jobTime.getStartTime();
				String serviceEndTime = util.getPropertyValue("service.endTime");						
				//任务逻辑
				
				
				
				//最后更新任务业务时间
				jobTime.setStartTime(serviceEndTime);
				jobTime.setUpdateBy(util.getPropertyValue("jobTime.update.id"));
				jobTime.setUpdateDate(DateUtil.format(new Date(), DateUtil.BOTH));
				autoJobTimeServiceImpl.upJobTime(jobTime);							
			}else{
				AutoJobErrorLog errorLog = new AutoJobErrorLog(jobName,"未查到任务studentSyn的业务时间或者存在多个!");
				autoJobErrorLogServiceImpl.saveJobErrorLog(errorLog );
			}
	}
	  

	public static void main(String[] args) {
		log.error("记录错误信息");
	}
}
