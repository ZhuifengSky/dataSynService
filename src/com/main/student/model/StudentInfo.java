package com.main.student.model;
/**
 * ѧԱ��Ϣ
 * @author pc
 *
 */
public class StudentInfo {

	private Long uid;			//�û�ID
	private String uName;    //�û���
	private String nickName;        //�û��ǳ�
	private String phone;		//�ֻ���
	private Integer chId;  //����ID
	private String regTime;     //ע��ʱ��
	private Integer srcType; //��Դ
	
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
