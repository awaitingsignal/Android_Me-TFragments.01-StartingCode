package com.ravebiz.flagapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentFlagBit extends Fragment {
    //FragmentFlagBit is the name of the class, it extends the Fragment class to use the Fragment functionality
    public FragmentFlagBit (){
    //public "string" -- here FragmentFlagBit, creates a public constructor for the class
    }

    @Nullable
    //extends annotations
    @Override
    //implements annotations
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    //View onCreateView invokes the inflater to display Fragments for the FrameLayout in the activity_main.xml
    {
        if (savedInstanceState !=null)
        //if the savedInstanceState is not null then execute the next arguments
        View view = inflater.inflate(R.layout.flag_fragments, container)
        return view;
        //returns the View which was defined as "view"
    }
}



