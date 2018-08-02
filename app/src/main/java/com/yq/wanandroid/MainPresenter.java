package com.yq.wanandroid;

import android.app.Activity;
import android.widget.Toast;

public class MainPresenter extends BasePresenter<MainContract.MainView, MainModel> implements MainContract.Presenter {


    public MainPresenter(MainContract.MainView mView) {
        super(mView);
    }

    @Override
    protected MainModel createModel() {
        return new MainModel(this);
    }

    @Override
    public void login(String name, String pwd) {
        mModel.login(name, pwd);
    }

    @Override
    public void loginSucceed() {
        Toast.makeText(((Activity) mView), "mainModel", Toast.LENGTH_LONG).show();
        mView.loginSucceed();
    }

    @Override
    public void loginFailed() {
        mView.loginFailed();
    }


}
