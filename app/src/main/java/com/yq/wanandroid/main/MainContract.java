package com.yq.wanandroid.main;

import com.yq.wanandroid.IContract;

public interface MainContract extends IContract {

    interface Presenter extends IPresenter {

        void login(String name, String pwd);

        void loginSucceed();

        void loginFailed();
    }

    interface MainView extends IView {

        void loginSucceed();

        void loginFailed();
    }

}