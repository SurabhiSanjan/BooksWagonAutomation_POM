package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
    String propertyFilePath = "C:\\Users\\atulk\\IdeaProjects\\AutomationBooksWagon\\TestData.properties";
    public Properties properties;

    public ReadPropertyFile() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            properties.load(reader);
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("tesData.properties file not found");
        }
    }
}