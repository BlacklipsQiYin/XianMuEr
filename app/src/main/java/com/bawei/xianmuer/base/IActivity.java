package com.bawei.xianmuer.base;

import android.app.Activity;
import android.os.Bundle;

import com.bawei.xianmuer.R;

public class IActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i);
    }
}
