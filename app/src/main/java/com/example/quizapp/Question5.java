package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question5 extends AppCompatActivity {

    RadioButton fi,ma,st,pr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        fi=findViewById(R.id.radioButton17);
        ma=findViewById(R.id.radioButton18);
        st=findViewById(R.id.radioButton19);
        pr=findViewById(R.id.radioButton20);
        fi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count.wrong++;
                Toast.makeText(getApplicationContext(),"Wrong",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Question5.this,Result.class);
                startActivity(intent);
            }
        });
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count.wrong++;
                Toast.makeText(getApplicationContext(),"Wrong",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Question5.this,Result.class);
                startActivity(intent);
            }
        });
        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count.wrong++;
                Toast.makeText(getApplicationContext(),"Wrong",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Question5.this,Result.class);
                startActivity(intent);
            }
        });
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count.correct++;
                Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Question5.this,Result.class);
                startActivity(intent);
            }
        });
    }
}