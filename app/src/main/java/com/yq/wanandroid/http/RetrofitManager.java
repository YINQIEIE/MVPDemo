package com.yq.wanandroid.http;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Administrator on 2017/10/13.
 */

public class RetrofitManager {

    private static Retrofit retrofit = null;

    private static final String BASE_URL = "http://www.wanandroid.com/";

    /**
     * @return Retrofit 实例
     */
    public static Retrofit getRetrofit() {
        if (null == retrofit)
            synchronized (RetrofitManager.class) {
                if (null == retrofit)
                    retrofit = new Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
            }
        return retrofit;
    }

    public static HttpService getHttpService() {
        return getRetrofit().create(HttpService.class);
    }

}
