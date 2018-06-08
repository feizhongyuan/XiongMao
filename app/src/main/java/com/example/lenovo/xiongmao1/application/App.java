package com.example.lenovo.xiongmao1.application;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class App extends Application {
    public static List<Activity> mActivitys=new ArrayList<>();
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
