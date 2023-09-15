package com.example.weekdays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView text;
    private EditText edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        text = findViewById(R.id.textView);
        edit = findViewById(R.id.editTextText);


    }

    public void SearchDay(){
        int num = Integer.parseInt(edit.getText().toString());

        switch (num){
            case 1:
                text.setText("Monday");
                break;

        }
    }
}