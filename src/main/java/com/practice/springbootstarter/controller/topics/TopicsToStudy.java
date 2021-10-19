package com.practice.springbootstarter.controller.topics;

public class TopicsToStudy {
    private int _id;
    private String topic;
    private String importance;

    public TopicsToStudy() {
    }

    public TopicsToStudy(int _id, String topic, String importance) {
        this._id = _id;
        this.topic = topic;
        this.importance = importance;
    }

    public int get_id() {
        return _id;
    }

    public String getTopic() {
        return topic;
    }

    public String getImportance() {
        return importance;
    }


}
