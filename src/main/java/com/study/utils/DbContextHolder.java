/**
 * <p>Title: DbContextHolder.java</p>   
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author 林猛 
 * @date 2018年5月2日  
 * @version 1.0   
*/  
package com.study.utils;

/**
 * @author linmeng
 * 切换数据源的工具类
 */
public class DbContextHolder {
	private static final ThreadLocal<String>THREAD_DATA_SOURCE =new ThreadLocal<>();
	/**
	 * 设置当前数据库
	 */
	 public static void setDataSource(String dataSource) {
	        THREAD_DATA_SOURCE.set(dataSource);
	    }
	/**
	 * 取得当前数据库
	 */
	   public static String getDataSource() {
	        return THREAD_DATA_SOURCE.get();
	    }

	/**
	 * 清除上下文数据
	 */
	   public static void clearDataSource() {
	        THREAD_DATA_SOURCE.remove();
	    }
}
