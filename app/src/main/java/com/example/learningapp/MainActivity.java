package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate start", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity", "onCreate start");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart start", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity", "onStart start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume start", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity", "onResume start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause start", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity", "onPause start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart start", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity", "onRestart start");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy start", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity", "onDestroy start");
    }
}