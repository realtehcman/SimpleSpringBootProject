package com.practice.springbootstarter.controller.topics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MyControllerTopic {

    @RequestMapping("/topics")
    public List<TopicsToStudy> showTopics(){
        return Arrays.asList(
                new TopicsToStudy(1,"REST API", "very" ),
                new TopicsToStudy(2, "JSON", "medium"),
                new TopicsToStudy(3, "servlets", "medium")

        );
    }
}
