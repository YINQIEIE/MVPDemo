package com.yq.wanandroid.factory;

import com.yq.wanandroid.BasePresenter;
import com.yq.wanandroid.IContract;

public class PresenterFactoryImpl<V extends IContract.IView, M extends IContract.IModel, P extends BasePresenter<V, M>> implements PresenterFactory<V, M, P> {

    private Class<P> mPresenterClass;

    private PresenterFactoryImpl(Class<P> mPresenterClass) {
        this.mPresenterClass = mPresenterClass;
    }

    public static <V extends IContract.IView, M extends IContract.IModel, P extends BasePresenter<V, M>> PresenterFactoryImpl createFactory(Class viewClass) {
        CreatePresenter annotation = (CreatePresenter) viewClass.getAnnotation(CreatePresenter.class);
        Class<P> pClass = null;
        if (null != annotation && annotation instanceof CreatePresenter) {
            pClass = (Class<P>) annotation.value();
        }
        return pClass == null ? null : new PresenterFactoryImpl(pClass);
    }

    @Override
    public P createPresenter() {
        try {
            return mPresenterClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Create Presenter failed ! Check if the annotation is used correctly ! ");
        }
    }
}
