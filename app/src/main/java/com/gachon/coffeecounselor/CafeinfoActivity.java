package com.gachon.coffeecounselor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.gachon.coffeecounselor.activity3.MenuActivity;
import com.gachon.coffeecounselor.activity5.Recommendation;

public class CafeinfoActivity extends AppCompatActivity {
    Intent intent;
    public static int cafe_change; //star=0;twosome=1;mega=2;ediya=3;pascucci=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeinfo);

        intent = getIntent();
        int code =  intent.getIntExtra("code",0);

        ImageButton starbucks  = findViewById(R.id.starbucksButton);
        starbucks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code==0) {
                    Intent intent = new Intent(CafeinfoActivity.this, MenuActivity.class);
                    startActivity(intent);
                    cafe_change=0;
                } else {
                    Intent intent = new Intent(CafeinfoActivity.this, Recommendation.class);
                    startActivity(intent);
                }
            }
        });

        ImageButton twosome  = findViewById(R.id.twosomeButton);
        twosome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code==0) {
                    Intent intent = new Intent(CafeinfoActivity.this, MenuActivity.class);
                    startActivity(intent);
                    cafe_change=1;
                } else {
                    Intent intent = new Intent(CafeinfoActivity.this, Recommendation.class);
                    startActivity(intent);
                }
            }
        });

        ImageButton megacoffee  = findViewById(R.id.megacoffeeButton);
        megacoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code==0) {
                    Intent intent = new Intent(CafeinfoActivity.this, MenuActivity.class);
                    startActivity(intent);
                    cafe_change=2;
                } else {
                    Intent intent = new Intent(CafeinfoActivity.this, Recommendation.class);
                    startActivity(intent);
                }
            }
        });

        ImageButton ediya  = findViewById(R.id.ediyaButton);
        ediya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code==0) {
                    Intent intent = new Intent(CafeinfoActivity.this, MenuActivity.class);
                    startActivity(intent);
                    cafe_change=3;
                } else {
                    Intent intent = new Intent(CafeinfoActivity.this, Recommendation.class);
                    startActivity(intent);
                }
            }
        });

        ImageButton pascucci  = findViewById(R.id.pascucciButton);
        pascucci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code==0) {
                    Intent intent = new Intent(CafeinfoActivity.this, MenuActivity.class);
                    startActivity(intent);
                    cafe_change=4;
                } else {
                    Intent intent = new Intent(CafeinfoActivity.this, Recommendation.class);
                    startActivity(intent);
                }
            }
        });


    }
}