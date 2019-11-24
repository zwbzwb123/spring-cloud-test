package org.spring.cloud.springcloudfeign.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = ScheduleServiceImpl.class)
public interface ScheduleServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hiService(@RequestParam  String name);
}
