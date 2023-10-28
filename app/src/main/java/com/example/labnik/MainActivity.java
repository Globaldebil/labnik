package com.example.labnik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.labnik.laba1.Laba1;
import com.example.labnik.laba1.Laba1Result;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceBook) {
        super.onCreate(savedInstanceBook);
        setContentView(R.layout.activity_main);
        Button laba1 = findViewById(R.id.to_laba1);
        Button laba3 = findViewById(R.id.to_laba3);
        Button laba4 = findViewById(R.id.to_laba4);
        Button laba5 = findViewById(R.id.to_laba5);
        laba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Laba1.class);
                startActivity(intent);
            }
        });
        laba3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Пока не сделана", Toast.LENGTH_SHORT).show();
            }
        });
        laba4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Пока не сделана", Toast.LENGTH_SHORT).show();
            }
        });
        laba5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Пока не сделана", Toast.LENGTH_SHORT).show();
            }
        });
    }
}