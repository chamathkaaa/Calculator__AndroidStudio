package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnOk;
    EditText text1,text2;
    String n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = findViewById(R.id.btnOK);
        text1 = findViewById(R.id.num1);
        text2 = findViewById(R.id.num2);

    }

    /*public void send(View v)
    {
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(i);
    }*/


    @Override
    protected void onResume()
    {
        super.onResume();

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = text1.getText().toString();
                n2 = text2.getText().toString();

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("FirstNumber", n1);
                i.putExtra("SecondNumber", n2);


                startActivity(i);
            }
        });
    }
}
