package com.yq.wanandroid;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity implements MainContract.MainView {

    private EditText etUserName;
    private EditText etPwd;
    private Button btnLogin;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        presenter = new MainPresenter(this);
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
                    presenter.login(name, pwd);
            }
        });
    }

    @Override
    public void loginSucceed() {
        Toast.makeText(this, "登陆成功", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginFailed() {
        Toast.makeText(this, "登陆失败", Toast.LENGTH_LONG).show();
    }
}
