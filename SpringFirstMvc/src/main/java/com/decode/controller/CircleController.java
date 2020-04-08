package com.decode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.decode.CircleBean.CircleBean;
import com.decode.CircleService.CircleService;

@Controller
public class CircleController
{
	@RequestMapping("circleCont")
	public String welcomePage()
	{
		return "CircleIndex.jsp";
	}
	
	@RequestMapping("circledata")
	public ModelAndView getdata(@RequestParam("rad") double radius)
	{
		CircleService circle=new CircleService();
		CircleBean bean=circle.service(radius);
		ModelAndView view=new ModelAndView("circleresult.jsp");
		view.addObject("circledata", bean);
		return view;
	}
	
	
}
