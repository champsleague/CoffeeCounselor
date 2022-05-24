package com.gachon.coffeecounselor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase fbdt = FirebaseDatabase.getInstance();
    private DatabaseReference dbref = fbdt.getReference();

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
        Button testinput = findViewById(R.id.test_button);
        testinput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}