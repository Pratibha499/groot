package com.example.groot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText etFirstValue, etSecondValue;
TextView tvAns;
Button Add,Subtract,Multiply,Divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstValue= findViewById(R.id.etFirstValue);
        etSecondValue= findViewById(R.id.etSecondValue);
        tvAns= findViewById(R.id.tvAns);
        Add= findViewById(R.id.btnAdd);
        Subtract= findViewById(R.id.btnSubtract);
        Multiply= findViewById(R.id.btnMultiply);
        Divide= findViewById(R.id.btnDivide);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstvalue+secondvalue;
                tvAns.setText("Answer is = "+ ans);
            }
        });


        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstvalue-secondvalue;
                tvAns.setText("ans is = "+ ans);
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstvalue*secondvalue;
                tvAns.setText("ans is = "+ ans);
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstvalue/secondvalue;
                tvAns.setText("ans is = "+ ans);
            }
        });


    }

}