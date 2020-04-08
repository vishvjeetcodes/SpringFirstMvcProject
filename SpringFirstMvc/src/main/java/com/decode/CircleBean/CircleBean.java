package com.decode.CircleBean;

public class CircleBean 
{
	private double radius;
	private double area;
	private double circumference;
	
	
	@Override
	public String toString() {
		return "CircleBean [radius=" + radius + ", area=" + area + ", circumference=" + circumference + "]";
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getCircumference() {
		return circumference;
	}
	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}
	
}
