package com.example.pixeleffect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class splsh extends AppCompatActivity {

    TextView namelogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splsh);

        namelogo = findViewById(R.id.namelogo);
        Animation animation = AnimationUtils.loadAnimation(splsh.this,R.anim.blink);
        namelogo.startAnimation(animation);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splsh.this,MainActivity.class));
                finish();

            }
        },2000);

    }
}