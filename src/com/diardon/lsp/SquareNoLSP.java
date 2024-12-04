package com.diardon.lsp;

public class SquareNoLSP extends RectangleNoLSP
{
	@Override
	public void setWidth(double width)
	{
		super.setWidth(width);
		super.setHeight(width); // Mantener proporci�n cuadrada
	}
	@Override
	public void setHeight(double height)
	{
		super.setHeight(height);
		super.setWidth(height); // Mantener proporci�n cuadrada
	}
}
