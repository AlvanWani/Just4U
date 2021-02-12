package com.example.just4u;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    TextView mAnswer;
    EditText mFirstNum, mSecondNum;
    Button mBtnAdd, mBtnSub,mBtnDivide,mBtnMultiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        mAnswer = findViewById(R.id.tv_answer);
        mFirstNum = findViewById(R.id.edt_fnum);
        mSecondNum = findViewById(R.id.edt_snum);
        mBtnAdd = findViewById(R.id.btn_add);
        mBtnSub = findViewById(R.id.btn_sub);
        mBtnDivide = findViewById(R.id.btn_divide);
        mBtnMultiply = findViewById(R.id.btn_multiply);

        //setting listeners to the buttons
        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strFnum,strSnum;
                Double firstNum, secondNum;
                strFnum = mFirstNum.getText().toString().trim();
                strSnum = mSecondNum.getText().toString().trim();

                if(strFnum.isEmpty()){
                    mFirstNum.setError("Please Enter a Number");
                    mFirstNum.requestFocus();
                }else if(strSnum.isEmpty()){
                    mSecondNum.setError("Please Enter a Number");
                    mSecondNum.requestFocus();
                }else {
                    //Convert received string to double
                    firstNum = Double.parseDouble(strFnum);
                    secondNum = Double.parseDouble(strSnum);

                    Double Answer = firstNum + secondNum;
                    mAnswer.setText(String.valueOf(Answer));
                }
            }
        });

        mBtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strFnum,strSnum;
                Double firstNum, secondNum;
                strFnum = mFirstNum.getText().toString().trim();
                strSnum = mSecondNum.getText().toString().trim();

                if(strFnum.isEmpty()){
                    mFirstNum.setError("Please Enter a Number");
                    mFirstNum.requestFocus();
                }else if(strSnum.isEmpty()){
                    mSecondNum.setError("Please Enter a Number");
                    mSecondNum.requestFocus();
                }else {
                    //Convert received string to double
                    firstNum = Double.parseDouble(strFnum);
                    secondNum = Double.parseDouble(strSnum);

                    Double Answer = firstNum - secondNum;
                    mAnswer.setText(String.valueOf(Answer));
                }
            }
        });

        mBtnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strFnum,strSnum;
                Double firstNum, secondNum;
                strFnum = mFirstNum.getText().toString().trim();
                strSnum = mSecondNum.getText().toString().trim();

                if(strFnum.isEmpty()){
                    mFirstNum.setError("Please Enter a Number");
                    mFirstNum.requestFocus();
                }else if(strSnum.isEmpty()){
                    mSecondNum.setError("Please Enter a Number");
                    mSecondNum.requestFocus();
                }else {
                    //Convert received string to double
                    firstNum = Double.parseDouble(strFnum);
                    secondNum = Double.parseDouble(strSnum);

                    Double Answer = firstNum / secondNum;
                    mAnswer.setText(String.valueOf(Answer));
                }

            }
        });

        mBtnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strFnum,strSnum;
                Double firstNum, secondNum;
                strFnum = mFirstNum.getText().toString().trim();
                strSnum = mSecondNum.getText().toString().trim();

                if(strFnum.isEmpty()){
                    mFirstNum.setError("Please Enter a Number");
                    mFirstNum.requestFocus();
                }else if(strSnum.isEmpty()){
                    mSecondNum.setError("Please Enter a Number");
                    mSecondNum.requestFocus();
                }else {
                    //Convert received string to double
                    firstNum = Double.parseDouble(strFnum);
                    secondNum = Double.parseDouble(strSnum);

                    Double Answer = firstNum * secondNum;
                    mAnswer.setText(String.valueOf(Answer));
                }

            }
        });
    }
}