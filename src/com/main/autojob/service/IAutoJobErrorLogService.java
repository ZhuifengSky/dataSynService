package com.main.autojob.service;


import com.main.autojob.model.AutoJobErrorLog;

/**
 * 任务错误日志Service
 * @author pc-zw
 *
 */
public interface IAutoJobErrorLogService {

	/**
	 * 任务错误日志记录
	 * @param errorLog
	 * @return
	 */
	public int saveJobErrorLog(AutoJobErrorLog errorLog);
}
