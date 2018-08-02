package com.yq.wanandroid;

public abstract class BasePresenter<V extends IContract.IView, M extends IContract.IModel> {

    V mView;
    M mModel;

    public BasePresenter(V mView) {
        this.mView = mView;
        mModel = createModel();
    }

    protected abstract M createModel();

    public void onDestroy() {
        if (null != mView) mView = null;
        if (null != mModel) mModel = null;
    }
}