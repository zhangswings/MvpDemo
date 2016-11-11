package com.pdsu.mvprodemo.presenter;

import com.pdsu.mvprodemo.helper.GenericHelper;
import com.pdsu.mvprodemo.view.IView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/11/11.
 */

public class FragmentPresenterImpl<T extends IView> extends Fragment implements IPresenter<T>
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

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState)
    {
        //        return super.onCreateView(inflater, container, savedInstanceState);
        create(savedInstanceState);

        try
        {
            mView = getViewClass().newInstance();
            View view = mView.create(inflater, container);
            mView.bindPresenter(this);
            mView.bindEvent();

            created(savedInstanceState);
            return view;
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
