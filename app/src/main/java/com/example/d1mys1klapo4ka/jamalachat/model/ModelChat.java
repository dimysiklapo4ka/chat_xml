package com.example.d1mys1klapo4ka.jamalachat.model;

/**
 * Created by d1mys1klapo4ka on 25.05.2017.
 */

public class ModelChat {

    private int id;

    private String sms;
    private String userLogin;

    public ModelChat(String sms, String userLogin){

        this.sms = sms;
        this.userLogin = userLogin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }
}
