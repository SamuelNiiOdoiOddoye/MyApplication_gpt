package com.example.myapplication_gpt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private void saveTask(){
        String taskDescription = editTextTaskDescription.getText().toString();
        if (!taskDescription.isEmpty()){
            intent resultIntent = new Intent();
            resultIntent.put
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}