package com.main.autojob.dao;


import com.main.autojob.model.AutoJobErrorLog;

/**
 * 任务错误日志Dao
 * @author pc-zw
 *
 */
public interface IAutoJobErrorLogDao {

	/**
	 * 任务错误日志记录
	 * @param errorLog
	 * @return
	 */
	public int insetJobErrorLog(AutoJobErrorLog errorLog);
}
