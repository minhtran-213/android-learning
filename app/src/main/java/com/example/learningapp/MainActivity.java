package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view) {
        switch (view.getId()){
            case R.id.btn_browser:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
                startActivity(intent);
                break;
            case R.id.btn_dial:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+84967628624"));
                startActivity(intent1);
                break;
            case R.id.btn_map:
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:20.5937,789629"));
                startActivity(intent2);
                break;
        }
    }
}