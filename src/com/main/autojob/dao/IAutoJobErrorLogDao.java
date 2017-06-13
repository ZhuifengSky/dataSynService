package com.main.autojob.dao;


import org.springframework.stereotype.Repository;

import com.main.autojob.model.AutoJobErrorLog;

/**
 * 任务错误日志Dao
 * @author pc-zw
 *
 */
@Repository
public interface IAutoJobErrorLogDao {

	/**
	 * 任务错误日志记录
	 * @param errorLog
	 * @return
	 */
	public int insetJobErrorLog(AutoJobErrorLog errorLog);
}
