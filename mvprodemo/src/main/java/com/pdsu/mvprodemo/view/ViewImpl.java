package com.pdsu.mvprodemo.view;

import com.pdsu.mvprodemo.presenter.IPresenter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/11/11.
 */

public class ViewImpl implements IView
{
    /**
     * create方法生成的view
     */
    protected View mRootView;
    /**
     * 绑定的presenter
     */
    protected IPresenter mPresenter;

    @Override
    public void bindEvent()
    {

    }

    @Override
    public void bindPresenter(final IPresenter presenter)
    {
        mPresenter = presenter;
    }

    @Override
    public View create(final LayoutInflater inflater, final ViewGroup container)
    {
        mRootView = inflater.inflate(getLayoutId(), container, false);
        created();
        return mRootView;
    }

    @Override
    public void created()
    {

    }

    @Override
    public <V extends View> V findViewById(final int id)
    {
        return (V) mRootView.findViewById(id);
    }

    @Override
    public int getLayoutId()
    {
        return 0;
    }
}
