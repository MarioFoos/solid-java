package com.diardon.dip;

public class Application
{
	private Database database;

	public Application(Database database)
	{
		this.database = database;
	}
	public void start()
	{
		database.connect();
	}
}
