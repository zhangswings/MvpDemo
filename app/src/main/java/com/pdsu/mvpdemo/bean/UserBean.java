package com.pdsu.mvpdemo.bean;

/**
 * Created by Administrator on 2016/11/11.
 */

public class UserBean
{
    private String Name;
    private String Password;

    /**
     * @param name     name
     * @param password password
     */
    public UserBean(final String name, final String password)
    {
        Password = password;
        Name = name;
    }

    public String getName()
    {
        return Name;
    }

    public String getPassword()
    {
        return Password;
    }

}
