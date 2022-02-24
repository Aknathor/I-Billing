package com.example.i_billing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class crear_cuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }

    public void irCrearMain(View view){
        Intent intent = new Intent(crear_cuenta.this, MainActivity.class);
        startActivity(intent);
    }
}