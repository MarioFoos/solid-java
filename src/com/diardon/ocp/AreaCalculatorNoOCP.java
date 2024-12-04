package com.diardon.ocp;

// C�digo que viola el OCP: agregar nuevos m�todos para calcular nuevas formas requiere modificar la clase
public class AreaCalculatorNoOCP
{
	public double calculateCircleArea(double radius)
	{
		return Math.PI * radius * radius;
	}
	public double calculateRectangleArea(double width, double height)
	{
		return width * height;
	}
}
