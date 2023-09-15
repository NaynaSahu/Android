package com.example.sumofnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView =findViewById(R.id.textView5);
        editText1 = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
    }

    public void add(View v){

        String a = editText1.getText().toString();
        String b = editText2.getText().toString();

        double value1 = Double.parseDouble(a);
        double value2 = Double.parseDouble(b);

        double ans = value1 + value2;

        textView.setText("ANS. = "+ans);

    }
}