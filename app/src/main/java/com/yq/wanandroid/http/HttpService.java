package com.yq.wanandroid.http;

import com.yq.wanandroid.http.Response.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by yinqi on 2018/08/02.
 */

public interface HttpService {

    /**
     * 登录
     *
     * @param name 用户名
     * @param pwd  密码
     * @return call
     */
    @POST("user/login")
    @FormUrlEncoded
    Call<BaseResponse<User>> login(@Field("username") String name, @Field("password") String pwd);

}
