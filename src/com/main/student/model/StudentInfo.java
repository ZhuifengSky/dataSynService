package com.main.student.model;
/**
 * 学员信息
 * @author pc
 *
 */
public class StudentInfo {

	private Long id;			//用户ID
	private String userName;    //用户名
	private String name;        //用户昵称
	private String address;		//地址
	private String mobile;		//手机号
	private String md5mobile;	//手机号MD5
	private Integer channelId;  //渠道ID
	private String addTime;     //注册时间
	private Integer sourceType; //来源
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMd5mobile() {
		return md5mobile;
	}
	public void setMd5mobile(String md5mobile) {
		this.md5mobile = md5mobile;
	}
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	public Integer getSourceType() {
		return sourceType;
	}
	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}
	
	
	
}
