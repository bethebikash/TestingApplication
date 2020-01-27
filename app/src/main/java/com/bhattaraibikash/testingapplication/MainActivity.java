package com.bhattaraibikash.testingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText firstNum, secondNum;
    private Button btnAdd, btnSubtract, btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum = findViewById(R.id.firstNum);
        secondNum = findViewById(R.id.secondNum);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnDivide = findViewById(R.id.btnDivide);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Subtract();
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Divide();
            }
        });
    }

    private void Add() {

        float first = Float.parseFloat(firstNum.getText().toString());
        float second = Float.parseFloat(secondNum.getText().toString());
        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.add(first, second);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("result",result);
        startActivity(intent);
    }

    private void Subtract() {

        float first = Float.parseFloat(firstNum.getText().toString());
        float second = Float.parseFloat(secondNum.getText().toString());
        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.subtract(first, second);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("result",result);
        startActivity(intent);
    }

    private void Divide() {

        float first = Float.parseFloat(firstNum.getText().toString());
        float second = Float.parseFloat(secondNum.getText().toString());
        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.divide(first, second);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("result",result);
        startActivity(intent);
    }
}
