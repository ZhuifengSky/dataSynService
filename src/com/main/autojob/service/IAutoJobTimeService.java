package com.main.autojob.service;

import java.util.List;

import com.main.autojob.model.AutoJobTime;

/**
 * 自动任务时间管理
 * @author pc-zw
 *
 */
public interface IAutoJobTimeService {

	/**
	 * 根据job名称或者job上次截止时间
	 * @param jobName
	 * @return
	 */
	public List<AutoJobTime> getJobTimeByName(String jobName);
}
