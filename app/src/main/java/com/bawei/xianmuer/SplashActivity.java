package com.bawei.xianmuer;

import android.app.Activity;
import android.os.Bundle;

import com.bawei.xianmuer.base.BaseMVPActivity;
import com.bawei.xianmuer.base.BasePresenter;
import com.bawei.xianmuer.presenter.SplashPresenter;
import com.bawei.xianmuer.view.SplashView;

public class SplashActivity extends BaseMVPActivity<SplashView,SplashPresenter> {


    @Override
    public SplashPresenter initPresenter() {
        return new SplashPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        presenter.getData();



    }
}
