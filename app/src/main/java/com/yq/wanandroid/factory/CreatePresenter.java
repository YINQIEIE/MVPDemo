package com.yq.wanandroid.factory;

import android.support.annotation.NonNull;

import com.yq.wanandroid.BasePresenter;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface CreatePresenter {
    @NonNull
    Class<? extends BasePresenter> value();
}
