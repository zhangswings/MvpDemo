package com.pdsu.mvpdemo.presenter;

import com.pdsu.mvpdemo.bean.UserBean;
import com.pdsu.mvpdemo.model.IUserModel;
import com.pdsu.mvpdemo.model.UserModel;
import com.pdsu.mvpdemo.view.IUserView;

/**
 * Created by Administrator on 2016/11/11.
 */

public class UserPresenter
{
    private IUserView mUserView;
    private IUserModel mUserModel;

    public UserPresenter(final IUserView userView)
    {
        mUserView = userView;
        mUserModel = new UserModel();
    }

    public void loadUser(int id)
    {
        UserBean user = mUserModel.load(id);
        mUserView.setName(user.getName());
        mUserView.setPassword(user.getPassword());
    }

    public void saveUser(int id, String name, String password)
    {
        mUserModel.setID(id);
        mUserModel.setName(name);
        mUserModel.setPassword(password);
    }
}
