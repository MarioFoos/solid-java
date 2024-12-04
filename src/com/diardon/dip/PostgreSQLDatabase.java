package com.diardon.dip;

public class PostgreSQLDatabase implements Database
{
	@Override
	public void connect()
	{
		System.out.println("Conectando a PostgreSQL...");
	}
}
