package com.ravebiz.buttonclickerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {



    @BindView(R.id.buttonclickme)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);


    }


    @OnClick(R.id.buttonclickme)
    public void clickSubmit() {
        Toast.makeText(this, "Adding to the count", Toast.LENGTH_SHORT).show();



    }
}


