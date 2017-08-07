package com.lyc.hyt.basecode;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by lyc on 2017/8/7.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface  ApplicationComponet {
    Context getContext();
}
