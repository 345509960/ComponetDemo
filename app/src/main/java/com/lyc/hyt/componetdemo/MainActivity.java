package com.lyc.hyt.componetdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.jakewharton.rxbinding.view.RxView;
import com.lyc.hyt.basecode.arouter.RouterManager;
import com.lyc.hyt.basecode.bean.Test;
import com.lyc.hyt.basecode.dagger.qualifier.ActivityQualifier;
import com.lyc.hyt.componetdemo.dagger.componet.ActivityComponet;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.button1)
    Button button1;
    @InjectView(R.id.button2)
    Button button2;
    @InjectView(R.id.tv_test)
    TextView mTvTest;

    @ActivityQualifier("testString")
    @Inject
    String testStr;

    @Inject
    Test mTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        ActivityComponet.getInstance().inject(this);
        mTest.setName("妮是不是是啥");
        mTvTest.setText(mTest.getName()+"");
        initEvent();

    }

    private void initEvent() {
        RxView.clicks(button1).throttleFirst(1, TimeUnit.SECONDS)
                .subscribe(aVoid -> {
                    RouterManager.gotoNewPage(RouterManager.LOGIN);
                });


        RxView.clicks(button2).throttleFirst(1, TimeUnit.SECONDS)
                .subscribe(aVoid -> {
                    RouterManager.gotoNewPage(RouterManager.TEST);
                });

    }
}
