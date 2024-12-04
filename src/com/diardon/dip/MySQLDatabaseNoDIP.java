package com.diardon.dip;

// Esta clase en s� no viola el principio DIP, sino que en el ejemplo de violaci�n se usa
// directamente desde la aplicaci�n, sin abstraerla
public class MySQLDatabaseNoDIP
{
    public void connect()
    {
        System.out.println("Conectando a MySQL...");
    }
}
