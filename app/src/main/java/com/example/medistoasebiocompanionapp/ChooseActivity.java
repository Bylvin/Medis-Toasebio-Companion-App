package com.example.medistoasebiocompanionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.medistoasebiocompanionapp.Doctor.Login_Doctor_Activity;
import com.example.medistoasebiocompanionapp.Member.Login_Member_Activity;

public class ChooseActivity extends AppCompatActivity {

    //Variabel
    Button loginDoctor, loginMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void GotoLoginDoctor(View view)
    {
        Intent intent = new Intent(ChooseActivity.this, Login_Doctor_Activity.class);
        startActivity(intent);
    }

    public void GotoLoginMember(View view)
    {
        Intent intent = new Intent(ChooseActivity.this, Login_Member_Activity.class);
        startActivity(intent);
    }
}