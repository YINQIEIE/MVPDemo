package com.yq.wanandroid.main;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yq.wanandroid.BaseMVPActivity;
import com.yq.wanandroid.R;

public class MainActivity extends BaseMVPActivity<MainPresenter> implements MainContract.MainView {

    private EditText etUserName;
    private EditText etPwd;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assignViews();
        mPresenter = new MainPresenter(this);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    private void assignViews() {
        etUserName = (EditText) findViewById(R.id.et_userName);
        etPwd = (EditText) findViewById(R.id.et_pwd);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etUserName.getText().toString().trim();
                String pwd = etPwd.getText().toString().trim();
                if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(pwd))
                    mPresenter.login(name, pwd);
            }
        });
    }

    @Override
    public void loginSucceed() {
        toast("登陆成功");
    }

    @Override
    public void loginFailed() {
        toast("登陆失败");
    }
}
