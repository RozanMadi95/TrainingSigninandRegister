package com.example.signinandregisterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Lookup TextView reference
        Button btn_Register = findViewById(R.id.btn_Register);
        //اضافة خاصة عند الضغط ونقر على النص ينتقل لولجهة التسجيل

        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(register.this,MainActivity.class));
            }
        });
    }
}