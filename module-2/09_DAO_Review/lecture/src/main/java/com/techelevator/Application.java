package com.techelevator;


import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;
import java.util.Scanner;

public class Application {

    private final Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/burgers");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        Application application = new Application(dataSource);
        application.run();
    }

    public Application(DataSource dataSource) {
        //todo: do DAO stuff

    }

    private void run() {
        System.out.println("Do stuff");
    }



}
