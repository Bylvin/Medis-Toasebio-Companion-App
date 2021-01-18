package com.example.medistoasebiocompanionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    //Variabel
    Animation topAnim, bottomAnim;
    ImageView logo;
    TextView slogan, tagline;

    private static int SPLASH_SCREEN_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Untuk menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        //Animasi
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //Mengisi variabel
        logo = findViewById(R.id.logo_medis_toasebio);
        slogan = findViewById(R.id.slogan_app_name);
        tagline = findViewById(R.id.tagline_app);

        //Animasi
        logo.setAnimation(topAnim);
        slogan.setAnimation(bottomAnim);
        tagline.setAnimation(bottomAnim);

        //Untuk pindah ke menu login
            //untuk nahan berapa lama durasi splash screen
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run()
                {
                    Intent intent = new Intent(SplashActivity.this, ChooseActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_SCREEN_DURATION);
    }
}