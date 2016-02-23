package cliphead.ljb.wmi.cliphead;

import android.app.Application;

/**
 * Created by Ljb on 2015/11/26.
 */
public class MyApplication extends Application{

    private static MyApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static Application getApplication() {
        return application;
    }
}
