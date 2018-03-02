package com.lfish.cputils;

import android.app.Application;
import android.graphics.drawable.Drawable;

/**
 * Created by shenmegui on 2018/3/2.
 */
public class CpManager {
    private static CpManager cpManager;
    public static CpManager getInstance(){
        if(cpManager == null){
            cpManager = new CpManager();
        }
        return cpManager;
    }

    private CpManager() {

    }

    public void init(Application application){

    }

    public void init(Application application, Drawable drawable){

    }
}
