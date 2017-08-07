package com.lyc.hyt.basecode.arouter;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lyc.hyt.basecode.BuildConfig;

import java.util.logging.Logger;

/**
 * Created by lyc on 2017/8/7.
 * 路由管理器
 */

public class RouterManager {

    public static final String LOGIN = "/login/loginactivity";

    public static final String TEST = "/test/testactivity";


    public static void initRouter(Application application) {
        ARouter.openLog();     // 打印日志
        Log.d("aroter", "openLog");
        ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.init(application);
    }

    public static void gotoNewPage(String pageUrl) {
        ARouter.getInstance().build(pageUrl).navigation();
    }
}
