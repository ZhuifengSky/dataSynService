package com.main.student.model;
/**
 * 学员信息
 * @author pc
 *
 */
public class StudentInfo {

	private Long uid;			//用户ID
	private String uName;    //用户名
	private String nickName;        //用户昵称
	private String phone;		//手机号
	private Integer chId;  //渠道ID
	private String regTime;     //注册时间
	private Integer srcType; //来源
	
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getChId() {
		return chId;
	}
	public void setChId(Integer chId) {
		this.chId = chId;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	public Integer getSrcType() {
		return srcType;
	}
	public void setSrcType(Integer srcType) {
		this.srcType = srcType;
	}
	
	
	
	
	
}
