package com.example.lenovo.xiongmao1.message;

import com.example.lenovo.xiongmao1.bean.Interaction;

import retrofit2.http.GET;
import rx.Observable;

public interface ApiService {
    @GET("PAGE1450172284887217/index.json")
    Observable<Interaction> getHomeData();

}
