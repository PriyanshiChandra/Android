package com.example.myapp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    Button Add_button;
    Button Sub_button;
    Button Mul_button;
    Button Div_button;
    TextView result;
    int ans=0;
    TextView result2;
    TextView result3;
    TextView result4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.editText_first_no);
        num2=(EditText) findViewById(R.id.editText_second_no);
        Add_button=(Button) findViewById(R.id.add_button);
        Sub_button=(Button) findViewById(R.id.sub_button);
        Mul_button=(Button) findViewById(R.id.multiply_button);
        Div_button=(Button) findViewById(R.id.divide_button);
        result=(TextView) findViewById(R.id.textView_answer);
        result2 = (TextView) findViewById(R.id.text_View_answer2);
        result3 = (TextView) findViewById(R.id.text_View_answer3);
        result4 = (TextView) findViewById(R.id.text_View_answer4);

        Add_button.setOnClickListener(new View.OnClickListener(){

                public void onClick(View v){
                    double n1=Double.parseDouble(num1.getText().toString());
                    double n2=Double.parseDouble(num2.getText().toString());
                    double sum=n1+n2;
                    result.setText(Double.toString(sum));
        }
        });
        Sub_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double n1=Double.parseDouble(num1.getText().toString());
                double n2=Double.parseDouble(num2.getText().toString());
                double sub=n1-n2;
                result2.setText(Double.toString(sub));

            }
        }
        );
        Mul_button.setOnClickListener(new View.OnClickListener() {
                                          public void onClick(View v) {
                                              double n1=Double.parseDouble(num1.getText().toString());
                                              double n2=Double.parseDouble(num2.getText().toString());
                                              double mul=n1*n2;
                                              result3.setText(Double.toString(mul));

                                          }
                                      }
        );
        Div_button.setOnClickListener(new View.OnClickListener() {
                                          public void onClick(View v) {
                                              double n1=Double.parseDouble(num1.getText().toString());
                                              double n2=Double.parseDouble(num2.getText().toString());
                                              double div=n1/n2;
                                              result4.setText(Double.toString(div));

                                          }
                                      }
        );
    }
}
