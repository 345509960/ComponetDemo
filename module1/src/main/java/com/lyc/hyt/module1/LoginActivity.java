package com.lyc.hyt.module1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jakewharton.rxbinding.view.RxView;
import com.lyc.hyt.basecode.BaseApplication;
import com.lyc.hyt.basecode.arouter.RouterManager;
import com.lyc.hyt.basecode.dagger.qualifier.ActivityQualifier;
import com.lyc.hyt.module1.dagger.componet.ActivityComponetModule1;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

@Route(path = "/login/loginactivity")
public class LoginActivity extends AppCompatActivity {

    Button button2;

    TextView mTvTest;

    @ActivityQualifier("loginStr")
    @Inject
    String mLogStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button2= (Button) findViewById(R.id.button3);
        mTvTest= (TextView) findViewById(R.id.test);


        ActivityComponetModule1.getInstane().inject(this);

        mTvTest.setText("login:\n"
                + BaseApplication.getInstance().getString()+BaseApplication.getInstance().getApplicationContext().getPackageName()+"\n"
                +mLogStr+"\n");

        RxView.clicks(button2).throttleFirst(1, TimeUnit.SECONDS).subscribe(aVoid->{
            RouterManager.gotoNewPage(RouterManager.TEST);
        });
    }
}
