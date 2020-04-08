package com.decode.CylinderController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.decode.CylinderModel.Cylinderbean;
import com.decode.CylinderService.CylinderService;

@Controller
public class CylinderController 
{
	@RequestMapping("cylinderCont")
	public String index() 
	{
		return "cylinderIndex.jsp";
	}
	
	@RequestMapping("cylinderdata")
	public ModelAndView getdata(@RequestParam("radius") double radius,@RequestParam("height")int height)
	{
		CylinderService  service=new CylinderService();
		Cylinderbean bean=service.getdata(radius, height);
				ModelAndView view=new ModelAndView("cylinderresult.jsp");
				view.addObject("cydata", bean);
				return view;
				
		
	}
}
