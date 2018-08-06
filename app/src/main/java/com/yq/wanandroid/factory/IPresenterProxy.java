package com.yq.wanandroid.factory;

import com.yq.wanandroid.BasePresenter;
import com.yq.wanandroid.IContract;

public interface IPresenterProxy<V extends IContract.IView, M extends IContract.IModel, P extends BasePresenter<V, M>> {

    void setPresentFactory(PresenterFactory<V, M, P> factory);

    PresenterFactory getPresentFactory();

    P getPresenter();
}
