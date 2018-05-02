/**
 * <p>Title: LogCountController.java</p>   
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author 林猛 
 * @date 2018年5月2日  
 * @version 1.0   
*/  
package com.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.study.model.Logcount;
import com.study.service.LogCountService;

/**
 * @author linmeng
 *
 */
@RestController
@RequestMapping(value = "/poi", method = {RequestMethod.POST,RequestMethod.GET})
public class LogCountController {
	@Autowired
	private LogCountService logCountService;
	@RequestMapping(value = "/findAll", method = {RequestMethod.POST,RequestMethod.GET})
	public String findAll() {
		List<Logcount> counts = logCountService.selectAllLogCount();
		String json = JSON.toJSONString(counts);
		return json;
	}
}
