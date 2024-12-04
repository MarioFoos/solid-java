package com.diardon.lsp;

public class SquareNoLSP extends RectangleNoLSP
{
	@Override
	public void setWidth(double width)
	{
		super.setWidth(width);
		super.setHeight(width); // Mantener proporción cuadrada
	}
	@Override
	public void setHeight(double height)
	{
		super.setHeight(height);
		super.setWidth(height); // Mantener proporción cuadrada
	}
}
