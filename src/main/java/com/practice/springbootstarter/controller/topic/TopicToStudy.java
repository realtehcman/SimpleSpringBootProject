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