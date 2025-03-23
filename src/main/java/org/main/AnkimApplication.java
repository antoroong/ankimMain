package org.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnkimApplication {
    public static void main(String[] args) {

        SpringApplication.run(AnkimApplication.class, args);

        System.out.printf("Hello and welcome!");

        }
}