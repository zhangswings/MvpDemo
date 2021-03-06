package com.pdsu.mvprodemo.view;

import com.pdsu.mvprodemo.presenter.IPresenter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * View层的根接口 <br />
 * Created by Administrator on 2016/11/11.
 */

public interface IView
{
    /**
     * {@link created}后调用，可以调用{@link org.loader.helper.EventHelper.click}
     * 等方法为控件设置点击事件，一般推荐使用{@link org.loader.helper.EventHelper.click(IPresenter presenter, View
     * ...views)}
     * 方法并且让你的Presenter实现相应接口。
     */
    void bindEvent();

    /**
     * 绑定Presenter
     */
    void bindPresenter(IPresenter presenter);

    /**
     * 根据 {@link getLayoutId}方法生成生成setContentView需要的根布局
     */
    View create(LayoutInflater inflater, ViewGroup container);

    /**
     * 当Activity的onCreate完毕后调用
     */
    void created();

    /**
     * @param id
     * @param <V>
     * @return
     */
    <V extends View> V findViewById(int id);

    /**
     * 返回当前视图需要的layout的id
     */
    int getLayoutId();
}
