package com.diardon.dip;

public class ApplicationNoDIP
{
	private MySQLDatabaseNoDIP database;

	public ApplicationNoDIP()
	{
        this.database = new MySQLDatabaseNoDIP();
    }
	public void start()
	{
		database.connect();
	}
}
