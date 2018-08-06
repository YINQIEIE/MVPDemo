package com.yq.wanandroid.factory;

import com.yq.wanandroid.BasePresenter;
import com.yq.wanandroid.IContract;

public interface IPresenterProxy<V extends IContract.IView, P extends BasePresenter<V>> {

    void setPresentFactory(PresenterFactory<V, P> factory);

    PresenterFactory getPresentFactory();

    P getPresenter();
}
