package com.diardon.srp;

// Clase que viola el SRP: mezcla l�gica de reportes y almacenamiento
public class Report
{
	public void generateReport()
	{
		System.out.println("Generando reporte...");
	}
	public void saveToFile()
	{
		System.out.println("Guardando reporte en archivo...");
	}
}
