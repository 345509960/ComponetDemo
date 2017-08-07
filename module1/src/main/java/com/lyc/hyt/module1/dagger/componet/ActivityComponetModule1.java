package com.lyc.hyt.module1.dagger.componet;

import com.lyc.hyt.basecode.ApplicationComponet;
import com.lyc.hyt.basecode.BaseApplication;
import com.lyc.hyt.basecode.dagger.scope.ActivityScope;
import com.lyc.hyt.basecode.dagger.module.ActivityModule;
import com.lyc.hyt.module1.LoginActivity;

import dagger.Component;

/**
 * Created by lyc on 2017/8/7.
 */

@ActivityScope
@Component(dependencies = ApplicationComponet.class,modules = ActivityModule.class)
public abstract class ActivityComponetModule1 {
    public abstract void inject(LoginActivity loginActivity);

    private static ActivityComponetModule1 sActivityComponetModule1;

    public static ActivityComponetModule1 getInstane(){
        if (sActivityComponetModule1==null){
            sActivityComponetModule1=DaggerActivityComponetModule1.builder()
                    .applicationComponet(BaseApplication.getInstance().getApplicationComponet())
                    .build();
        }
        return sActivityComponetModule1;
    }
}
