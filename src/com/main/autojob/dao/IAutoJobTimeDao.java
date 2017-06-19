package com.main.autojob.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.autojob.model.AutoJobTime;

/**
 * �Զ�����ʱ�����
 * @author pc-zw
 *
 */
@Repository
public interface IAutoJobTimeDao {

	/**
	 * ����job���ƻ���job�ϴν�ֹʱ��
	 * @param jobTime
	 * @return
	 */
	public List<AutoJobTime> getJobTimes(AutoJobTime jobTime);
	
	/**
	 * �����Զ������ϴ�ҵ��ʱ��
	 * @param jobTime
	 * @return
	 */
	public int updateJobTime(AutoJobTime jobTime);
}
