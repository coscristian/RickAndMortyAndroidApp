package com.example.rickandmortyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.rickandmortyapp.Interfaces.ViewInterface;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ViewInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void showItem() {

    }

    @Override
    public void showErrorInfo() {

    }
}