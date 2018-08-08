package com.yq.wanandroid.main;

import com.yq.mvpbase.IContract;
import com.yq.wanandroid.http.BaseResponse;
import com.yq.wanandroid.http.Response.User;
import com.yq.wanandroid.http.RetrofitManager;

import retrofit2.Call;
import retrofit2.Callback;

public class MainModel implements IContract.IModel {

    public static final String TAG = MainModel.class.getSimpleName();

    public void login(String name, String pwd, Callback<BaseResponse<User>> callback) {
        Call<BaseResponse<User>> loginCall = RetrofitManager.getHttpService().login(name, pwd);
        loginCall.enqueue(callback);
    }

}
