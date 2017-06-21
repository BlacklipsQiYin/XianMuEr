package com.bawei.xianmuer.presenter;

import com.bawei.xianmuer.base.BasePresenter;
import com.bawei.xianmuer.model.SplashModelImpl;
import com.bawei.xianmuer.view.SplashView;

public class SplashPresenter extends BasePresenter<SplashView> {


    private SplashModelImpl splashModel ;


    public SplashPresenter(){

        splashModel = new SplashModelImpl();



    }



    public void getData(){

        System.out.println("view = " + view);

        splashModel.getData();
    }


}