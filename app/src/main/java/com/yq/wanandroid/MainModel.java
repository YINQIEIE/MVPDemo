package com.yq.wanandroid;

import android.util.Log;

import com.yq.wanandroid.http.BaseResponse;
import com.yq.wanandroid.http.Response.User;
import com.yq.wanandroid.http.RetrofitManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainModel implements IContract.IModel {

    public static final String TAG = MainModel.class.getSimpleName();
    private MainPresenter presenter;

    public MainModel(MainPresenter presenter) {
        this.presenter = presenter;
    }

    public void login(String name, String pwd) {
        Call<BaseResponse<User>> loginCall = RetrofitManager.getHttpService().login(name, pwd);
        loginCall.enqueue(new Callback<BaseResponse<User>>() {
            @Override
            public void onResponse(Call<BaseResponse<User>> call, Response<BaseResponse<User>> response) {
                if (response.isSuccessful()) {
                    if (null != response.body().getData()) {
                        Log.i(TAG, "onResponse: " + response.body().getData().toString());
                        presenter.loginSucceed();
                    } else
                        presenter.loginFailed();
                }
            }

            @Override
            public void onFailure(Call<BaseResponse<User>> call, Throwable t) {
                Log.i(TAG, "onFailure: ");
                presenter.loginFailed();
            }
        });
    }

}
