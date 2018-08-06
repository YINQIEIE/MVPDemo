package com.yq.wanandroid.factory;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.yq.wanandroid.BaseActivity;
import com.yq.wanandroid.BasePresenter;
import com.yq.wanandroid.IContract;

public abstract class BaseMvpFactoryActivity<V extends IContract.IView, P extends BasePresenter<V>> extends BaseActivity implements IPresenterProxy<V, P> {

    private BasePresenter mPresenter;
    private PresenterProxy<V, P> mPresentProxy = new PresenterProxy<>(PresenterFactoryImpl.<V, P>createFactory(getClass()));

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = mPresentProxy.getPresenter();
    }

    @Override
    public void setPresentFactory(PresenterFactory<V, P> factory) {
        mPresentProxy.setPresentFactory(factory);
    }

    @Override
    public PresenterFactory getPresentFactory() {
        return mPresentProxy.getPresentFactory();
    }

    @Override
    public P getPresenter() {
        return mPresentProxy.getPresenter();
    }

}
