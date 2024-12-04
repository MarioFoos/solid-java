package com.diardon;

import com.diardon.dip.Application;
import com.diardon.dip.Database;
import com.diardon.dip.MySQLDatabase;

// Uso
public class AppDIP
{
	public static void main(String[] args)
	{
		Database database = new MySQLDatabase();
		Application app = new Application(database);
		app.start();
	}
}
