package com.lyc.hyt.componetdemo.dagger.componet;

import com.lyc.hyt.basecode.ApplicationComponet;
import com.lyc.hyt.basecode.BaseApplication;
import com.lyc.hyt.basecode.dagger.scope.ActivityScope;
import com.lyc.hyt.basecode.dagger.module.ActivityModule;
import com.lyc.hyt.componetdemo.MainActivity;

import dagger.Component;

/**
 * Created by hyt on 2017/8/7.
 */

@ActivityScope
@Component(dependencies = ApplicationComponet.class,modules = ActivityModule.class)
public abstract class ActivityComponet {
    public abstract void inject(MainActivity activity);

    public static ActivityComponet sActivityComponet;

    public static ActivityComponet getInstance(){
        if (sActivityComponet==null){
            sActivityComponet=DaggerActivityComponet.builder().applicationComponet(BaseApplication.getInstance().getApplicationComponet()).build();
        }
        return sActivityComponet;
    }
}
