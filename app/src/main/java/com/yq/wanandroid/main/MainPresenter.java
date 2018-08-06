package com.yq.wanandroid.main;

import android.util.Log;

import com.yq.wanandroid.BasePresenter;
import com.yq.wanandroid.http.BaseResponse;
import com.yq.wanandroid.http.Response.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter extends BasePresenter<MainContract.MainView, MainModel> implements MainContract.Presenter {

    private static final String TAG = MainPresenter.class.getSimpleName();

    public MainPresenter(MainContract.MainView mView) {
        super(mView);
    }

    @Override
    protected MainModel createModel() {
        return new MainModel();
    }

    @Override
    public void login(String name, String pwd) {
        mModel.login(name, pwd, new Callback<BaseResponse<User>>() {
            @Override
            public void onResponse(Call<BaseResponse<User>> call, Response<BaseResponse<User>> response) {
                if (response.isSuccessful()) {
                    if (null != response.body().getData()) {
                        Log.i(TAG, "onResponse: " + response.body().getData().toString());
                        mView.loginSucceed();
                    } else
                        mView.loginFailed();
                }
            }

            @Override
            public void onFailure(Call<BaseResponse<User>> call, Throwable t) {
                mView.loginFailed();
            }
        });
    }

}
