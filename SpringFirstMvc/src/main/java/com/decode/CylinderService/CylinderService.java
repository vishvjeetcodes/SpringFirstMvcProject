package com.decode.CylinderService;

import com.decode.CylinderModel.Cylinderbean;

public class CylinderService 
{
	public Cylinderbean getdata(double radius,double height)
	{
		double area=2*3.14*radius*height+2*3.14*radius*radius;
		Cylinderbean bean=new Cylinderbean();
		bean.setRadius(radius);
		bean.setHeight(height);
		bean.setArea(area);
		return bean;
	}
}
