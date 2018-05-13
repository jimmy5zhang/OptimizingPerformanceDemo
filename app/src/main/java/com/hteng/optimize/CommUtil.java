package com.hteng.optimize;

import android.content.Context;

/**
 * Created by jimmyzhang on 2017/05/13.
 */

public class CommUtil {
    private static CommUtil instance;
    private Context context;
    private CommUtil(Context context){
        this.context = context;
    }

    public static CommUtil getInstance(Context mcontext){
        if(instance == null){
            instance = new CommUtil(mcontext);
        }
//        else{
//            instance.setContext(mcontext);
//        }
        return instance;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
