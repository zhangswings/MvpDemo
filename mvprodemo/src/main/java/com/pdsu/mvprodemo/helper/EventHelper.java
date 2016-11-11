package com.pdsu.mvprodemo.helper;

import com.pdsu.mvprodemo.presenter.IPresenter;

import android.view.View;
import android.widget.AdapterView;

/**
 * 事件帮助类，提供click,longClick itemClick等常用事件的封装 <br />
 * Created by Administrator on 2016/11/11.
 */

public class EventHelper
{
    public static void click(IPresenter li, View... views)
    {
        if (!(li instanceof View.OnClickListener)) return;
        click((View.OnClickListener) li, views);
    }

    public static void click(View.OnClickListener li, View... views)
    {
        if (views == null || views.length == 0) return;
        for (View v : views) v.setOnClickListener(li);
    }

    public static void itemClick(IPresenter li, AdapterView... views)
    {
        if (!(li instanceof AdapterView.OnItemClickListener)) return;
        itemClick((AdapterView.OnItemClickListener) li, views);
    }

    public static void itemClick(AdapterView.OnItemClickListener li, AdapterView... views)
    {
        if (views == null || views.length == 0) return;
        for (AdapterView v : views) v.setOnItemClickListener(li);
    }

    public static void itemLongClick(IPresenter li, AdapterView... views)
    {
        if (!(li instanceof AdapterView.OnItemLongClickListener)) return;
        itemLongClick((AdapterView.OnItemLongClickListener) li, views);
    }

    public static void itemLongClick(AdapterView.OnItemLongClickListener li, AdapterView... views)
    {
        if (views == null || views.length == 0) return;
        for (AdapterView v : views) v.setOnItemLongClickListener(li);
    }

    public static void itemSelected(IPresenter li, AdapterView... views)
    {
        if (!(li instanceof AdapterView.OnItemSelectedListener)) return;
        itemSelected((AdapterView.OnItemSelectedListener) li, views);
    }

    public static void itemSelected(AdapterView.OnItemSelectedListener li, AdapterView... views)
    {
        if (views == null || views.length == 0) return;
        for (AdapterView v : views) v.setOnItemSelectedListener(li);
    }

    public static void longClick(IPresenter li, View... views)
    {
        if (!(li instanceof View.OnLongClickListener)) return;
        longClick((View.OnLongClickListener) li, views);
    }

    public static void longClick(View.OnLongClickListener li, View... views)
    {
        if (views == null || views.length == 0) return;
        for (View v : views) v.setOnLongClickListener(li);
    }
}
