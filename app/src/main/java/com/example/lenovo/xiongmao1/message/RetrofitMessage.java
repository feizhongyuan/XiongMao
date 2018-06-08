package com.example.lenovo.xiongmao1.message;

import com.example.lenovo.xiongmao1.Concact;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

//构造者模式
public class RetrofitMessage {
    public static String BASE_URL=Concact.URL;
    private Retrofit builder;

    public Retrofit build(){
        initRetrofit();
        return builder;
    }

    public void initRetrofit(){
        builder = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
}
