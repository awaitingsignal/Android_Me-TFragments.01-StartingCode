package com.ravebiz.backgroundthreadexample;

import android.content.Context;
import android.nfc.Tag;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //declare global variables
    EditText input;
    ProgressBar loading;
    Button start;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize global variables
        input = findViewById(R.id.et_input);
        loading = findViewById(R.id.pb_loading);
        start = findViewById(R.id.btn_start);
        // Set the OnClickListener to this Activity(this) since it implements
        // View.OnClick Listener
        start.setOnClickListener(MainActivity.this);
        context = MainActivity.this;

    }

    @Override
    public void onClick(View view) {
        // Switch statement that uses the view Id has
        switch (view.getId()) {
            case R.id.btn_start:
                // This implementation stores the new Instance in a variable
                // We ca use that variable to access the methods
//                    AsyncTaskCounter taskCounter = new AsyncTaskCounter();
//                    taskCounter.execute();
                // This is an inline implementation
                new AsyncTaskCounter().execute();
                Toast.makeText(this, "MainActivity", Toast.LENGTH_SHORT).show();
                break;
        }

    }
    // Create AsyncTask to run background
    private class AsyncTaskCounter extends AsyncTask<Void, Void, Void> {


        private static final String TAG = "AsyncTaskCounter";

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.d(TAG, "onPreExecute: ");
            loading.setVisibility(View.VISIBLE);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            new Handler(MainActivity.this.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(MainActivity.this, "doInBackground: ", Toast.LENGTH_SHORT).show();

                }
            });
            Log.d(TAG, "doInBackground: ");

            // Create instance of Handler for UI thread(MainActivity)
            // context.getMainLooper() sets the Thread focus to the UI

            Handler mainHandler = new Handler(context.getMainLooper());
            // This is the code we want to run
            Runnable runnable = new Runnable() {

                @Override
                public void run() {

                }
            };

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            return null;

        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            loading.setVisibility(View.GONE);
        }
    }
}
