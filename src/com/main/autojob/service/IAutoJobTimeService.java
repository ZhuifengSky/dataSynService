package com.main.autojob.service;

import java.util.List;

import com.main.autojob.model.AutoJobTime;

/**
 * �Զ�����ʱ�����
 * @author pc-zw
 *
 */
public interface IAutoJobTimeService {

	/**
	 * ����job���ƻ���job�ϴν�ֹʱ��
	 * @param jobName
	 * @return
	 */
	public List<AutoJobTime> getJobTimeByName(String jobName);
}
