package com.main.autojob.service;


import com.main.autojob.model.AutoJobErrorLog;

/**
 * ���������־Service
 * @author pc-zw
 *
 */
public interface IAutoJobErrorLogService {

	/**
	 * ���������־��¼
	 * @param errorLog
	 * @return
	 */
	public int saveJobErrorLog(AutoJobErrorLog errorLog);
}
