package com.example.modulesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.domain.Example;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Example example = new Example();
        boolean areEqual = example.areEqual();
        Toast.makeText(this, String.valueOf(areEqual), Toast.LENGTH_SHORT).show();
    }
}