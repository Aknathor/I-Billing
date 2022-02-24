package com.example.i_billing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irCrearCuenta(View view){
        Intent intent = new Intent(MainActivity.this, crear_cuenta.class);
        startActivity(intent);
    }
}