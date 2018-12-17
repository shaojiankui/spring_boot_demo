package org.skyfox.spring_boot_demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.skyfox.spring_boot_demo.Service.UserService;
import org.skyfox.spring_boot_demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Resource
    private UserService userService;
	
	@RequestMapping(value="/home")
	public String home(){
		System.out.println("redirect to home page!");
		return "index";
	}
	
	
	@RequestMapping(value="/home/page")
	@ResponseBody
	public ModelAndView goHome(){
		System.out.println("go to the home page!");
		ModelAndView mode = new ModelAndView();
		mode.addObject("name", "zhangsan");
		mode.setViewName("index");
		return mode;
	}
	
	@RequestMapping(value="/test")
	@ResponseBody
	  public User toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("user_id"));
        User user = this.userService.getUserById(userId);
        return user;
    }
}
