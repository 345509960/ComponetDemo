package com.lyc.hyt.module2.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lyc.hyt.basecode.BaseApplication;
import com.lyc.hyt.module2.R;

@Route(path = "/test/testactivity")
public class TestActivity extends AppCompatActivity {

    private TextView mTvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mTvTest= (TextView) findViewById(R.id.test);
        mTvTest.setText("test:"+ BaseApplication.getInstance().getString()+BaseApplication.getInstance().getApplicationContext().getPackageName());

    }
}
