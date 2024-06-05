package com.techelevator.restaurant;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogWriter {

    private String fileName = "log.txt";


    public void writeToLog(String message) {

        File logFile = new File(fileName);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = dateTimeFormatter.format(now);



        try {

            if (! logFile.exists()) {
                logFile.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(logFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(formattedDate + ": " + message);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();

        }
        catch (Exception e) {




        }




    }


}
