package com.yq.wanandroid.main;


import com.yq.mvpbase.IContract;

public interface MainContract extends IContract {

    interface Presenter extends IPresenter {

        void login(String name, String pwd);

    }

    interface MainView extends IView {

        void loginSucceed();

        void loginFailed();
    }

}
