package com.abc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lixiaopeng
 * @date: 2019/11/29 10:21
 * @desc:
 */
@RestController
public class SomeController {

    @RequestMapping("/some")
    public String someHandle() {
        return "This is first jenkins deploy project";
    }

    @RequestMapping("name")
    public String nameHandle() {
        return "zhang san";
    }
}
