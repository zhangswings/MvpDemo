package com.pdsu.mvprotest;

import android.os.Handler;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Administrator on 2016/11/11.
 */

public class MainBiz
{
    public void data(final Callback<ArrayList<String>> callback)
    {
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                ArrayList<String> lists = new ArrayList<String>()
                {
                    {
                        for (int i = 0; i < 5; i++) add("hi " + new Random().nextInt(100));
                    }
                };
                callback.callback(lists);
            }
        }, 1000);
    }

    public void userInfo(final Callback<String> callback)
    {
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                callback.callback("亓斌");
            }
        }, 1000);
    }

    public interface Callback<T>
    {
        public void callback(T data);
    }
}
