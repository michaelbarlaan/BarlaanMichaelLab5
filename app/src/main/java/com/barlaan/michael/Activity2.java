package com.barlaan.michael;

import android.content.Intent;

import android.net.Uri;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        this.setTitle("Activity 2");

        Intent i = new Intent(this, CustomService.class);

        startService(i);

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "4ITH", "onStop: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITH", "onStart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITH", "Huminto yung activity ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITH", "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITH", "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITH", "onDestroy: ");
    }



    public void process (View v) {

        Intent i = null, chooser = null;

        if (v.getId() == R.id.button4) {

            i = new Intent(Intent.ACTION_VIEW);

            i.setData(Uri.parse("geo:13.432725, 120.936434"));

            chooser = Intent.createChooser(i, "Choose map app");

            startActivity(chooser);

        }

        else if (v.getId() == R.id.button3) {

            i  = new Intent ( this, MainActivity.class);

            startActivity(i);

        }

    }
    }

