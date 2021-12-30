package com.example.newsapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Timer().schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MainActivity.this, MainActivityHome.class);
                        startActivity(intent);
                        finish();
                    }
                }, 3000);
//        Thread thread = new Thread() {
//            public void run() {
//                try {
//                    sleep(4000);
//                    finish();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                } finally {
//
//                }
//            }
//
//        };
//        thread.start();
    }
}