package com.gachon.coffeecounselor.activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


import com.gachon.coffeecounselor.CoffeeInfo;

public class AmericanoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_americano);

        final ImageView img = findViewById(R.id.imgView);
        final TextView txtTitle = findViewById(R.id.txtTitle);
        final TextView txtPrice = findViewById(R.id.txtPrice);
        final TextView txtInfo = findViewById(R.id.txtInfo);
        final TextView txtCaffe = findViewById(R.id.txtCaffe);
        final RatingBar ratingBar = findViewById(R.id.rating_bar);
        final TextView txtRating = findViewById(R.id.txtRating);
        new Thread(new Runnable() {
            final CoffeeInfo coffee = new CoffeeInfo();
            @Override
            public void run() {
                try {
                    Document doc = Jsoup.connect("https://www.starbucks.co.kr/menu/drink_view.do?product_cd=9200000002487")
                            .timeout(6000).get();
                    Elements image = doc.select("div.product_big_pic");
                    Elements title = doc.select("#text");
                    Elements price = doc.select("");
                    Elements info = doc.select("p.t1");
                    Elements caffe = doc.select("");
                    Elements rating = doc.select("");
                    coffee.setTitle(title.text());
                    coffee.setImageUrl(image.attr("src"));
                    coffee.setPrice(price.text());
                    coffee.setInfo(info.text());
                    coffee.setCaffe(caffe.text());
                    coffee.setRating(Float.parseFloat(rating.text()));

                } catch (Exception ex) {}
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Picasso.get()
                                .load(coffee.getImageUrl())
                                .into(img);
                        txtTitle.setText(coffee.getTitle());
                        txtPrice.setText(coffee.getPrice());
                        txtInfo.setText(coffee.getInfo());
                        txtCaffe.setText(coffee.getCaffe());
                        ratingBar.setRating(coffee.getRating());
                        txtRating.setText(coffee.getRating()+"");

                    }
                });

            }
        }).start();
    }
}