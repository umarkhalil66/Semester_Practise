package com.example.lecture6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void MoveActivity(View view) {
        Intent intent;
        intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}