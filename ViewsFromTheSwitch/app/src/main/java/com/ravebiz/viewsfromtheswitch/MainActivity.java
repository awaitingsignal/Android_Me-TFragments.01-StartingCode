package com.ravebiz.viewsfromtheswitch;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "logTag";
    // Global Variables Declared Here
    Context context;
    View v;
    int increment;
    TextView colorView1, colorView2, colorView3, colorView4, colorView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize global variables under onCreate lifecycle

        context = MainActivity.this;
        colorView1 = findViewById(R.id.blueview1);
        colorView2 = findViewById(R.id.grayview2);
        colorView3 = findViewById(R.id.purpleview3);
        colorView4 = findViewById(R.id.redview4);
        colorView5 = findViewById(R.id.greenview5);
        new AsyncTaskCounter().execute();

    }

    private class AsyncTaskCounter extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Sets the visibility of color 5 to visible before the execution state
            colorView5.setVisibility(View.VISIBLE);
        }

        @Override
        protected Void doInBackground(Void... voids) {

            // Create instance of Handler for UI thread(MainActivity)
            // context.getMainLooper() sets the Thread focus to the UI
            Handler mainHandler = new Handler(context.getMainLooper());
            Runnable viewOneRunnable = new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(MainActivity.this, "Main Activity", Toast.LENGTH_SHORT).show();
                    colorView1.setVisibility(View.INVISIBLE);
//                    colorView2.setVisibility(View.INVISIBLE);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    colorView2.setVisibility(View.VISIBLE);
//
//                    colorView3.setVisibility(View.INVISIBLE);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    colorView3.setVisibility(View.VISIBLE);
//
//                    colorView4.setVisibility(View.INVISIBLE);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    colorView4.setVisibility(View.VISIBLE);
                }

            };
            // Creates a new Handler for a runnable instance
            // Uses mainHandler within the scope of doInBackground to run the runnable
            mainHandler.post(viewOneRunnable);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Runnable viewTwoRunnable;
            viewTwoRunnable = new Runnable() {
                @Override
                public void run() {
                    colorView2.setVisibility(View.INVISIBLE);
                    colorView1.setVisibility(View.VISIBLE);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            mainHandler.post(viewTwoRunnable);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Runnable viewThreeRunnable;
            viewThreeRunnable = new Runnable() {
                @Override
                public void run() {
                    colorView3.setVisibility(View.INVISIBLE);
                    colorView2.setVisibility(View.VISIBLE);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            mainHandler.post(viewThreeRunnable);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Runnable viewFourRunnable;
            viewFourRunnable = new Runnable() {
                @Override
                public void run() {
                    colorView4.setVisibility(View.INVISIBLE);
                    colorView3.setVisibility(View.VISIBLE);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            mainHandler.post(viewFourRunnable);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Runnable viewFiveRunnable;
            viewFiveRunnable = new Runnable() {
                @Override
                public void run() {
                    colorView5.setVisibility(View.INVISIBLE);
                    colorView4.setVisibility(View.VISIBLE);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };
            mainHandler.post(viewFiveRunnable);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return null;


        }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Log.d(TAG, "onPostExecute()");
        Toast.makeText(context, "onPostExecute()", Toast.LENGTH_SHORT).show();
        colorView5.setVisibility(View.INVISIBLE);
        colorView4.setVisibility(View.VISIBLE);
        recreate();


    }


    }

}


