package com.main.autojob.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.autojob.dao.IAutoJobErrorLogDao;
import com.main.autojob.model.AutoJobErrorLog;
import com.main.autojob.service.IAutoJobErrorLogService;

/**
 * 任务错误日志Dao
 * @author pc-zw
 *
 */
@Service
public class AutoJobErrorLogServiceImpl implements IAutoJobErrorLogService{

	@Autowired
	private IAutoJobErrorLogDao errorLogDao;
	
	/**
	 * 任务错误日志记录
	 * @param errorLog
	 * @return
	 */
	@Override
	public int saveJobErrorLog(AutoJobErrorLog errorLog) {
		return errorLogDao.insetJobErrorLog(errorLog);
	}
}
