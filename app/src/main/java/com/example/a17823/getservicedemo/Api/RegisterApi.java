package com.example.a17823.getservicedemo.Api;

import com.example.a17823.getservicedemo.Service.RegisterService;

import retrofit2.Retrofit;

/**
 * Created by 17823 on 2018/5/9.
 */

public class RegisterApi extends WebApi{

    String url="http://1oz9819419.iask.in:44216/UserService/";
    //String url="http://192.168.16.111:8080/UserService/";
    Retrofit retrofit=getApi(url);

    @Override
    public <T> T getService() {
        return (T) retrofit.create(RegisterService.class);
    }
}
