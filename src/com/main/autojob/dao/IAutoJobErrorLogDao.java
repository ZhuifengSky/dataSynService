package com.main.autojob.dao;


import com.main.autojob.model.AutoJobErrorLog;

/**
 * ���������־Dao
 * @author pc-zw
 *
 */
public interface IAutoJobErrorLogDao {

	/**
	 * ���������־��¼
	 * @param errorLog
	 * @return
	 */
	public int insetJobErrorLog(AutoJobErrorLog errorLog);
}
