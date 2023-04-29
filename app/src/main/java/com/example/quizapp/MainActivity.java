package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,About.class);
                startActivity(intent);
            }
        });
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText=(EditText)findViewById(R.id.editTextTextPersonName);
                String message = editText.getText().toString();

                //Trim whitespace
                message = message.trim();

                //Checks if the message has anything.
                if (message.length() == 0) {
                    editText.setError("Please Enter a username!");
                    return;
                }
                else{
                Intent intent=new Intent(MainActivity.this,Question1.class);
                startActivity(intent);}
            }
        });
    }
}