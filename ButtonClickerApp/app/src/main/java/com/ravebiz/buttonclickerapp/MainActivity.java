package com.ravebiz.buttonclickerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends AppCompatActivity {

    TextView textdisplaycount;
    //sets textdisplaycount ID to textview

    private DisplayFragment displayFragment;
    // Declare variable for fragment


    @BindView(R.id.buttonclickme)
            //uses butterknife to bind a view to a button
    Button button;
    //instantiates the button functions
    private int mCounter = 0;
    //sets the mCounter to 0 to begin with, this will be invoked later


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
        //"butterknife.bind" binds butterknife from gradle into the main activity, mainactivity.this specifies the activity

        displayFragment = (DisplayFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_top);
        // initialize fragment

    }


    @OnClick(R.id.buttonclickme)
    public void clickSubmit() {
        Toast.makeText(this, "Adding to the count", Toast.LENGTH_SHORT).show();
        //adds a toast message after clicking to display at the bottom of the screen
        mCounter ++;
        //adds to the counter by 1 using the increment operator
        displayFragment.setCounter(mCounter);
//        TextView.inflate(
        }
    @OnLongClick(R.id.buttonclickme) boolean clickSubmitLong() {
        displayFragment.setCounter(mCounter=0);
        return true;
        }



    }



