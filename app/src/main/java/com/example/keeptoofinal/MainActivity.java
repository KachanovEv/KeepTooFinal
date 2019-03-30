package com.example.keeptoofinal;

import android.content.Context;
import android.os.Bundle;


public class MainActivity extends OnCreateView {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected Context getActivity() {
        return null;
    }
}
