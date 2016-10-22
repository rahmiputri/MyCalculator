package com.example.sonycenter.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonDot, buttonPercent, buttonPlus , buttonMinus , buttonDiv ,
            buttonMul, buttonX2, buttonSqrt, buttonDel, buttonCC , buttonResult ;

    EditText input ;

    float value1 , value2;
    double mX2, mPercent, mSqrt;
    boolean mul, div, add , sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonPercent = (Button) findViewById(R.id.buttonPercent);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttondiv);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonX2 = (Button) findViewById(R.id.buttonX2);
        buttonSqrt = (Button) findViewById(R.id.buttonSqrt);
        buttonDel =(Button) findViewById(R.id.buttonDel);
        buttonCC = (Button) findViewById(R.id.buttonCC);
        buttonResult = (Button) findViewById(R.id.buttonResult);
        input = (EditText) findViewById(R.id.input);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "0");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + ".");
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(input.getText() + "");
                mul = true ;
                input.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(input.getText()+"");
                div = true ;
                input.setText(null);
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(input.getText() + "");
                add = true;
                input.setText(null);
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(input.getText() + "");
                sub = true ;
                input.setText(null);
            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPercent = Float.parseFloat(input.getText() + "");
                input.setText(mPercent/100 + "");
            }
        });

        buttonX2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mX2 = Double.parseDouble(input.getText() + "");
                input.setText(Math.pow(mX2, 2) + "");
            }
        });

        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSqrt = Double.parseDouble(input.getText() + "");
                input.setText(Math.sqrt(mSqrt) + "");
            }
        });

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(input.getText() + "");

                if (mul == true){
                    input.setText(value1 * value2 + "");
                    mul=false;
                }

                if (div == true){
                    input.setText(value1 / value2 + "");
                    div=false;
                }

                if (add == true){
                    input.setText(value1 + value2 + "");
                    add = false;
                }

                if (sub == true){
                    input.setText(value1 - value2 + "");
                    sub = false;
                }
            }
        });

        buttonCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = input.getText().toString();
                if (string.length() > 1) {
                    string = string.substring(0,string.length()-1);
                    input.setText(string);
                }else{
                    input.setText("");
                }
            }
        });
    }



}
