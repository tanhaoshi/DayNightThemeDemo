package com.falc.daynightthemedemo;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        ArrayList<String> lists = new ArrayList<>();
        lists.addAll(Arrays.asList(this.getResources().getStringArray(R.array.games)));
    }

    @Override
    public Resources getResources() {
        Log.i("SecondActivity","lool at secondActivity resource change");
        return super.getResources();
    }
}
