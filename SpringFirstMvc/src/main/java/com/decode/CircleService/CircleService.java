package com.decode.CircleService;

import com.decode.CircleBean.CircleBean;

public class CircleService 
{
	public CircleBean service(double radius)
	{
		double area=3.14*radius*radius;
		double circum=2*3.14*radius;
		CircleBean bean=new CircleBean();
		bean.setRadius(radius);
		bean.setArea(area);
		bean.setCircumference(circum);
		return bean;
		
		
	}
}
