package com.harlen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by harlenzhang on 16/9/6.
 */
@Controller(value = "test")
public class StudyController {
    @GetMapping(value = "test")
    public @ResponseBody String test(){
        return "hello";
    }
}
