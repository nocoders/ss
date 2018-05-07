/**
 * <p>Title: ReadTxtUtil.java</p>   
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author 林猛 
 * @date 2018年5月3日  
 * @version 1.0   
*/  
package com.study.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * @author linmeng
 * 
 */
public class ReadTxtUtil {
//	按行读取txt文件里面的内容，并且存储到list<Array>里面
	public static List<String[]>getTxt(String path){
		File file = new File(path);
		BufferedReader reader=null;
		String temp=null;
		int line=1;
		List<String[]> list = new ArrayList<>();
		ArrayList<String[]> arrayList = new ArrayList<String[]>();
		try {
			reader=new BufferedReader(new FileReader(file));
			while((temp=reader.readLine())!=null) {
				String[] split = temp.split("/t");
				
//				System.out.println("line"+line+":"+temp);
				list.add(split);
				line++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (reader!=null) {
				try {
					reader.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		return list;
		
	}
/*
 * 	将List<String[]>中的数据先取出每列元素进行比对，将每列中相同的放入map中，
 *  比对成功的数据，直接删除。
 *  最后放入List<Integer[]>里面
 *  返回一个
	*/
	
//	获取一列数组
	public static List<String> getResult(List<String[]> list,int l){
//		列表宽度
		List<String> list2 = new ArrayList<String>();
		
		for (String[] st : list) {
			list2.add(st[l]);
		}
		return list2;
		
	}
	
	public static List<Set<Integer>>getBd(List<String>list){
		for (int i = 0; i < list.size(); i++) {
			Set<Integer> set = new HashSet<>();
			set.add(i);
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(i)==list.get(j)) {
				}
			}
		}
		return null;
		
	}
	
}
