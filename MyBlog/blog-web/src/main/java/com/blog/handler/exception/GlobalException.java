package com.blog.handler.exception;

import com.blog.Result;
import com.blog.ResultInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result exception(){
        return  Result.error().codeAndMessage(ResultInfo.GLOBAL_ERROR);
    }

    @ExceptionHandler(MyRuntimeException.class)
    @ResponseBody
    public Result myRuntimeException(MyRuntimeException e){
        e.printStackTrace();
        return Result.error().codeAndMessage(e.getCode(),e.getMessage());
    }
}

