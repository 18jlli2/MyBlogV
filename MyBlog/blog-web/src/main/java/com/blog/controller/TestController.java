package com.blog.controller;

import com.blog.Result;
import com.blog.ResultInfo;
import com.blog.api.TestService;
import com.blog.handler.exception.MyRuntimeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public Result test(){
        String test = testService.test();
        throw new MyRuntimeException("123","自定义异常");
//        if(!StringUtils.isEmpty(test)){
//            return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("data",test);
//        }
//        else{
//            return Result.error().codeAndMessage(ResultInfo.NOT_FOUND);
//        }
    }
}
