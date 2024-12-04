package com.diardon.dip;

// Esta clase en sí no viola el principio DIP, sino que en el ejemplo de violación se usa
// directamente desde la aplicación, sin abstraerla
public class MySQLDatabaseNoDIP
{
    public void connect()
    {
        System.out.println("Conectando a MySQL...");
    }
}
