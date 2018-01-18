package com.example.baserecycleviewsample.bean;


/**
 * Created by admin on 2018/1/18.
 */

public class BaseResp {
    private int returnCD;
    private String message;

    public BaseResp(int returnCD, String message) {
        this.returnCD = returnCD;
        this.message = message;
    }

    public int getReturnCD() {
        return returnCD;
    }

    public void setReturnCD(int returnCD) {
        this.returnCD = returnCD;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
