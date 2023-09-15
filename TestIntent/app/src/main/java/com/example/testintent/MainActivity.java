package com.example.testintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        button = findViewById(R.id.button);





    }

    public void print(View view){

        textView.setText("Hello working");




        Toast.makeText(this, "working", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);





    }
}