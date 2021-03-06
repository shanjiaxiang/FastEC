package com.shanjiaxiang.latte.app;
import android.content.Context;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * Created by 单加响 on 2017/11/13.
 */

public final class Latte {
    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();
    }
    private static HashMap<String,Object> getConfigurations(){
        return Configurator.getInstance().getLatteConfigs();
    }
    public static Context getApplication(){
        return (Context)getConfigurations().get(ConfigType.APPLICATION_CONTEXT.name());
    }
}


















