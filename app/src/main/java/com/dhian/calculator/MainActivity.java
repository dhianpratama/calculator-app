package com.dhian.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int a;
    int b;

    EditText editTextA;
    EditText editTextB;

    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextA = (EditText) findViewById(R.id.editTextNumberA);
        editTextB = (EditText) findViewById(R.id.editTextNumberB);
        textViewResult = (TextView) findViewById(R.id.textViewResult);

        editTextA.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textViewResult.setText("");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextB.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textViewResult.setText("");
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    public void addOnClick(View view) {
        String tmpA = editTextA.getText().toString().trim();
        String tmpB = editTextB.getText().toString().trim();

        if (!isValidInput(tmpA, tmpB)) {
            Toast.makeText(this, "Input cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }

        a = Integer.valueOf(tmpA);
        b = Integer.valueOf(tmpB);
        int result = a + b;
        textViewResult.setText( a + " + "  + b + " = "+ String.valueOf(result));
    }

    public void subOnClick(View view) {
        String tmpA = editTextA.getText().toString().trim();
        String tmpB = editTextB.getText().toString().trim();

        if (!isValidInput(tmpA, tmpB)) {
            Toast.makeText(this, "Input cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }

        a = Integer.valueOf(tmpA);
        b = Integer.valueOf(tmpB);
        int result = a - b;
        textViewResult.setText( a + " - "  + b + " = "+ String.valueOf(result));
    }

    public void multiplyOnClick(View view) {
        String tmpA = editTextA.getText().toString().trim();
        String tmpB = editTextB.getText().toString().trim();

        if (!isValidInput(tmpA, tmpB)) {
            Toast.makeText(this, "Input cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }

        a = Integer.valueOf(tmpA);
        b = Integer.valueOf(tmpB);
        int result = a * b;
        textViewResult.setText( a + " * "  + b + " = "+ String.valueOf(result));
    }

    public void divideOnClick(View view) {
        String tmpA = editTextA.getText().toString().trim();
        String tmpB = editTextB.getText().toString().trim();

        if (!isValidInput(tmpA, tmpB)) {
            Toast.makeText(this, "Input cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }

        a = Integer.valueOf(tmpA);
        b = Integer.valueOf(tmpB);
        int result = a / b;
        textViewResult.setText( a + " / "  + b + " = "+ String.valueOf(result));
    }

    private Boolean isValidInput(String a, String b) {
        return a != null && b != null && !a.equals("") && !b.equals("");
    }

}