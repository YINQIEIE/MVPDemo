package com.yq.wanandroid;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
    }

    @LayoutRes
    protected abstract int getLayoutID();

    protected void toast(String content) {
        Toast.makeText(this, content, Toast.LENGTH_LONG).show();
    }

}
