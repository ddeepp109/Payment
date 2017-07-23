package com.example.deeppatel.pay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private  String Tag= "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Tag,"onCreate is called");
    }

    protected void onStart(){
        super.onStart();
        Log.i(Tag,"onStart is called");
    }

    protected void onResume(){
        super.onResume();
        Log.i(Tag,"onResume is called");
    }

    protected void onPause(){
        super.onPause();
        Log.i(Tag,"onPause is called");
    }

    protected void onStop(){
        super.onStop();
        Log.i(Tag,"onStop is called");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(Tag,"onDestroy is called");
    }
}
