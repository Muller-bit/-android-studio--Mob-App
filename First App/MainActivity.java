package com.mulualem.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtnumberOne, edtnumberTwo;
    TextView txtresult;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnumberOne =findViewById(R.id.numberOne);
        edtnumberTwo =findViewById(R.id.numberTwo);
        txtresult =findViewById(R.id.result);

    }

     public void showToastMessage(View view){
        String firstNumber = edtnumberOne.getText().toString();
        String secondtNumber = edtnumberTwo.getText().toString();

        if(firstNumber.isEmpty()||secondtNumber.isEmpty()){
            Toast.makeText(MainActivity.this,"wrong input",Toast.LENGTH_SHORT).show();
            return;

        }
        int resultNumber  = Integer.parseInt(firstNumber) * Integer.parseInt(secondtNumber);

        txtresult.setText(String.valueOf(resultNumber));

        Toast.makeText(MainActivity.this,"Result is " + resultNumber,Toast.LENGTH_SHORT).show();

    }
}