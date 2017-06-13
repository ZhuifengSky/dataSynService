package com.main.autojob.dao;


import org.springframework.stereotype.Repository;

import com.main.autojob.model.AutoJobErrorLog;

/**
 * ���������־Dao
 * @author pc-zw
 *
 */
@Repository
public interface IAutoJobErrorLogDao {

	/**
	 * ���������־��¼
	 * @param errorLog
	 * @return
	 */
	public int insetJobErrorLog(AutoJobErrorLog errorLog);
}
