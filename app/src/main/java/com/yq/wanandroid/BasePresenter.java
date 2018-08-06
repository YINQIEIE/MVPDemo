package com.yq.wanandroid;

public abstract class BasePresenter<V extends IContract.IView> {

    protected V mView;

    public BasePresenter(V mView) {
        this.mView = mView;
    }

    public void onDestroy() {
        if (null != mView) mView = null;
    }
}