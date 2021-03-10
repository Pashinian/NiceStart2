package com.example.mynicestart;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

/**
 * @author Luis Navarro Pashinian
 */
public class SplashScreenActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //TextView titulo = findViewById(R.id.);
        //Animation animIn = AnimationUtils.loadAnimation(this, R.anim.alpha);
        //Animation animOut = AnimationUtils.loadAnimation(this, R.anim.imagen);
        //titulo.startAnimation(animIn);




        //Glide.with(this)
                //.load(R.drawable.logoporsche)
                //.centerCrop().transition(DrawableTransitionOptions.withCrossFade(500))
                //.into(myImageFondo);


        openApp(true);


    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}