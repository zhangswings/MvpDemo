package com.pdsu.mvpdemo.view;

import com.pdsu.mvpdemo.R;
import com.pdsu.mvpdemo.presenter.UserPresenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements IUserView, View.OnClickListener
{

    private LinearLayout activityMain;
    private EditText edtName;
    private EditText edtPassword;
    private Button btnLoad;
    private Button btnSave;

    private UserPresenter mUserPresenter;


    @Override
    public int getID()
    {
        return Integer.parseInt("100");
    }

    @Override
    public String getName()
    {
        return edtName.getText().toString();
    }

    @Override
    public void setName(final String name)
    {
        edtName.setText(name);
        edtName.setSelection(edtName.getText().toString().length());
    }

    @Override
    public String getPassword()
    {
        return edtPassword.getText().toString();
    }

    @Override
    public void setPassword(final String password)
    {
        edtPassword.setText(password);
        edtPassword.setSelection(edtPassword.getText().toString().length());
    }

    private void initView()
    {
        activityMain = (LinearLayout) findViewById(R.id.activity_main);
        edtName = (EditText) findViewById(R.id.edtName);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnLoad = (Button) findViewById(R.id.btnLoad);
        btnSave = (Button) findViewById(R.id.btnSave);
    }

    @Override
    public void onClick(final View view)
    {
        switch (view.getId())
        {
            case R.id.btnLoad:
                mUserPresenter.loadUser(getID());
                break;
            case R.id.btnSave:
                mUserPresenter.saveUser(getID(), getName(), getPassword());
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        mUserPresenter = new UserPresenter(this);

        btnLoad.setOnClickListener(this);
        btnSave.setOnClickListener(this);


    }
}
