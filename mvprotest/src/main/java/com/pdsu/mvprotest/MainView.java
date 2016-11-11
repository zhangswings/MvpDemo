package com.pdsu.mvprotest;

import com.pdsu.mvprodemo.helper.EventHelper;
import com.pdsu.mvprodemo.view.ViewImpl;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/11.
 */

public class MainView extends ViewImpl
{
    private TextView mTextView;
    private ProgressBar mProgressBar;

    @Override
    public void created()
    {
        mProgressBar = findViewById(R.id.progress);
        mTextView = findViewById(R.id.tv);
    }

    @Override
    public int getLayoutId()
    {
        return R.layout.activity_main;
    }

    public String getText()
    {
        return mTextView.getText().toString().trim();
    }

    public void setText(String text)
    {
        mTextView.setText(text);
    }

    public void setProgress(int progress)
    {
        mProgressBar.setProgress(progress);
    }

    public void setTextClickListener(View.OnClickListener li)
    {
        EventHelper.click(li, mTextView);
    }

    public void showToast(String toast)
    {
        Toast.makeText(mRootView.getContext(), toast, Toast.LENGTH_SHORT).show();
    }
}
