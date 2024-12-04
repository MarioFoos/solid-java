package com.diardon;

import com.diardon.ocp.AreaCalculator;
import com.diardon.ocp.Circle;
import com.diardon.ocp.Rectangle;
import com.diardon.ocp.Shape;

// Uso
public class AppOCP
{
	public static void main(String[] args)
	{
		Shape[] shapes = { new Circle(5), new Rectangle(4, 6) };
		AreaCalculator calculator = new AreaCalculator();
		System.out.println("Área total: " + calculator.calculateTotalArea(shapes));
	}
}
