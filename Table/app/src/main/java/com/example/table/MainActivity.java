package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);

    }

    public void calculate(View v){
        textView.setText("");
        int num = Integer.parseInt(editText.getText().toString());
        for(int i = 1 ; i<=10 ; i++){
            int ans = num * i;
            textView.append(num + " x " + i + " = "+ ans + "\n" );

        }
    }
}