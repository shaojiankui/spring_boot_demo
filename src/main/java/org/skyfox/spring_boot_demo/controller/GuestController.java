package org.skyfox.spring_boot_demo.controller;

import org.skyfox.spring_boot_demo.entity.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/guest") 
public class GuestController{ 
	
	private final ResultMap resultMap;
	  
	@Autowired
	public GuestController(ResultMap resultMap) {
	    this.resultMap = resultMap;
	}
	
	@RequestMapping(value = "/enter", method = RequestMethod.GET) 
	@ResponseBody
	public ResultMap login() {
		return resultMap.success().message("欢迎进入，您的身份是游客");
	} 
	@RequestMapping(value = "/getMessage", method = RequestMethod.GET) 
	@ResponseBody
	public ResultMap submitLogin() {
		return resultMap.success().message("您拥有获得该接口的信息的权限！");
	} 
}