package com.pdsu.mvprotest;

import com.pdsu.mvprodemo.helper.EventHelper;
import com.pdsu.mvprodemo.view.ViewImpl;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/11.
 */

public class DataListView extends ViewImpl
{
    private Button mButton1, mButton2;
    private ListView mListView;
    private ArrayAdapter<String> mAdapter;

    public void addData(ArrayList<String> datas)
    {
        mAdapter.addAll(datas);
    }

    @Override
    public void bindEvent()
    {
        EventHelper.click(mPresenter, mButton1, mButton2);
        EventHelper.itemClick(mPresenter, mListView);
    }

    @Override
    public void created()
    {
        mButton1 = findViewById(R.id.newdata);
        mButton2 = findViewById(R.id.adddata);
        mListView = findViewById(R.id.list);
    }

    @Override
    public int getLayoutId()
    {
        return R.layout.list_layout;
    }

    public void setData(ArrayList<String> datas)
    {
        mAdapter = new ArrayAdapter<String>(mRootView.getContext(),
                android.R.layout.simple_list_item_1, datas);
        mListView.setAdapter(mAdapter);
    }

    public void toast(int position)
    {
        Toast.makeText(mRootView.getContext(),
                mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
    }
}
