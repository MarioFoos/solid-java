package com.diardon.ocp;

public class AreaCalculator
{
	public double calculateTotalArea(Shape[] shapes)
	{
		double totalArea = 0;
		for(Shape shape : shapes)
		{
			totalArea += shape.calculateArea();
		}
		return totalArea;
	}
}
