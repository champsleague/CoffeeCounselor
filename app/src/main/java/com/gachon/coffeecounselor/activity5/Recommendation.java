package com.gachon.coffeecounselor.activity5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.gachon.coffeecounselor.R;

public class Recommendation extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);

        RadioGroup userInfo1 = findViewById(R.id.userInfo1);
        RadioButton age1 = findViewById(R.id.age1);
        RadioButton age2 = findViewById(R.id.age2);
        RadioButton age3 = findViewById(R.id.age3);
        RadioButton age4 = findViewById(R.id.age4);

        RadioGroup userInfo2 = findViewById(R.id.userInfo2);
        RadioButton gender1 = findViewById(R.id.gender1);
        RadioButton gender2 = findViewById(R.id.gender2);

        RadioGroup userInfo3 = findViewById(R.id.userInfo3);
        RadioButton feeling1 = findViewById(R.id.feeling1);
        RadioButton feeling2 = findViewById(R.id.feeling2);
        RadioButton feeling3 = findViewById(R.id.feeling3);

        Button submit = findViewById(R.id.submit);

        int sugar1=0, caffeine1=0;
        int radioId1 = userInfo1.getCheckedRadioButtonId();
        if(age1.getId() == radioId1){
            sugar1 += 90;
            caffeine1 += 50;
        }
        if(age2.getId() == radioId1){
            sugar1 += 50;
            caffeine1 += 150;
        }
        if(age3.getId() == radioId1){
            sugar1 += 20;
            caffeine1 += 150;
        }
        if(age4.getId() == radioId1){
            sugar1 += 20;
            caffeine1 += 50;
        }

        int sugar2=0, caffeine2=0;
        int radioId2 = userInfo2.getCheckedRadioButtonId();
        if(gender1.getId() == radioId2){
            sugar2 += 90;
            caffeine2 += 50;
        }
        if(gender2.getId() == radioId2){
            sugar2 += 50;
            caffeine2 += 150;
        }

        int sugar3=0, caffeine3=0;
        int radioId3 = userInfo3.getCheckedRadioButtonId();
        if(feeling1.getId() == radioId3){
            sugar3 += 90;
            caffeine3 += 50;
        }
        if(feeling2.getId() == radioId3){
            sugar3 += 50;
            caffeine3 += 150;
        }
        if(feeling3.getId() == radioId3){
            sugar3 += 20;
            caffeine3 += 150;
        }

        int sugar = (sugar1+sugar2+sugar3)/3;
        int caffeine = (caffeine1+caffeine2+caffeine3)/3;
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), SubmitResult.class);
                Bundle bundle1 = new Bundle();
                bundle1.putInt("userSugar", sugar);
                bundle1.putInt("userCaffeine", caffeine);
                intent.putExtras(bundle1);
                startActivity(intent);

            }
        });

    }
}









