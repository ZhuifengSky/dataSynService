package com.main.autojob.model;

import java.io.Serializable;
import java.util.Date;
/**
 * �����ҵ��ʱ��
 * @author pc-zw
 *
 */
public class AutoJobTime implements Serializable{

	private static final long serialVersionUID = 1L;
	private String jobName;		// ��������
	private Date startTime;		// ��ʼʱ��
	private String description;
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
