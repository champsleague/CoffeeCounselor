package com.gachon.coffeecounselor.activity5;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gachon.coffeecounselor.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;


public class SubmitResult extends AppCompatActivity {

    Intent intent;
    Document doc;
    Elements Nutrition;
    String sugarTmp, caffeineTmp;
    int index;
    // arrays to save X:caffeine, Y=sugar
    String[] X = new String[50];
    String[] Y = new String[50];
    int cnt1 = 0, cnt2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_result);

        final Bundle bundle = new Bundle();

        new Thread(){
            @Override
            public void run(){
                try {
                    // menu1
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();
                    Nutrition = doc.select("tr#faq5 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }

                    // menu3
                    /*
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();
                    for(int i=10;i<=14;i++){
                    }
                    for(int i=20;i<=25;i++){
                    }
                    */

                    // menu4
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu4").get();
                    Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }

                    // menu5
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();
                    Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq4 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq5 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }

                    // menu6
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();
                    Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq11 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq12 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq13 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq14 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }


                    /*
                    // menu7
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();
                    for(int i=0;i<=37;i+=2){

                    }

                    // menu9
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu9").get();
                    for(int i=0;i<=6;i+=2){

                    }

                    // menu10
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();
                    for(int i=10;i<=18;i++){

                    }
                    for(int i=30;i<=39;i++){

                    }

                    // menu11
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu11").get();
                    for(int i=0;i<=4;i++){

                    }
                    */


                    // get appropriate userSugar, userCaffeine value from Recommendation class
                    intent = getIntent();
                    int userSugar = intent.getIntExtra("userSugar", 0);
                    int userCaffeine = intent.getIntExtra("userCaffeine", 0);

                    CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\chado\\sample.csv"));

                    // write data using CSVWriter
                    String[] entries0 = {"sugar", "caffeine"};
                    writer.writeNext(entries0);
                    for(int i=0;i<X.length;i++){
                        String[] entries1 = {X[i], Y[i]};
                        writer.writeNext(entries1);
                    }

                    // write user data using CSVWriter
                    String[] entries2 = {Integer.toString(userSugar), Integer.toString(userCaffeine)};
                    writer.writeNext(entries2);

                    writer.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }.start();


    }




}
