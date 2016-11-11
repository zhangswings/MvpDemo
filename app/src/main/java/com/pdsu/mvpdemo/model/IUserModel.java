package com.pdsu.mvpdemo.model;

import com.pdsu.mvpdemo.bean.UserBean;

/**
 * Created by Administrator on 2016/11/11.
 */

public interface IUserModel
{
    UserBean load(int id);

    void setID(int id);

    void setName(String name);

    void setPassword(String password);
}
