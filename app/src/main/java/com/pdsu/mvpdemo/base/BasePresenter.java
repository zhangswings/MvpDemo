package com.pdsu.mvpdemo.base;

/**
 * Created by Administrator on 2016/11/11.
 */

public class BasePresenter<T extends IView, M extends IModel> implements IPresenter<T>
{
    protected static final String TAG = "BasePresenter";
    protected T mView;
    protected M mModel;

    @Override
    public void attachView(final T view)
    {
        mView = view;
    }

    @Override
    public void detachView()
    {
        mView = null;
    }

    public M getModel()
    {
        return mModel;
    }

    public T getView()
    {
        return mView;
    }

    public boolean isViewAttached()
    {
        return mView != null;
    }

    @Override
    public void start()
    {

    }
}
