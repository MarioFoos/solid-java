package com.diardon;

import com.diardon.lsp.Rectangle;
import com.diardon.lsp.Square;
import com.diardon.lsp.Shape;

// Uso
public class AppLSP
{
	public static void main(String[] args)
	{
		Shape rectangle = new Rectangle(4, 6);
		Shape square = new Square(5);

		System.out.println("Área del rectángulo: " + rectangle.calculateArea());
		System.out.println("Área del cuadrado: " + square.calculateArea());
	}
}
