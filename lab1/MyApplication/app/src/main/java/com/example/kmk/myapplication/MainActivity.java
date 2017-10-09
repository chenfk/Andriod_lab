package com.example.kmk.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick1(View view){
        Toast.makeText(this,"登录失败",Toast.LENGTH_LONG).show();
    }
    public void onClick2(View view){
        Toast.makeText(this,"注册失败",Toast.LENGTH_LONG).show();
    }
}

