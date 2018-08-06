package com.yq.wanandroid.factory;

import com.yq.wanandroid.BasePresenter;
import com.yq.wanandroid.IContract;

public class PresenterProxy<V extends IContract.IView, M extends IContract.IModel, P extends BasePresenter<V, M>> implements IPresenterProxy<V, M, P> {

    private PresenterFactory<V, M, P> presenterFactory;
    private P mPresenter;

    public PresenterProxy(PresenterFactory<V, M, P> presenterFactory) {
        this.presenterFactory = presenterFactory;
    }

    @Override
    public void setPresentFactory(PresenterFactory<V, M, P> factory) {
        if (mPresenter != null) {
            throw new IllegalStateException("这个方法只能在 getPresenter() 之前调用，如果Presenter已经创建则不能再修改");
        }
        this.presenterFactory = factory;
    }

    @Override
    public PresenterFactory getPresentFactory() {
        return presenterFactory;
    }

    @Override
    public P getPresenter() {
        if (presenterFactory != null) {
            if (null == mPresenter)
                mPresenter = presenterFactory.createPresenter();
        }
        return mPresenter;
    }
}
