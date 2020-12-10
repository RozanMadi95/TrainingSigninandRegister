package com.example.signinandregisterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        Button btn_home = findViewById(R.id.say_btn_hello_name);

        // Lookup EditText reference
        //في حال الدخول انتقل للواجهة السابقة كمثال هي مش اكثر
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(signin.this, MainActivity.class));
            }
        });
    }
}