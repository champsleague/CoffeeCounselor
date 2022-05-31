package com.gachon.coffeecounselor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gachon.coffeecounselor.activity5.Recommendation;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    //private DatabaseReference dbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button menuInfo = findViewById(R.id.button);

        //dbRef = FirebaseDatabase.getInstance().getReference("message");
        //dbRef.setValue("Success"); //add message:success to database when launching app

        menuInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CafeinfoActivity.class);
                intent.putExtra("code",0);
                startActivity(intent);
            }
        });
        Button getRecommend = findViewById(R.id.button2);
        getRecommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Recommendation.class);
                intent.putExtra("code",1);
                startActivity(intent);
            }
        });
    }
}