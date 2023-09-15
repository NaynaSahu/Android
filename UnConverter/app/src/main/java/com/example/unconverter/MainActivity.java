package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextText);
       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hi button is working", Toast.LENGTH_SHORT).show();


                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                Double pound = 2.205 * kg;
                textView.setText("the pound value is: "+pound);

            }
        });*/

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = editText.getText().toString();
                int value = Integer.parseInt(input);

                double pound = value *2.205;

                textView.setText("Ans. = " + pound);

            }
        });



    }
    /*public void calculate(View v){
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        Double pound = 2.205 * kg;
        textView.setText("the pound value is: "+pound);


    }*/


}