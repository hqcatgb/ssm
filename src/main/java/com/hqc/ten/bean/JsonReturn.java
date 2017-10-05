package com.hqc.ten.bean;

public class JsonReturn<T> {
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }

    private int status;
    private T msg;
    public void  JsonReturn(){
        this.status=200;
    }

}
