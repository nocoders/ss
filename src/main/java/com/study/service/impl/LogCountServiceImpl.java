/**
 * <p>Title: LogCountServiceImpl.java</p>   
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author 林猛 
 * @date 2018年5月2日  
 * @version 1.0   
*/  
package com.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.LogcountMapper;
import com.study.model.Logcount;
import com.study.service.LogCountService;

/**
 * @author linmeng
 *
 */
@Service
public class LogCountServiceImpl implements LogCountService{
	@Autowired
	private LogcountMapper logcountMapper;
	/* (non-Javadoc)
	 * @see com.study.service.LogCountService#selectAllLogCount()
	 */
	@Override
	public List<Logcount> selectAllLogCount() {
		List<Logcount> count = logcountMapper.selectAllLogCount();
		// TODO Auto-generated method stub
		return count;
	}

}
