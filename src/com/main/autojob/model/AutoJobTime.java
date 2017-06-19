package com.main.autojob.model;

import java.io.Serializable;
/**
 * �����ҵ��ʱ��
 * @author pc-zw
 *
 */
public class AutoJobTime implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String jobName;		// ��������
	private String startTime;		// ��ʼʱ��
	private String description;
	private String updateBy;
	private String updateDate;
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
