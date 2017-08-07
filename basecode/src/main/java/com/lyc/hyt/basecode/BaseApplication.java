package com.lyc.hyt.basecode;

import android.app.Application;
import android.content.Context;

import com.lyc.hyt.basecode.arouter.RouterManager;

/**
 * Created by lyc on 2017/8/7.
 */

public abstract class BaseApplication extends Application {

    public static  BaseApplication sBaseApplication;



    public ApplicationComponet mApplicationComponet;

    @Override
    public void onCreate() {
        super.onCreate();
        sBaseApplication=this;
        mApplicationComponet=DaggerApplicationComponet.builder().applicationModule(new ApplicationModule(this)).build();

        RouterManager.initRouter(this);

    }

    public static BaseApplication getInstance(){
        return sBaseApplication;
    }


    public String getString(){
        return "asdhas ";
    }

    public ApplicationComponet getApplicationComponet() {
        return mApplicationComponet;
    }

}
