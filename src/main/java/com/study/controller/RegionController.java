/**
 * <p>Title: RegionController.java</p>   
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author 林猛 
 * @date 2018年5月2日  
 * @version 1.0   
*/  
package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.service.RegionService;

/**
 * @author linmeng
 *
 */
@Controller
@RequestMapping(value = "/reg", method = {RequestMethod.POST,RequestMethod.GET})
public class RegionController {
	@Autowired
	private RegionService regionService;
	@RequestMapping("/get")
	public String get() {
		regionService.findcode();
		return null;
	}
}
