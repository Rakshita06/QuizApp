package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {

    RadioButton fi,ma,st,pr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        fi=findViewById(R.id.radioButton5);
        ma=findViewById(R.id.radioButton6);
        st=findViewById(R.id.radioButton7);
        pr=findViewById(R.id.radioButton8);
        fi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count.wrong++;
                Toast.makeText(getApplicationContext(),"Wrong",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Question2.this,Question3.class);
                startActivity(intent);
            }
        });
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count.correct++;
                Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Question2.this,Question3.class);
                startActivity(intent);
            }
        });
        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count.wrong++;
                Toast.makeText(getApplicationContext(),"Wrong",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Question2.this,Question3.class);
                startActivity(intent);
            }
        });
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count.wrong++;
                Toast.makeText(getApplicationContext(),"Wrong",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Question2.this,Question3.class);
                startActivity(intent);
            }
        });
    }
}