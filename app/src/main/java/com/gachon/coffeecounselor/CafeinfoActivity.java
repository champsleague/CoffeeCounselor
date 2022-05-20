package com.gachon.coffeecounselor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.gachon.coffeecounselor.activity3.MenuActivity;
import com.gachon.coffeecounselor.activity5.RecommandActivity;

public class CafeinfoActivity extends AppCompatActivity {
    Intent intent;
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
                    Intent intent2 = new Intent(CafeinfoActivity.this, MenuActivity.class);
                    startActivity(intent2);
                } else {
                    Intent intent2 = new Intent(CafeinfoActivity.this, RecommandActivity.class);
                    startActivity(intent2);
                }
            }
        });

        ImageButton twosome  = findViewById(R.id.twosomeButton);
        twosome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code==0) {
                    Intent intent3 = new Intent(CafeinfoActivity.this, MenuActivity.class);
                    startActivity(intent3);
                } else {
                    Intent intent2 = new Intent(CafeinfoActivity.this, RecommandActivity.class);
                    startActivity(intent2);
                }
            }
        });

        ImageButton megacoffee  = findViewById(R.id.megacoffeeButton);
        megacoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code==0) {
                    Intent intent4 = new Intent(CafeinfoActivity.this, MenuActivity.class);
                    startActivity(intent4);
                } else {
                    Intent intent2 = new Intent(CafeinfoActivity.this, RecommandActivity.class);
                    startActivity(intent2);
                }
            }
        });

        ImageButton ediya  = findViewById(R.id.ediyaButton);
        ediya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code==0) {
                    Intent intent5 = new Intent(CafeinfoActivity.this, MenuActivity.class);
                    startActivity(intent5);
                } else {
                    Intent intent2 = new Intent(CafeinfoActivity.this, RecommandActivity.class);
                    startActivity(intent2);
                }
            }
        });

        ImageButton pascucci  = findViewById(R.id.pascucciButton);
        pascucci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code==0) {
                    Intent intent6 = new Intent(CafeinfoActivity.this, MenuActivity.class);
                    startActivity(intent6);
                } else {
                    Intent intent2 = new Intent(CafeinfoActivity.this, RecommandActivity.class);
                    startActivity(intent2);
                }
            }
        });


    }
}