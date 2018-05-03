/**
 * <p>Title: RegionMapper.java</p>   
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author 林猛 
 * @date 2018年5月2日  
 * @version 1.0   
*/  
package com.study.dao;


import com.study.utils.DataSource;

/**
 * @author linmeng
 *
 */
@DataSource(value="dataSource_first")
public interface RegionMapper {
	public Integer findcode(String name);
}
