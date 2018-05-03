/**
 * <p>Title: MultipleDataSource.java</p>   
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author 林猛 
 * @date 2018年5月2日  
 * @version 1.0   
*/  
package com.study.utils;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author linmeng
 * 自定义数据库切换类
 */
public class MultipleDataSource extends AbstractRoutingDataSource{

	
	@Override
	protected Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
		return DbContextHolder.getDataSource();
	}

	
}
