package com.pdsu.mvpdemo.model;

import com.pdsu.mvpdemo.bean.UserBean;

import android.util.SparseArray;

/**
 * Created by Administrator on 2016/11/11.
 */

public class UserModel implements IUserModel
{
    private String mName;
    private String mPassword;
    private int mID;
    private SparseArray<UserBean> mUsererArray = new SparseArray<UserBean>();

    @Override
    public UserBean load(final int id)
    {
        mID = id;
        UserBean userBean = mUsererArray.get(mID, new UserBean("not found", "not found"));
        return userBean;
    }

    @Override
    public void setID(final int id)
    {
        mID = id;
    }

    @Override
    public void setName(final String name)
    {
        mName = name;
    }

    @Override
    public void setPassword(final String password)
    {
        mPassword = password;
        UserBean mUserBean = new UserBean(mName, mPassword);
        mUsererArray.append(mID, mUserBean);
    }
}
