package com.bawei.xianmuer.base;

/**
 * Created by Administrator on 2017/6/19/0019.
 */

public abstract class BasePresenter<T> {


    public T view;

    public void  attach(T view){

        this.view = view;

    }

    public void  detach(){

        this.view = null;

    }

}
