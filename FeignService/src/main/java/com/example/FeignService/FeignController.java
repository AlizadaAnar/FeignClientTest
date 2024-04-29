package com.example.FeignService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feignService")
public class FeignController {

    @Autowired
    private FeingUtil service;

    public FeignController(FeingUtil service) {
        this.service = service;
    }

    @GetMapping("/f-name")
    public String getName() {
        return service.getName();
    }

    @GetMapping("/f-address")
    public String getAddress() {
        return service.getAddress();
    }

    @GetMapping("/f-status")
    public String getStatus() {
        return service.getStatus();
    }
}
