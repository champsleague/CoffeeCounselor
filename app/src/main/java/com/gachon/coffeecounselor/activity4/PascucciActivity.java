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

public class PascucciActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_pascucci);

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
                        //coffee > italian coffee 시작 (4개)
                        case 1001 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010010").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = "https://www.caffe-pascucci.co.kr" + image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq5 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq5 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1002 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010010").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq6 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;

                        case  1003 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010010").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp =  image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq7 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1004 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010010").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp =  image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq8 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;


//                            coffee > Coffee Variation(Hot) 시작 (8개)
                        case  1005 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp =  image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq9 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1006 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = "http://www.megacoffee.me" + image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq10 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1007 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq11 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq11 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1008 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq12 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq12 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();

                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1009 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp =image.attr("src");

                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq13 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq13 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1010 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq14 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq14 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1011 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq15 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq15 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1012 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq16 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq16 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;



//                        coffee > Coffee Variation(ICED) 시작 (8개)
                        case  1013 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq17 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq17 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1014 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq18 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq18 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1015 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq0 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1016 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq2 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1017 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq4 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq4 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1018 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq6 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1019 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq30 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq30 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1020 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq31 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq31 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;



//                      coffee > cold brew 시작 (9개)
                        case  1021 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq32 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq32 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1022 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq33 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq33 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1023 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq34 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq34 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1024 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq35 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq35 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1025 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq36 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq36 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1026 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq37 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq37 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1027 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq38 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq38 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1028 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq39 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq39 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1029 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq0 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;


//                      beverage > seasonal 시작 (13개)
                        case  1030 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq1 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1031 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq2 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1032 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq3 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1033 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq4 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq4 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1034 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq11 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq11 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1035 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq12 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq12 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1036 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq7 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1037 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq3 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1038 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq10 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1039 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq14 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq14 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1040 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq9 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1041 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq0 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1042 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq2 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;



//                        beverage > Italian Granita 시작 (12개)
                        case  1043 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq1 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1044 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq8 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1045 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq13 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq13 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1046 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq0 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1047 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq1 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1048 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq2 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1049 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq3 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1050 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq2 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1051 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq3 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1052 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq4 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq4 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1053 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq8 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1054 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200020").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq9 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;


//                      Tea 시작 (11개)
                        case  1055 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq0 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1056 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq1 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1057 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq10 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1058 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq5 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq5 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1059 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq7 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1060 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq6 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1061 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq11 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq11 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1062 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq12 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq12 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1063 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq21 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq21 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1064 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq14 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq14 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1065 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00200030").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq22 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq22 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;



//                      Dessert 시작 (16개)
                        case  1066 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq10 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1067 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq13 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq13 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1068 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq20 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq20 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1069 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq23 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq23 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1070 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq24 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq24 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1071 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq25 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq25 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1072 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq21 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq21 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1073 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq22 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq22 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1074 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq23 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq23 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1075 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq6 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1076 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq7 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1077 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq8 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1078 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=003000407").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq18 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq18 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1079 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq19 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq19 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1080 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq20 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq20 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
                            ratingTmp = rateBar.getRating();
                            rate = Float.toString(ratingTmp);
                            break;
                        case  1081 :
                            doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00300040").get();

                            image = doc.select("div.productWr a.product figure div.proListImg img");
                            imgURLTmp = image.attr("src");
                            title = doc.select("div.productWr a.product figure figcaption h2");
                            titleTmp = title.text();
//                            Nutrition = doc.select("tr#faq11 td table tbody tr td table tr[class=text13explain] td");
//                            //List<Element> nutritionsList = new ArrayList<>();
//                            index = 0;
//                            for(Element nutrition : Nutrition){
//                                //nutritionsList.add(nutrition);
//                                if(index == 6)  calorieTmp = nutrition.text();
//                                if(index ==11)  cafeURLTmp = nutrition.text();
//                                index += 1;
//                            }
//                            info = doc.select("tr#faq11 td table tbody tr td table tbody tr td[class=text13explain]").first();
//                            infoTmp = info.text();
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