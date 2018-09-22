package com.example.acer.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ImageView imageview= findViewById(R.id.image);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        imageview.startAnimation(animation);

        Thread timer = new Thread(){

            @Override
            public void run() {

                try {
                    sleep(3000);
                    Intent intent= new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
                    finish();

                    super.run();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        };
     timer.start();

    }
}
