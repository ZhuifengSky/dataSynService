package com.main.autojob.model;

import java.io.Serializable;
import java.util.Date;

import com.common.util.DateUtil;
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
	private String createDate; // ��������
	
	public AutoJobErrorLog() {
		// TODO Auto-generated constructor stub
	}
	public AutoJobErrorLog(String jobName, String errorMsg) {
		super();
		this.jobName = jobName;
		this.errorMsg = errorMsg;
		this.createDate = DateUtil.format(new Date(), DateUtil.BOTH);
	}

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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	
}
