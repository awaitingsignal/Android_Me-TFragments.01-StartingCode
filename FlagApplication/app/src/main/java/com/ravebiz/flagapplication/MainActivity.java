package com.ravebiz.flagapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout top = findViewById(R.id.frameLayoutTop);
        FrameLayout center = findViewById(R.id.frameLayoutCenter);
        FrameLayout bottom = findViewById(R.id.frameLayoutBottom);

        top.setOnClickListener(new View.OnClickListener() {
            //sets onclicklistener to top view and assigns it a view
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "German Flag", Toast.LENGTH_SHORT).show();
                getColor(R.color.colorGermany1);


            }
        });

        center.setOnClickListener(new View.OnClickListener() {
            //sets onclicklistener to center view and assigns it a view
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Netherlands Flag", Toast.LENGTH_SHORT).show();
            }
        });


        bottom.setOnClickListener(new View.OnClickListener() {
            //sets onclicklistener to bottom view and assigns it a view
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Estonia Flag", Toast.LENGTH_SHORT).show();

            }
        });

    }
}

