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
    ImageView img;
    TextView txtTitle, txtCalorie, txtInfo, txtCaffeine, txtRating;
    RatingBar rateBar;
    String imgURLTmp, titleTmp, calorieTmp, infoTmp, cafeURLTmp;
    float ratingTmp;
    String rate;
    Document doc;
    Elements image, title, Nutrition;
    Element info;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mega_coffee);

        final Bundle bundle = new Bundle();
        img = findViewById(R.id.imgView);
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
                        case 1001 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();

                            image = doc.select("tr#faq0 td table tbody tr td img");
                            imgURLTmp = image.attr("src");
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
                        case  1002 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();

                            image = doc.select("tr#faq1 td table tbody tr td img");
                            imgURLTmp = image.attr("src");
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

                        case  1003 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();

                            image = doc.select("tr#faq2 td table tbody tr td img");
                            imgURLTmp = image.attr("src");
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
                        case  1004 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();

                            image = doc.select("tr#faq3 td table tbody tr td img");
                            imgURLTmp = image.attr("src");
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
                        case  1005 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq0 td table tbody tr td img");
                            imgURLTmp = image.attr("src");
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
                        case  1006 :
                            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

                            image = doc.select("tr#faq1 td table tbody tr td img");
                            imgURLTmp = image.attr("src");
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
                        default:
                            break;


                    }


                    bundle.putString("image", imgURLTmp);
                    bundle.putString("title", titleTmp);
                    bundle.putString("calorie", calorieTmp);
                    bundle.putString("info", infoTmp);
                    bundle.putString("caffeine", cafeURLTmp);
                    bundle.putString("rate", rate);
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
            txtTitle.setText(bundle.getString("title"));
            txtCalorie.setText(bundle.getString("calorie"));
            txtInfo.setText(bundle.getString("info"));
            txtCaffeine.setText(bundle.getString("caffeine"));
//            txtRating.setText(bundle.getString("rate"));
        }
    };
}