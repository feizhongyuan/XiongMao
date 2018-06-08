package com.example.lenovo.xiongmao1.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import static com.example.lenovo.xiongmao1.application.App.mActivitys;

/**
 * 1、ButterKnife的初始化(必须在当前Activity初始化)移除
 * 2、右滑返回
 * 3、双击退出
 * 4、控制标题栏是否显示
 * 5、一键退出所有Activity
 */
public abstract class BaseActivity extends AppCompatActivity {
    /**
     * 整个Activity视图的根视图
     */
    private View decorView;
    /**
     * 手机屏幕的宽度和高度
     */
    private float screenWidth, screenHeight;
    private float downX;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addActivity();
        moveBack();
    }

    /**
     * 右键返回
     */
    private final void moveBack() {
//        获得DecorView对象
        decorView = getWindow().getDecorView();
        // 获得手机屏幕的宽度和高度，单位像素
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenWidth = displayMetrics.widthPixels;
        screenHeight = displayMetrics.heightPixels;
    }

    /**
     * 通过重写该方法，对触摸事件进行处理，实现右滑返回
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            downX = event.getX();
        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
            float moveDistanceX = event.getX() - downX;
            if (moveDistanceX > 0) {
                decorView.setX(moveDistanceX);
            }


        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            float moveDistanceX = event.getX() - downX;
            if (moveDistanceX > screenWidth / 2) {
//                判断滑动距离超过手机屏幕的一半，滑动处屏幕再结束当前Activity
                continueMove(moveDistanceX);
            } else {
//                否则往回滑动(左边)
                rebacktoLeft(moveDistanceX);
            }
        }


        return super.onTouchEvent(event);

    }

    private void continueMove(float moveDistanceX) {
//      从当前位置移动到右侧
        final ValueAnimator valueAnimator = ValueAnimator.ofFloat(moveDistanceX, screenWidth);
        valueAnimator.setDuration(2000);
        valueAnimator.start();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
//                位移
                float x = (float) valueAnimator.getAnimatedValue();
                decorView.setX(x);
            }
        });
        // 动画结束时结束当前Activity
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                finish();
            }
        });
    }

    /**
     * Activity被滑动到中途时，滑回去~
     */
    private void rebacktoLeft(float moveDistanceX) {
        ObjectAnimator.ofFloat(decorView, "X", moveDistanceX, 0).setDuration(1000).start();
    }
    //记录用户首次点击返回键的时间
    private long firstTiem = 0;

//    双击退出
    public boolean onBack(int keyCode, KeyEvent event){
        if (keyCode==KeyEvent.KEYCODE_BACK&&event.getAction()==KeyEvent.ACTION_UP){
            long secondTime = System.currentTimeMillis();
            if (secondTime-firstTiem>2000){
                Toast.makeText(this, "请再按一次退出程序", Toast.LENGTH_SHORT).show();
                firstTiem=secondTime;
            }else {
                System.exit(0);
            }
        }
        return super.onKeyUp(keyCode,event);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        removeActivity();
    }

    private void addActivity() {
        mActivitys.add(this);
    }

    private void removeActivity() {
        mActivitys.remove(this);
    }

//    一键退出所有Activity
    public void removeActivityAll(){
        for (int i = 0; i < mActivitys.size(); i++) {
            Activity activity = mActivitys.get(i);
            if (null!=activity){
                activity.finish();
            }
        }
    }


}
