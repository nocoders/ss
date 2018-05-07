/**
 * <p>Title: LogCountController.java</p>   
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author 林猛 
 * @date 2018年5月2日  
 * @version 1.0   
*/  
package com.study.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.model.Logcount;
import com.study.service.LogCountService;
import com.study.utils.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsDateJsonValueProcessor;

/**
 * @author linmeng
 *
 */
@Controller
@RequestMapping(value = "/poi", method = {RequestMethod.POST,RequestMethod.GET})
public class LogCountController {
	@Autowired
	private LogCountService logCountService;
	@RequestMapping(value = "/list", method = {RequestMethod.POST,RequestMethod.GET})
	public String findAll(HttpServletResponse response) throws Exception {
		List<Logcount> list = logCountService.selectAllLogCount();
		Integer total=logCountService.selectLogcountCount();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class, new JsDateJsonValueProcessor());
		JSONObject result = new JSONObject();
		JSONArray jsonArray = JSONArray.fromObject(list,jsonConfig);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
}
