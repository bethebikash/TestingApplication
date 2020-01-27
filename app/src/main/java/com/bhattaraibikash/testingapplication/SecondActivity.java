package com.bhattaraibikash.testingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvResult = findViewById(R.id.tvResult);

        Bundle extra = getIntent().getExtras();

        if(!extra.isEmpty()){
            Float result = extra.getFloat("result");

            tvResult.setText(Float.toString(result));
        } else {
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }

    }
}
