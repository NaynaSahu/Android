package com.example.samplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText name, password;
    private TextView mesg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextText3);
        password = findViewById(R.id.editTextText4);
        mesg = findViewById(R.id.textView);


    }


    public void submit(View view) {


        String a = name.getText().toString();


        if (name.getText().toString().equals("a") && password.getText().toString().equals("a")) {

            Intent in = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(in);
        } else {

            mesg.setText("Invalid Login or password");


        }

    }

}