package com.example.lenovo.xiongmao1.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.lenovo.xiongmao1.R;
import com.example.lenovo.xiongmao1.ui.adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main2_LunboActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private List<ImageView> imageViews=new ArrayList<>();
    private int[] imgs=new int[]{R.mipmap.guide_one,R.mipmap.guide_two,R.mipmap.guide_three};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__lunbo);
        initView();

        initData();

    }

    private void initData() {
        for (int i = 0; i < imgs.length; i++) {
            ImageView imageView=new ImageView(this);
            imageView.setImageResource(imgs[i]);
            imageViews.add(imageView);
        }
        ViewPagerAdapter adapter=new ViewPagerAdapter(imageViews);
        mViewPager.setAdapter(adapter);


    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);
    }
}
