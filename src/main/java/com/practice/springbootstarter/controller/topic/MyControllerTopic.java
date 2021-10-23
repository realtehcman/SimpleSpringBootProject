package com.practice.springbootstarter.controller.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*MAPPING HAPPENS HERE.
* Also, I inject the instance into the field*/

@RestController
public class MyControllerTopic {

    @Autowired
    private MyServerForTopic myServerForTopic;

    @RequestMapping("/topics")
    public MyServerForTopic gettingTopics() {
        return myServerForTopic;
    }

}
