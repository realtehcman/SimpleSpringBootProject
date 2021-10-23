    package com.practice.springbootstarter;

    import com.practice.springbootstarter.controller.topic.MyControllerTopic;
    import org.springframework.boot.SpringApplication; // comes from the static method in SpringApplication class
    import org.springframework.boot.autoconfigure.SpringBootApplication; // comes from @SpringBootApplication

    @SpringBootApplication //1. Sets up the SpringBoot
    public class MySpringBootApp {
        public static void main(String[] args) { //2. Starting the app
            SpringApplication.run(MySpringBootApp.class, args); //3. Starting the SpringBoot
//            new MyControllerTopic().gettingTopics().getListOfTopics().forEach(s -> System.out.println(s.getTopic()));

        }
    }
