package com.example.hello1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOK = findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            onClickOK();
            }
        } );

        Button btnPlus = findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view)       {
             onClickPlus();
            }

        });

        Button btnMinus = findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickMinus();
            }
        });

    }


    private void onClickOK()
    {
        EditText etName = findViewById(R.id.etName);
        String name = etName.getText().toString();
        TextView tvGreeting = findViewById(R.id.tvGreeting);
        String greeting = "Hello" + name + ", have a nice day!";
        tvGreeting.setText(greeting);
    }

    private void onClickPlus(){
        EditText etNumberOne = findViewById(R.id.etNumberOne);
        String number1 = etNumberOne.getText().toString();

        EditText etNumberTwo = findViewById(R.id.etNumberTwo);
        String number2 = etNumberTwo.getText().toString();

        TextView tvSum = findViewById(R.id.tvSum);
        String sum = "Summen er:" + number1 + number2 + "";
        tvSum.setText(sum);
    }

    private void onClickMinus() {
        EditText etNumberOne = findViewById(R.id.etNumberOne);
        String number1 = etNumberOne.getText().toString();

        EditText etNumberTwo = findViewById(R.id.etNumberTwo);
        String number2 = etNumberTwo.getText().toString();

        TextView tvSum = findViewById(R.id.tvSum);
        String sum = "Summen er:" + number1 + number2 + "";
        tvSum.setText(sum);

    }