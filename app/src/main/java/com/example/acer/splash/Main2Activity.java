package com.example.acer.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        next=(Button)findViewById(R.id.btn);


    }

    private void next(View v)
    {

    open();
    }

    public void open(){

        Intent intent=new Intent(this,qr.class);
        startActivity(intent);
    }
}
