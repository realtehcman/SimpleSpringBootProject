    package com.practice.springbootstarter;

    import org.springframework.boot.SpringApplication; // comes from the static method in SpringApplication class
    import org.springframework.boot.autoconfigure.SpringBootApplication; // comes from @SpringBootApplication

    @SpringBootApplication //1. Sets up the SpringBoot
    public class MySpringBootApp {
        public static void main(String[] args) { //2. Starting the app
            SpringApplication.run(MySpringBootApp.class, args); //3. Starting the SpringBoot

        }
    }
