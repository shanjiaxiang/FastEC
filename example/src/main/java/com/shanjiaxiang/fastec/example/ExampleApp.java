package com.shanjiaxiang.fastec.example;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.shanjiaxiang.latte.app.Latte;
import com.shanjiaxiang.latte.ec.icon.FonEcModule;

/**
 * Created by 单加响 on 2017/11/13.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FonEcModule())
                .withApiHost("http://127.0.0.1")
                .configure();
    }
}
