package com.yq.wanandroid;

public class MainContract implements IContract {

    interface Presenter extends IContract.IPresenter {

        void login(String name, String pwd);

        void loginSucceed();

        void loginFailed();
    }

    public interface MainView extends IView {

        void loginSucceed();

        void loginFailed();
    }

}
