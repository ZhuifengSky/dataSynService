package com.scheduler.job;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

import org.quartz.JobExecutionContext;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.configuration.JobLocator;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 运用SpringBatch进行数据同步job
 * @author pc-zw
 * 使用SpringBatch进行数据同步，在spring_job_quartz中增加任务
 */
public class BatchDataSynJob extends QuartzJobBean {

	
	  static final String JOB_NAME = "jobName";

	  private JobLocator jobLocator;

	  private JobLauncher jobLauncher;

	  public void setJobLocator(JobLocator jobLocator) {
		this.jobLocator = jobLocator;
	  }

	  public void setJobLauncher(JobLauncher jobLauncher) {
		this.jobLauncher = jobLauncher;
	  }

	  protected void executeInternal(JobExecutionContext context) {

		Map<String, Object> jobDataMap = context.getMergedJobDataMap();
		String jobName = (String) jobDataMap.get(JOB_NAME);
		JobParameters jobParameters = getJobParametersFromJobMap(jobDataMap);
		try {
			jobLauncher.run(jobLocator.getJob(jobName), jobParameters);
		} catch (JobExecutionAlreadyRunningException | JobRestartException
				| JobInstanceAlreadyCompleteException
				| JobParametersInvalidException | NoSuchJobException e) {
			e.printStackTrace();
		}
	  }

	  private JobParameters getJobParametersFromJobMap(Map<String, Object> jobDataMap) {
		JobParametersBuilder builder = new JobParametersBuilder();
		for (Entry<String, Object> entry : jobDataMap.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			if (value instanceof String && !key.equals(JOB_NAME)) {
				builder.addString(key, (String) value);
			} else if (value instanceof Float || value instanceof Double) {
				builder.addDouble(key, ((Number) value).doubleValue());
			} else if (value instanceof Integer || value instanceof Long) {
				builder.addLong(key, ((Number) value).longValue());
			} else if (value instanceof Date) {
				builder.addDate(key, (Date) value);
			} else {
				// JobDataMap contains values which are not job parameters
				// (ignoring)
			}
		}
		builder.addDate("run date", new Date());
		return builder.toJobParameters();

	  }


}
