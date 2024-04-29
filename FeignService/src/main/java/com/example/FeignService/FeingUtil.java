package com.example.FeignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feignDemo", url = "http://localhost:8080/user")
public interface FeingUtil {

    @GetMapping("/name")
    public String getName();

    @GetMapping("/address")
    public String getAddress();

    @GetMapping("/status")
    public String getStatus();
}
