package com.example.lenovo.xiongmao1.ui.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.lenovo.xiongmao1.R;
import com.example.lenovo.xiongmao1.ui.BaseActivity;
import com.example.lenovo.xiongmao1.ui.IView;

public class Main1Activity extends BaseActivity implements IView {

    private ImageView mImg_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
//

        guide();

    }

    private void guide() {
        SharedPreferences yindao = getSharedPreferences("yindao", 0);
        int first = yindao.getInt("first", -1);

        if (first != -1) {
            startActivity(new Intent(Main1Activity.this, Main3_HomeActivity.class));
        } else {
            startActivity(new Intent(Main1Activity.this, Main2_LunboActivity.class));
        }
    }

    //        TODO 首页显示并加载数据
    @Override
    public void HomeData() {

    }


    private void initView() {
        mImg_1 = (ImageView) findViewById(R.id.mImg_1);
    }

    public int getLayoutId(){
        return R.layout.activity_main;
    }
}
