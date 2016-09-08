package com.harlen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.Callable;

/**
 * Created by harlenzhang on 16/9/6.
 */
@Controller
@RequestMapping(value = "study")
public abstract class StudyController {

    public abstract DeferredResult<String> getDeferredResult();

    DeferredResult<String> deferredResult;

    public void setDeferredResult(DeferredResult<String> deferredResult) {
        this.deferredResult = deferredResult;
    }

    @GetMapping(value = "test")
    public @ResponseBody String test(){
        return "hello";
    }

    @GetMapping(value = "asyn")
    public Callable<String>processOtherThing(){
        return new Callable<String>() {
            public String call() throws Exception {
                return "this is in asyn method";
            }
        };
    }

    @GetMapping("defferred")
    public @ResponseBody  DeferredResult<String>testDeffer(){
        return deferredResult;

    }

    @GetMapping("setDeferred")
    public void setDeferredValue(){
        deferredResult.setResult("harlen");
    }

}
