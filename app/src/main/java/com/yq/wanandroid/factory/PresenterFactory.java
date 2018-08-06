package com.yq.wanandroid.factory;

import com.yq.wanandroid.BasePresenter;
import com.yq.wanandroid.IContract;

public interface PresenterFactory<V extends IContract.IView, P extends BasePresenter<V>> {

    P createPresenter();

}
