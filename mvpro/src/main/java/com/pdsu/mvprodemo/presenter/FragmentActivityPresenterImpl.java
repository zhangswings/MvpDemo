package com.pdsu.mvprodemo.presenter;

import com.pdsu.mvprodemo.helper.GenericHelper;
import com.pdsu.mvprodemo.view.IView;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * 将Activity作为Presenter的基类 <br />
 * Created by Administrator on 2016/11/11.
 */

public class FragmentActivityPresenterImpl<T extends IView> extends FragmentActivity implements IPresenter<T>
{
    protected T mView;

    @Override
    public void create(final Bundle savedInstance)
    {

    }

    @Override
    public void created(final Bundle savedInstance)
    {

    }

    @Override
    public Class<T> getViewClass()
    {
        return GenericHelper.getViewClass(getClass());
    }

    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        create(savedInstanceState);

        try
        {
            mView = getViewClass().newInstance();
            mView.bindPresenter(this);
            setContentView(mView.create(getLayoutInflater(), null));
            mView.bindEvent();

            created(savedInstanceState);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
