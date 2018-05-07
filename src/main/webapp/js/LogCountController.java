package com.cd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.cd.model.LogCount;
import com.cd.service.LogCountService;
//import com.cd.utils.ListToCsv;

@RestController
@RequestMapping(value = "/find", method = {RequestMethod.POST,RequestMethod.GET})
public class LogCountController {
	@Autowired
	private LogCountService logCountService;
	@RequestMapping(method=RequestMethod.POST,value="/get")
	public String findall() {
		List<LogCount> count = logCountService.selectAllLogCount();
		if (count.isEmpty()) {
			return "0";
		}
		String json = JSON.toJSONString(count);
//		String json = ListToCsv.jToC(count);
//		System.out.println("---"+json+"---");

		return json;
	}
}
