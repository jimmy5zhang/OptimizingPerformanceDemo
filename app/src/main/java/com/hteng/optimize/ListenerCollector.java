package com.hteng.optimize;

import android.view.View;

import java.util.WeakHashMap;

/**
 * Created by jimmyzhang on 2017/05/13.
 */

public class ListenerCollector {
    /**
     * WeakHashMap，此种Map的特点是，当除了自身有对key的引用外，此key没有其他引用那么此map会自动丢弃此值
     * 例如：int a = 1;
     * Map weakmap = new WeakHashMap();
     * weakmap.put(a, "aaa");
     * a = null
     * //此时weakmap里面的a会被丢弃。
     */
    static private WeakHashMap<View, MyView.MyListener> sListener = new WeakHashMap<>();

    public void setsListener(View view, MyView.MyListener listener) {
        sListener.put(view, listener);
    }

    public static void clearListeners() {
        //移除所有监听。
        sListener.clear();
    }





}
