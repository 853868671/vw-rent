package com.vw.rent.utils.result;


import com.vw.rent.utils.base.SysConstant;
import com.vw.rent.utils.exceptions.enums.BizExceptionEnum;

public class Result {
    public final static int OK_CODE = 0;
    public final static int EMPTY_CODE = 1;
    public final static int FAIL_CODE = -1;
    public final static int TIMEOUT_CODE = -2;

    private int status;
    private String msg;
    private Object data;

    public static Result OK(){
        Result success = new Result();
        success.setStatus(OK_CODE);
        success.setMsg("success");
        return success;
    }

    public static Result OK(Object obj){
        Result success = new Result();
        success.setStatus(OK_CODE);
        if(obj instanceof String){
            success.setMsg((String) obj);
        }else{
            success.setMsg("success");
            success.setData(obj);
        }
        return success;
    }

    public static Result OK(int code,String msg){
        Result success = new Result();
        success.setStatus(code);
        success.setMsg(msg);
        return success;
    }

    public static Result EMPTY() {
        Result success = new Result();
        success.setStatus(EMPTY_CODE);
        success.setMsg("empty");
        return success;
    }

    public static Result EMPTY(String message) {
        Result success = new Result();
        success.setStatus(EMPTY_CODE);
        success.setMsg(message);
        return success;
    }

    public static Result FAIL() {
        Result success = new Result();
        success.setStatus(FAIL_CODE);
        success.setMsg("fail");
        return success;
    }

    public static Result FAIL(String errorMsg){
        Result success = new Result();
        success.setStatus(FAIL_CODE);
        success.setMsg(errorMsg);
        return success;
    }

    public static Result FAIL(BizExceptionEnum exceptionEnum){
        Result success = new Result();
        success.setStatus(exceptionEnum.getCode());
        success.setMsg(exceptionEnum.getMsg());
        return success;
    }

    public static Result FAIL(int code,String errorMsg){
        Result success = new Result();
        success.setStatus(code);
        success.setMsg(errorMsg);
        return success;
    }

    public static Result TIMEOUT() {
        Result success = new Result();
        success.setStatus(FAIL_CODE);
        success.setMsg("fail");
        return success;
    }

    public static Result TIMEOUT(int code, String errorMsg) {
        Result success = new Result();
        success.setStatus(code);
        success.setMsg(errorMsg);
        return success;
    }

    public static Result TIMEOUT(String errorMsg) {
        Result success = new Result();
        success.setStatus(FAIL_CODE);
        success.setMsg(errorMsg);
        return success;
    }

    public static Result FEIGN_FALLBACK() {
        Result success = new Result();
        success.setStatus(SysConstant.FEIGN_CLIENT_FALLBACK_CODE);
        success.setMsg(SysConstant.FEIGN_CLIENT_FALLBACK_MSG);
        return success;
    }

    public int getStatus() {
        return status;
    }

    public Result setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }
}
