package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication2.SecondActivity.jva;

public class MainActivity extends AppCompatActivity {

    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = (Button)findViewById(R.id.button1);
    }

    public void onClick(View v){
        Intent intent = new Intent(MainActivity.this, jva.class);
        startActivity(intent);
    }
}
