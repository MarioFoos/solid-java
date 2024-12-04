package com.diardon;

import com.diardon.srp.ReportGenerator;
import com.diardon.srp.ReportSaver;

public class AppSRP
{
    public static void main(String[] args)
    {
        ReportGenerator generator = new ReportGenerator();
        ReportSaver saver = new ReportSaver();

        generator.generateReport();
        saver.saveToFile();
    }
}
