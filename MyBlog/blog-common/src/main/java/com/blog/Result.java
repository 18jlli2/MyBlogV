package com.blog;

import java.util.HashMap;
import java.util.Map;

public class Result {
    /**
     * 返回 状态成功 或者失败
     */
    private boolean status;
    /**
     * 返回状态码
     */
    private String code ;
    /**
     * 返回信息
     */
    private String message;
    //返回数据
    Map<String,Object> data =new HashMap<>();

    public Result(){
    }
    //成功
    public static Result success(){
        Result result = new Result();
        result.status = true;
        return result;
    }
    //失败
    public static Result error(){
        Result result = new Result();
        result.status = false;
        return result;
    }
    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result code(String code){
        this.setCode(code);
        return this;
    }
    public Result codeAndMessage(String code,String message){
        this.setCode(message);
        this.setMessage(message);
        return this;
    }

    public Result codeAndMessage(ResultInfo resultInfo){
        this.setCode(resultInfo.getCode());
        this.setMessage(resultInfo.getMessage());
        return this;
    }
    public Result data(String key,Object value){
        this.data.put(key,value);
        return this;
    }



    /**
     * 以下为Getter和Setter方法
     * @return
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}