package com.coinbank2.coinbank2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv; // Add this line

@SpringBootApplication
public class Coinbank2Application {

    public static void main(String[] args) {
        // Load .env variables into System Properties
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

        SpringApplication.run(Coinbank2Application.class, args);
    }



}
