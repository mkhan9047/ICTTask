package com.example.mujahid.icttask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button webview;
    Button student;
    Button previewStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        webview = findViewById(R.id.webview);
        student = findViewById(R.id.student);
        previewStudent = findViewById(R.id.previewStudent);

        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentWebview = new Intent(Home.this,MainActivity.class);
                startActivity(intentWebview);
            }
        });

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentWebview = new Intent(Home.this,StudentInfo.class);
                startActivity(intentWebview);
            }
        });
        previewStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentWebview = new Intent(Home.this,ShowStudent.class);
                startActivity(intentWebview);
            }
        });


    }
}
