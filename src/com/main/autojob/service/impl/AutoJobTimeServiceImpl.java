package com.main.autojob.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.autojob.dao.IAutoJobTimeDao;
import com.main.autojob.model.AutoJobTime;
import com.main.autojob.service.IAutoJobTimeService;

/**
 * 自动任务时间管理
 * @author pc-zw
 *
 */
@Service
public class AutoJobTimeServiceImpl implements IAutoJobTimeService{

	@Autowired
	private IAutoJobTimeDao jobTimeDao;
	
	/**
	 * 根据job名称或者job上次截止时间
	 * @param jobName
	 * @return
	 */
	public List<AutoJobTime> getJobTimeByName(String jobName){
		AutoJobTime jobTime = new AutoJobTime();
		jobTime.setJobName(jobName);
		return jobTimeDao.getJobTimes(jobTime);		
	};
}
