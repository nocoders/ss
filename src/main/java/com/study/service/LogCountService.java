/**
 * <p>Title: LogCountService.java</p>   
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author 林猛 
 * @date 2018年5月2日  
 * @version 1.0   
*/  
package com.study.service;

import java.util.List;

import com.study.model.Logcount;


/**
 * @author linmeng
 *
 */
public interface LogCountService {
	public List<Logcount>selectAllLogCount();
    
    public Integer selectLogcountCount();

}
