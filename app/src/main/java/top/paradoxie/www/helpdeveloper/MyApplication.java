package top.paradoxie.www.helpdeveloper;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by xiehehe on 2017/11/27.
 */

public class MyApplication extends Application {
    public static Context context;
    public static boolean isDebug = true;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

        if (isDebug) {
            ARouter.openLog();//开启日志
            ARouter.openDebug();//开启debug模式
        }

        ARouter.init(this);


    }
    public static Context getContext(){
        return context;
    }

}
