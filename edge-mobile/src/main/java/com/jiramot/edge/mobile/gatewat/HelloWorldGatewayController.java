package com.jiramot.edge.mobile.gatewat;

import com.jiramot.edge.mobile.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldGatewayController {

    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping("/{name}")
    public String sayHiWithName(@PathVariable("name") String name) {
        return helloWorldService.hello(name);
    }

}
