package com.example.greetingsapp;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn;
    TextView title;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.btn);
        title = findViewById(R.id.title);
        btn.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            String inputName = editText.getText().toString();
            if(inputName.length() == 0) inputName = "MysteryMan";
            Toast.makeText(
                    MainActivity.this,
                    "Welcome " + inputName + " to my app",
                    Toast.LENGTH_LONG
            ).show();
        }
        });


    }
}