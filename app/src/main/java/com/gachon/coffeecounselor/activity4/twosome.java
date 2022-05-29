package com.gachon.coffeecounselor.activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
//import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.os.Handler;


import com.gachon.coffeecounselor.R;
import com.squareup.picasso.Picasso;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class twosome extends AppCompatActivity {

    ImageView img;
    TextView txtTitle, txtCalorie, txtInfo, txtCaffeine, txtRating;
    RatingBar rate;
    String imgURLTmp, titleTmp, calorieTmp, infoTmp, cafeURLTmp;
    float ratingTmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twosome);

        final Bundle bundle = new Bundle();
        img = findViewById(R.id.imgView);
        txtTitle = findViewById(R.id.txtTitle);
        txtCalorie = findViewById(R.id.txtCalorie);
        txtInfo = findViewById(R.id.txtInfo);
        txtCaffeine = findViewById(R.id.txtCaffeine);
        rate = (RatingBar) findViewById(R.id.rating_bar);
        //txtRating = findViewById(R.id.txtRating);

        new Thread(){
            @Override
            public void run() {
                try {
                    Document doc = Jsoup.connect("https://mo.twosome.co.kr/mn/menuInfoList.do?grtCd=1&pMidCd=01").get();

                    Elements image = doc.select("ul.ui-goods-list-default col-2 mt-40 li a div.thum-img img");
                    imgURLTmp = image.attr("src");
                    Elements title = doc.select("ul.ui-goods-list-default col-2 mt-40 li a p.menu-title");
                    titleTmp = title.text();
                    //Element calorie = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain]");
                    //calorieTmp = calorie.text();
                    Element info = doc.select("ul.ui-goods-list-default col-2 mt-40 li a p.menu-title").first();
                    infoTmp = info.text();
                    //Element caffeine = doc.select("tr#faq0 td table tbody tr td table tbody tr td[class=text13explain]").last();
                    //cafeURLTmp = caffeine.attr("src");

                    ratingTmp = rate.getRating();
                    String rate = Float.toString(ratingTmp);

                    bundle.putString("image", imgURLTmp);
                    bundle.putString("title", titleTmp);
                    //bundle.putString("calorie", calorieTmp);
                    bundle.putString("info", infoTmp);
                    //bundle.putString("caffeine", cafeURLTmp);
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
            //txtCalorie.setText(bundle.getString("calorie"));
            txtInfo.setText(bundle.getString("info"));
            //txtCaffeine.setText(bundle.getString("caffeine"));
            //txtRating.setText(bundle.getString("rate"));
        }
    };
}
