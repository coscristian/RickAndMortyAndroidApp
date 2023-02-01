package com.example.rickandmortyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.rickandmortyapp.Interface.InterfacesMainActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, InterfacesMainActivity.View {

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
}