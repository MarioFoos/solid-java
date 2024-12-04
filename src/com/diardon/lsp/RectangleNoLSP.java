package com.diardon.lsp;

// Ejemplo que viola el LSP
public class RectangleNoLSP
{
	private double width, height;

	public void setWidth(double width)
	{
		this.width = width;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getArea()
	{
		return width * height;
	}
}
