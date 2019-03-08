package com.ravebiz.buttonclickerapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import butterknife.ButterKnife;

public class DisplayFragment extends Fragment {

    TextView textView;
    int counter = 0;

    // Default Constructor
    public void NumberFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        textView = view.findViewById(R.id.textdisplaycount);
        textView.setText(String.valueOf(counter));

        return view;
    }

    public void setCounter(int counter) {
        this.counter = counter;
        textView.setText(String.valueOf(counter));
    }


}