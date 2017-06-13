package com.main.autojob.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.autojob.model.AutoJobTime;

/**
 * 自动任务时间管理
 * @author pc-zw
 *
 */
@Repository
public interface IAutoJobTimeDao {

	/**
	 * 根据job名称或者job上次截止时间
	 * @param jobTime
	 * @return
	 */
	public List<AutoJobTime> getJobTimes(AutoJobTime jobTime);
}
