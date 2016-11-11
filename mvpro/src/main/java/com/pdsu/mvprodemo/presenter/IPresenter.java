package com.pdsu.mvprodemo.presenter;

import android.os.Bundle;

/**
 * Presenter的根接口<br />
 * Created by Administrator on 2016/11/11.
 */

public interface IPresenter<T>
{
    /**
     * View初始化之前可以在此方法做一些操作
     */
    void create(Bundle savedInstance);

    /**
     * View初始化完毕后调用
     */
    void created(Bundle savedInstance);

    /**
     * 获取当前presenter泛型的数据类型
     * retrun 泛型T的类型
     */
    Class<T> getViewClass();
}
