package com.example.calc_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    EditText e1;
    EditText e2;
    Button b1;Button b2;Button b3;Button b4;Button b5;
    String v1;
    String v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.firstNumberTextInfo);

        t1=findViewById(R.id.result);
        e2=findViewById(R.id.secondNumberTextInfo);

        b1=findViewById(R.id.btnPlus);
        b2=findViewById(R.id.btnminus);
        b3=findViewById(R.id.btndiv);
        b4=findViewById(R.id.btnmul);
        b5=findViewById(R.id.clear);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=e1.getText().toString();
                v2=e2.getText().toString();
                String p=t1.getText().toString();
                t1.setVisibility(View.VISIBLE);//to make the text visible
                double a=Double.parseDouble(v1);
                double b=Double.parseDouble(v2);
                double c=a+b;
                t1.setText("Addition->"+c);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=e1.getText().toString();
                v2=e2.getText().toString();
                String p=t1.getText().toString();
                t1.setVisibility(View.VISIBLE);//to make the text visible
                double a=Double.parseDouble(v1);
                double b=Double.parseDouble(v2);
                double c=a-b;
                t1.setText("Subtraction->"+c);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=e1.getText().toString();
                v2=e2.getText().toString();
                String p=t1.getText().toString();
                t1.setVisibility(View.VISIBLE);//to make the text visible
                double a=Double.parseDouble(v1);
                double b=Double.parseDouble(v2);
                double c=a/b;
                t1.setText("Division->"+c);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=e1.getText().toString();
                v2=e2.getText().toString();
                String p=t1.getText().toString();
                t1.setVisibility(View.VISIBLE);//to make the text visible
                double a=Double.parseDouble(v1);
                double b=Double.parseDouble(v2);
                double c=a*b;
                t1.setText("Multiplication->"+c);
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=e1.getText().toString();
                v2=e2.getText().toString();
                e1.setText("");
                e2.setText("");
                t1.setText("");
            }
        });
    }
}
