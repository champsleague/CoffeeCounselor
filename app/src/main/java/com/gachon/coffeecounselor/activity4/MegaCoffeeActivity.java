package com.gachon.coffeecounselor.activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
//import android.support.annotation.NonNull;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.os.Handler;


import com.gachon.coffeecounselor.R;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;

public class MegaCoffeeActivity extends AppCompatActivity {
    Intent intent;
    ImageView img,recipe;
    TextView txtTitle, txtCalorie, txtInfo, txtCaffeine, txtRating;
    RatingBar rateBar;
    String imgURLTmp, titleTmp, calorieTmp, infoTmp, cafeURLTmp, rate;
    float ratingTmp;
    Document doc;
    Elements image, title, Nutrition;
    Element info;
    int index, recipeTmp = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mega_coffee);

        final Bundle bundle = new Bundle();
        img = findViewById(R.id.imgView);
        img.setClipToOutline(true);
        recipe = findViewById(R.id.recipe);
        txtTitle = findViewById(R.id.txtTitle);
        txtCalorie = findViewById(R.id.txtCalorie);
        txtInfo = findViewById(R.id.txtInfo);
        txtCaffeine = findViewById(R.id.txtCaffeine);
        rateBar = (RatingBar) findViewById(R.id.rating_bar);
        //txtRating = findViewById(R.id.txtRating);
        intent = getIntent();
        int code =  intent.getIntExtra("code2",0);


        new Thread(){
            @Override
            public void run() {
                try {
                    switch (code){
                        //coffee
                        case 1001 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();

                            image = doc.select("tr#faq5 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq5 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq5 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq5 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/americano","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1002 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();

                            image = doc.select("tr#faq6 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq6 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq6 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/americano","drawable", "com.gachon.coffeecounselor");

                            break;

                        case  1003 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();

                            image = doc.select("tr#faq7 td table tbody tr td img");
                            imgURLTmp =  image.attr("src");
                            title = doc.select("tr#faq7 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq7 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/hazelnutamericano","drawable", "com.gachon.coffeecounselor");

                            break;
                        case  1004 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();

                            image = doc.select("tr#faq8 td table tbody tr td img");
                            imgURLTmp =  image.attr("src");
                            title = doc.select("tr#faq8 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq8 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/vanillaamericano","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1005 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();

                            image = doc.select("tr#faq9 td table tbody tr td img");
                            imgURLTmp =  image.attr("src");
                            title = doc.select("tr#faq9 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq9 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/honeyamericano","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1006 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq10 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq10 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq10 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/cubelatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1007 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq11 td table tbody tr td img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("tr#faq11 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq11 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq11 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/cafelatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1008 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq12 td table tbody tr td img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("tr#faq12 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq12 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq12 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/cappuccino","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1009 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq13 td table tbody tr td img");
                            imgURLTmp =image.attr("src");

                            title = doc.select("tr#faq13 td table tbody tr td table tbody tr td.text20brown strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq13 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq13 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/vanillalatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1010 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq14 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq14 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq14 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq14 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/hazelnutlatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1011 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq15 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq15 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq15 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq15 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/caramelmacchiato","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1012 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq16 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq16 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq16 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq16 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/cafemocha","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1013 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq17 td table tbody tr td img");
                            imgURLTmp =  image.attr("src");
                            title = doc.select("tr#faq17 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq17 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq17 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/mintcafemocha","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1014 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq18 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq18 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq18 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq18 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/tiramisulatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1015 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu9").get();

                            image = doc.select("tr#faq0 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq0 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq0 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/coldbrew","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1016 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu9").get();

                            image = doc.select("tr#faq2 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq2 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq2 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/coldbrewlatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1017 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu9").get();

                            image = doc.select("tr#faq4 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" +image.attr("src");
                            title = doc.select("tr#faq4 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq4 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq4 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/decaffeinated","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1018 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu9").get();

                            image = doc.select("tr#faq6 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq6 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq6 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/decaffeinatedlatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        //coffee 끝
                        //beverage
                        case  1019 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq30 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq30 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq30 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq30 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/strawberrylatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1020 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq31 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq31 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq31 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq31 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/megachoco","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1021 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq32 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq32 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq32 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq32 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/icechoco","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1022 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq33 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq33 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq33 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq33 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/mintcreamchoco","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1023 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq34 td table tbody tr td img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("tr#faq34 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq34 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq34 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/greentealatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1024 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq35 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq35 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq35 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq35 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/milktea","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1025 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq36 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq36 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq36 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq36 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/toffeenutlatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1026 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq37 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq37 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq37 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq37 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/sweetpotatolatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1027 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq38 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq38 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq38 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq38 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/grainlatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1028 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq39 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq39 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq39 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq39 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1029 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu11").get();

                            image = doc.select("tr#faq0 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq0 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq0 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/blacksugarbubblelatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1030 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu11").get();

                            image = doc.select("tr#faq1 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq1 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq1 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/blacksugarbubblegreentea","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1031 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu11").get();

                            image = doc.select("tr#faq2 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq2 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq2 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/blacksugarbubblemilktea","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1032 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu11").get();

                            image = doc.select("tr#faq3 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq3 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq3 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/blacksugarlatte","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1033 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu11").get();

                            image = doc.select("tr#faq4 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq4 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq4 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq4 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/blacksugarmilktea","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1034 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();

                            image = doc.select("tr#faq11 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq11 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq11 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq11 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/plainpong","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1035 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();

                            image = doc.select("tr#faq12 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq12 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq12 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq12 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/strawberrypong","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1036 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();

                            image = doc.select("tr#faq7 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq7 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq7 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/bananapong","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1037 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();

                            image = doc.select("tr#faq3 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq3 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq3 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/cookiefrappe","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1038 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();

                            image = doc.select("tr#faq10 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq10 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq10 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/strawberrycookiefrappe","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1039 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();

                            image = doc.select("tr#faq14 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq14 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq14 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq14 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/coffeefrappe","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1040 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();

                            image = doc.select("tr#faq9 td table tbody tr td img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("tr#faq9 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq9 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/unicornfrappe","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1041 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();

                            image = doc.select("tr#faq0 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq0 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq0 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1042 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();

                            image = doc.select("tr#faq2 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq2 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq2 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1043 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();

                            image = doc.select("tr#faq1 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq1 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq1 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1044 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();

                            image = doc.select("tr#faq8 td table tbody tr td img");
                            imgURLTmp =  image.attr("src");
                            title = doc.select("tr#faq8 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq8 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/strawberrycheeseholic","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1045 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();

                            image = doc.select("tr#faq13 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq13 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq13 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq13 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            recipeTmp = getResources().getIdentifier("@drawable/strawberryyogurtfrappe","drawable", "com.gachon.coffeecounselor");
                            break;
                        case  1046 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu4").get();

                            image = doc.select("tr#faq0 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq0 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq0 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1047 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu4").get();

                            image = doc.select("tr#faq1 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" +image.attr("src");
                            title = doc.select("tr#faq1 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq1 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1048 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu4").get();

                            image = doc.select("tr#faq2 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq2 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq2 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1049 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu4").get();

                            image = doc.select("tr#faq3 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq3 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq3 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1050 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();

                            image = doc.select("tr#faq2 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq2 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq2 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1051 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();

                            image = doc.select("tr#faq3 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq3 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq3 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1052 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();

                            image = doc.select("tr#faq4 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq4 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq4 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq4 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1053 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();

                            image = doc.select("tr#faq8 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq8 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq8 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1054 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();

                            image = doc.select("tr#faq9 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq9 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq9 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1055 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();

                            image = doc.select("tr#faq0 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq0 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq0 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1056 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();

                            image = doc.select("tr#faq1 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq1 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq1 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1057 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();

                            image = doc.select("tr#faq10 td table tbody tr td img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("tr#faq10 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq10 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1058 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();

                            image = doc.select("tr#faq5 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq5 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq5 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq5 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1059 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();

                            image = doc.select("tr#faq7 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq7 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq7 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1060 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();

                            image = doc.select("tr#faq6 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq6 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq6 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        //beverage 끝
                        //tea
                        case  1061 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();

                            image = doc.select("tr#faq11 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq11 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq11 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq11 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1062 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();

                            image = doc.select("tr#faq12 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq12 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq12 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq12 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1063 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();

                            image = doc.select("tr#faq21 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq21 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq21 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq21 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1064 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();

                            image = doc.select("tr#faq14 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq14 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq14 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq14 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1065 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();

                            image = doc.select("tr#faq22 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq22 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq22 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq22 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1066 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();

                            image = doc.select("tr#faq10 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq10 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq10 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1067 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();

                            image = doc.select("tr#faq13 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq13 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq13 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq13 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1068 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();

                            image = doc.select("tr#faq20 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq20 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq20 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq20 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1069 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();

                            image = doc.select("tr#faq23 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq23 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq23 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq23 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1070 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();

                            image = doc.select("tr#faq24 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq24 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq24 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq24 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1071 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();

                            image = doc.select("tr#faq25 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq25 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq25 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq25 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                            //tea 끝
                        //dessert
                        case  1072 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq21 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq21 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq21 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq21 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1073 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq22 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq22 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq22 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq22 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1074 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq23 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq23 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq23 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq23 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1075 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq6 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq6 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq6 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1076 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq7 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq7 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq7 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1077 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq8 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq8 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq8 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1078 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq18 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq18 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq18 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq18 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1079 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq19 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq19 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq19 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq19 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1080 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq20 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq20 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq20 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq20 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1081 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq11 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq11 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq11 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq11 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1082 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq3 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq3 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq3 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1083 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq4 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq4 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq4 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq4 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1084 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq5 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq5 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq5 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq5 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1085:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq10 td table tbody tr td img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("tr#faq10 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq10 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1086:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq12 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq12 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq12 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq12 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1087:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq9 td table tbody tr td img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("tr#faq9 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq9 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1088:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq16 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq16 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq16 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq16 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1089:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq17 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq17 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq17 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq17 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1090:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq24 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq24 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq24 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq24 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1091:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq0 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq0 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq0 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1092:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq1 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq1 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq1 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1093:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq2 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq2 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq2 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1094:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq13 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq13 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq13 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq13 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1095:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq14 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq14 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq14 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq14 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1096:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq15 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq15 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq15 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq15 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1097:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq25 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq25 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq25 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq25 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1098:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq26 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq26 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq26 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq26 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1099:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq27 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq27 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq27 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq27 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1100:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq28 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq28 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq28 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq28 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1101:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq29 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq29 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq29 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq29 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1102:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq30 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq30 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq30 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq30 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1103:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq31 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq31 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq31 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq31 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1104:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq32 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq32 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq32 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq32 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1105:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq33 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq33 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq33 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq33 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1106:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq34 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq34 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq34 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq34 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1107:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq35 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq35 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq35 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq35 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1108:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq36 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq36 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq36 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq36 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1109:
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();

                            image = doc.select("tr#faq37 td table tbody tr td img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("tr#faq37 td table tbody tr td table tbody tr td strong");
                            titleTmp = title.text();
                            Nutrition = doc.select("tr#faq37 td table tbody tr td table tr[class=text13explain] td");
                            //List<Element> nutritionsList = new ArrayList<>();
                            index = 0;
                            for(Element nutrition : Nutrition){
                                //nutritionsList.add(nutrition);
                                if(index == 6)  calorieTmp = nutrition.text();
                                if(index ==11)  cafeURLTmp = nutrition.text();
                                index += 1;
                            }
                            info = doc.select("tr#faq37 td table tbody tr td table tbody tr td[class=text13explain]").first();
                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;









                        default:
                            break;


                    }


                    bundle.putString("image", imgURLTmp);
                    bundle.putString("title", titleTmp);
                    bundle.putString("calorie", calorieTmp);
                    bundle.putString("info", infoTmp);
                    bundle.putString("caffeine", cafeURLTmp);
                    bundle.putString("rate", rate);
                    bundle.putInt("recipe",recipeTmp);
                    Message msg = handler.obtainMessage();
                    msg.setData(bundle);
                    handler.sendMessage(msg);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }



    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            Bundle bundle = msg.getData();
            Picasso.get()
                    .load(bundle.getString("image"))
                    .into(img);
            Picasso.get()
                    .load(bundle.getInt("recipe"))
                    .into(recipe);
            txtTitle.setText(bundle.getString("title"));
            txtCalorie.setText(bundle.getString("calorie"));
            txtInfo.setText(bundle.getString("info"));
            txtCaffeine.setText(bundle.getString("caffeine"));
//            txtRating.setText(bundle.getString("rate"));
        }
    };
}