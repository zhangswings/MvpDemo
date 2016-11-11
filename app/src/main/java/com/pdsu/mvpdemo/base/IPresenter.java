package com.pdsu.mvpdemo.base;

public interface IPresenter<T extends IView>
{

    void attachView(T view);

    void detachView();

    void start();
}