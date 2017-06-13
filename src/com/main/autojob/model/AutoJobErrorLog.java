package com.main.autojob.model;

import java.io.Serializable;
/**
 * 自动任务错误日志
 * @author pc-zw
 *
 */
public class AutoJobErrorLog implements Serializable{

	private static final long serialVersionUID = 1L;
	private String jobName;		// 任务名称
	private String errorMsg;		// 错误信息
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
}
