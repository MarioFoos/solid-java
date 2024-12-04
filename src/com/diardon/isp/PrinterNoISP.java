package com.diardon.isp;

// La clase se ve obligada a imprementar métodos que no necesita 
public class PrinterNoISP implements MachineNoISP
{
	@Override
	public void print()
	{
		System.out.println("Imprimiendo...");
	}
	@Override
	public void scan()
	{
		throw new UnsupportedOperationException("No soportado.");
	}
	@Override
	public void fax()
	{
		throw new UnsupportedOperationException("No soportado.");
	}
}
