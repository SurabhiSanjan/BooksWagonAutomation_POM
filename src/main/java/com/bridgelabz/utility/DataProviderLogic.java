package com.bridgelabz.utility;

public class DataProviderLogic {
        @org.testng.annotations.DataProvider(name = "testData")
        public Object[][] getData() {
            DataDriven configure = new DataDriven("C:\\Users\\atulk\\IdeaProjects\\AutomationBooksWagon\\src\\Book2.xlsx");
            int rows = configure.getRowCount(0);
            Object[][] credentials = new Object[rows][2];
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < 2; j++) {
                    credentials[i][0] = configure.getData(0, i, 0);
                    credentials[i][1] = configure.getData(0, i, 1);
                }
            }
            return credentials;
        }
    }


