package com.example.signinandregisterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lookup TextView reference
        //بتعرفي النص الي مكتوب فيه انشاء حساب جديد

        TextView btn_create = findViewById(R.id.tv_create_one);
        Button btn_signin = findViewById(R.id.btn_Signin);


        //في حال انشاء حساب خاص بك انتقل للواجهة تسجيل
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,register.class));
            }
        });

        //في حال الدخول انتقل للواجهة انضمام
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,signin.class));
            }
        });

    }
}