package com.main.autojob.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.autojob.dao.IAutoJobTimeDao;
import com.main.autojob.model.AutoJobTime;
import com.main.autojob.service.IAutoJobTimeService;

/**
 * �Զ�����ʱ�����
 * @author pc-zw
 *
 */
@Service
public class AutoJobTimeServiceImpl implements IAutoJobTimeService{

	@Autowired
	private IAutoJobTimeDao jobTimeDao;
	
	/**
	 * ����job���ƻ���job�ϴν�ֹʱ��
	 * @param jobName
	 * @return
	 */
	public List<AutoJobTime> getJobTimeByName(String jobName){
		AutoJobTime jobTime = new AutoJobTime();
		jobTime.setJobName(jobName);
		return jobTimeDao.getJobTimes(jobTime);		
	};
}
