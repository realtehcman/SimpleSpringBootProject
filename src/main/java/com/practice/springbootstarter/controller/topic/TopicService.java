package com.practice.springbootstarter.controller.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<TopicToStudy> listOfTopics;

    //instance block is called whenever the class is initialized by Spring Boot
    { //object block. I have to do the instance block or directly initialize the field
        listOfTopics = Arrays.asList(
                new TopicToStudy(1, "REST_API", "very"),
                new TopicToStudy(2, "JSON", "medium"),
                new TopicToStudy(3, "servlets", "medium")
        );
    }

    public List<TopicToStudy> getListOfTopics() {
        return listOfTopics;
    }

    public TopicToStudy getTopic(String topicName) {
        return listOfTopics.stream().filter(t ->
                t.getTopic().equalsIgnoreCase(topicName)
        ).findFirst().get();
    }
}
