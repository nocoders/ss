/**
 * <p>Title: DataSource.java</p>   
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author 林猛 
 * @date 2018年5月3日  
 * @version 1.0   
*/  
package com.study.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author linmeng
 *
 */

/*	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)*/
	@Target({ElementType.TYPE,ElementType.METHOD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface DataSource{
		String value();
	}

