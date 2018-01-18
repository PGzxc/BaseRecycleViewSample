package com.example.baserecycleviewsample.bean;


import java.util.List;

/**
 * Created by admin on 2018/1/18.
 */

public class Info extends BaseResp {

    public Info(int returnCD, String message) {
        super(returnCD, message);
    }

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }
}
