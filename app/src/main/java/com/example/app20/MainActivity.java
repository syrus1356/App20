package com.example.app20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMe(View view) {

        //Button btn1 = findViewById(R.id.btn1);

        Intent myIntent = new Intent(this , Main2Activity.class);
        //finish(); //close current activity
        startActivity(myIntent);






    }
}
