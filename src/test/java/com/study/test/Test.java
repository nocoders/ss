/**
 * <p>Title: Test.java</p>   
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author 林猛 
 * @date 2018年5月2日  
 * @version 1.0   
*/  
package com.study.test;

import java.util.List;
import java.util.Set;

import com.study.utils.ReadTxtUtil;

/**
 * @author linmeng
 *
 */
public class Test {
	
	public static void main(String[] args) {
		 List<String[]> list = ReadTxtUtil.getTxt("E:\\1.txt");
		System.out.println(list.size());
		
	}
}
