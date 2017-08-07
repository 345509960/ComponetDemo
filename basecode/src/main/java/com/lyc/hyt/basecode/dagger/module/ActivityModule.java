package com.lyc.hyt.basecode.dagger.module;


import com.lyc.hyt.basecode.dagger.qualifier.ActivityQualifier;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lyc on 2017/8/7.
 */

@Module
public class ActivityModule {


    @ActivityQualifier("testString")
    @Provides
    public String getTestString(){
        return "我仅仅测试一下";
    }


    @ActivityQualifier("loginStr")
    @Provides
    public String getLoginString(){
        return "dagger2:loginStr";
    }
}
