package com.practice.springbootstarter.controller.topic;

public class TopicToStudy {
    private int id;
    private String topic;
    private String importance;

    public TopicToStudy() {
    }

    public TopicToStudy(int id, String topic, String importance) {
        this.id = id;
        this.topic = topic;
        this.importance = importance;
    }

//    TO CHANGE THE JSON VARIABLES (THE OUTPUT ON THE LOCALHOST) CHANGE THE GETTERS VARIABLE NAMES!!!
    public int getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public String getImportance() {
        return importance;
    }
}