package com.diardon.ocp;

// Código que viola el OCP: agregar nuevos métodos para calcular nuevas formas requiere modificar la clase
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
