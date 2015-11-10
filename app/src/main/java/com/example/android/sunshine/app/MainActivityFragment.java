package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "tomorrow - windy - 89/62",
                "wed - fuck you - 84/62",
                "thu - wtf - 86/63",
                "thu - wtf - 86/63",
                "thu - wtf - 86/63",
                "thu - wtf - 86/63"
        };
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
