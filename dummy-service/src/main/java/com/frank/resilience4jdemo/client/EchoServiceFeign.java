package com.frank.resilience4jdemo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "echo-service", url = "${echo-service.url:http://localhost:18081}")
public interface EchoServiceFeign {

  @RequestMapping(method = RequestMethod.GET, value = "/api/echo")
  String echo(@RequestParam String message);
}
