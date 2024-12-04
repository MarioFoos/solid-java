package com.diardon.dip;

public class MySQLDatabase implements Database
{
	@Override
	public void connect()
	{
		System.out.println("Conectando a MySQL...");
	}
}
