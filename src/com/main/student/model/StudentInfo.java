package com.main.student.model;
/**
 * ѧԱ��Ϣ
 * @author pc
 *
 */
public class StudentInfo {

	private Long id;			//�û�ID
	private String userName;    //�û���
	private String name;        //�û��ǳ�
	private String address;		//��ַ
	private String mobile;		//�ֻ���
	private String md5mobile;	//�ֻ���MD5
	private Integer channelId;  //����ID
	private String addTime;     //ע��ʱ��
	private Integer sourceType; //��Դ
	
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
