package org.spring.cloud.springcloudfeign.controller;

import org.springframework.stereotype.Component;

@Component
class ScheduleServiceImpl implements  ScheduleServiceHi{

    @Override
    public String hiService(String name) {
        return "error"+name;
    }
}
