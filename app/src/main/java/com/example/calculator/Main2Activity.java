package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    TextView num1, num2, answer;
    Button btnPlus, btnMinus, btnMul, btnDiv;
    String value1, value2;
    int n1,n2,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnPlus = findViewById(R.id.button1);
        btnMinus = findViewById(R.id.button2);
        btnMul = findViewById(R.id.button3);
        btnDiv = findViewById(R.id.button4);
        answer = findViewById(R.id.answer);

        value1 = intent.getStringExtra("FirstNumber");
        value2 = intent.getStringExtra("SecondNumber");

        n1 = Integer.parseInt(value1);
        n2 = Integer.parseInt(value2);

        num1.setText(value1);
        num2.setText(value2);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button1: ans = n1 + n2;
                answer.setText(n1+ "+" +n2+ "=" +ans);
                break;

            case R.id.button2: ans = n1 - n2;
                answer.setText(n1+ "-" +n2+ "=" +ans);
                break;

            case R.id.button3: ans = n1 * n2;
                answer.setText(n1+ "*" +n2+ "=" +ans);
                break;

            case R.id.button4: ans = n1 / n2;
                answer.setText(n1+ "/" +n2+ "=" +ans);
                break;
        }
    }

}
