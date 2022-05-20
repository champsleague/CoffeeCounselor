package com.gachon.coffeecounselor;

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

        Button menuInfo = findViewById(R.id.button);

        menuInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CafeinfoActivity.class);
                intent.putExtra("code",0);
                startActivity(intent);
            }
        });
        Button getRecommand = findViewById(R.id.button2);
        getRecommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CafeinfoActivity.class);
                intent.putExtra("code",1);
                startActivity(intent);
            }
        });
    }
}