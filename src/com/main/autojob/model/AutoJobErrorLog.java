package com.main.autojob.model;

import java.io.Serializable;
/**
 * �Զ����������־
 * @author pc-zw
 *
 */
public class AutoJobErrorLog implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String jobName;		// ��������
	private String errorMsg;		// ������Ϣ
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
