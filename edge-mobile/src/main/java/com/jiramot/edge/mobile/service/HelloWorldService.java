package com.jiramot.edge.mobile.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("hello-world-service")
public interface HelloWorldService {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name);

}
