package com.backend.bugsystem.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Kailin
 * @Date 2020/12/25 11:08
 * @Description
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class ExampleController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello everyone!";
    }
}
