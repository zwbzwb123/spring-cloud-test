package org.spring.cloud.springcloudfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    ScheduleServiceHi scheduleServiceHi;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return scheduleServiceHi.hiService(name);
    }
}
