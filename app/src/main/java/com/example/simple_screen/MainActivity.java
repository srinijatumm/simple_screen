package com.example.simple_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private android.widget.Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (android.widget.Button) findViewById(R.id.button);
        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                openActivity2();
            }

        });

    }
    public void openActivity2(){

        android.content.Intent intent = new android.content.Intent(this,Activity2.class);
        startActivity(intent);
    }
}