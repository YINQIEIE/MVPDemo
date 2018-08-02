package com.yq.wanandroid;

import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

    P presenter;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != presenter)
            presenter.onDestroy();
    }
}
