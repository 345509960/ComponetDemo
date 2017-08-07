package com.lyc.hyt.basecode;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hyt on 2017/8/7.
 */

@Module
public class ApplicationModule {
    private Context mContext;
    public ApplicationModule(Context context){
     this.mContext=context;
    }

    @Provides
    public Context provideContext(){
        return mContext;
    }
}
