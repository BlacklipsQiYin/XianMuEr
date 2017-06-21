package com.bawei.xianmuer.model;

import com.bawei.xianmuer.network.BaseObserver;
import com.bawei.xianmuer.network.RetrofitFactory;

public class SplashModelImpl {


    public void getData(){

        RetrofitFactory.get("http://qhb.2dyt.com/Bwei/login?username=11111111111&password=1&postkey=1503d").subscribe(new BaseObserver() {
            @Override
            public void onSuccess(String result) {


                System.out.println("result = " + result);

            }

            @Override
            public void onFailed(int code) {


            }
        });


    }


}