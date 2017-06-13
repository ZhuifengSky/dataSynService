package com.main.autojob.dao;

import java.util.List;

import com.main.autojob.model.AutoJobTime;

/**
 * �Զ�����ʱ�����
 * @author pc-zw
 *
 */
public interface IAutoJobTimeDao {

	/**
	 * ����job���ƻ���job�ϴν�ֹʱ��
	 * @param jobName
	 * @return
	 */
	public List<AutoJobTime> getJobTimeByName(String jobName);
}
