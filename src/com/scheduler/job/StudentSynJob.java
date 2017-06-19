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
 * ѧԱ����ͬ��
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
				//�����߼�
				
				
				
				//����������ҵ��ʱ��
				jobTime.setStartTime(serviceEndTime);
				jobTime.setUpdateBy(util.getPropertyValue("jobTime.update.id"));
				jobTime.setUpdateDate(DateUtil.format(new Date(), DateUtil.BOTH));
				autoJobTimeServiceImpl.upJobTime(jobTime);							
			}else{
				AutoJobErrorLog errorLog = new AutoJobErrorLog(jobName,"δ�鵽����studentSyn��ҵ��ʱ����ߴ��ڶ��!");
				autoJobErrorLogServiceImpl.saveJobErrorLog(errorLog );
			}
	}
	  

	public static void main(String[] args) {
		log.error("��¼������Ϣ");
	}
}
