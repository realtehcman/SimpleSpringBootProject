package com.practice.springbootstarter.controller.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MyServerForTopic {
    private List<TopicToStudy> listOfTopics = Arrays.asList(
            new TopicToStudy(1, "REST API", "very"),
            new TopicToStudy(2, "JSON", "medium"),
            new TopicToStudy(3, "servlets", "medium")
    );

    public List<TopicToStudy> getListOfTopics() {
        return listOfTopics;
    }
}
