package com.practice.springbootstarter.controller.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*MAPPING HAPPENS HERE.
* Also, I inject the instance into the field*/

@RestController
public class MyControllerTopic {

    @Autowired
    private TopicService myServerForTopic;

    @RequestMapping("/topics")
    public TopicService gettingTopics() {
        return myServerForTopic;
    }

    @RequestMapping("/topics/{topicName}")
    public TopicToStudy gettingTopics(@PathVariable String topicName) {
        return myServerForTopic.getTopic(topicName);
    }
}
