package com.gachon.coffeecounselor.activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
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

public class AmericanoActivity extends AppCompatActivity {
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_americano);

        final Bundle bundle = new Bundle();
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
                    Document doc = Jsoup.connect("https://m.search.naver.com/search.naver?sm=mtp_hty.top&where=m&query=%EC%84%9C%EC%9A%B8+%EB%82%A0%EC%94%A8")
                            .timeout(6000).get();

                    //Document doc = Jsoup.connect("https://www.starbucks.co.kr/menu/drink_view.do?product_cd=9200000002487")
                          //  .timeout(6000).get();
                    Elements image = doc.select("img[class=lz-zoomImg]");
                    List<String> imageUrls = new ArrayList<>();

                    for(Element img : image) {
                        imageUrls.add(img.attr("abs:data-src"));
                    }
                    System.out.println(imageUrls); // 이미지 URL들.
                    //Elements title = doc.select(".myAssignZone");
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
                    String  tem = title.get(0).text().substring(5);
                    bundle.putString("temperature", tem);

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
    Handler handler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(@NonNull Message msg) {
            Bundle bundle = msg.getData();    //new Thread에서 작업한 결과물 받기
            TextView textView = findViewById(R.id.txtTitle);
            textView.setText(bundle.getString("temperature"));    //받아온 데이터 textView에 출력
        }
    };
}*/

    String nums;                    //복권 번호을 저장할 변수
    TextView txtTitle, txtPrice, txtInfo, txtCafe, txtRating;
    String titleTmp, priceTmp, infoTmp,cafeTmp,ratingTmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_americano);


        final Bundle bundle = new Bundle();
        ImageView img = findViewById(R.id.imgView);
        txtTitle = findViewById(R.id.txtTitle);
        txtPrice = findViewById(R.id.txtPrice);
        txtInfo = findViewById(R.id.txtInfo);
        txtCafe = findViewById(R.id.txtCafe);
       // RatingBar c = findViewById(R.id.rating_bar);
        txtRating = findViewById(R.id.txtRating);

        new Thread(){
            @Override
            public void run() {
                Document doc = null;
                try {
                    //doc = Jsoup.connect("https://dhlottery.co.kr/common.do?method=main").get();
                    //doc = Jsoup.connect("https://www.starbucks.co.kr/menu/drink_view.do?product_cd=9200000002487").get();
                    Connection.Response response = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1")
                            .method(Connection.Method.GET)
                            .execute();
                    doc = response.parse();
                   /* Elements image = doc.select("img[class=lz-zoomImg]");
                    List<String> imageUrls = new ArrayList<>();

                    for(Element img : image) {
                        imageUrls.add(img.attr("abs:data-src"));
                    }
                    System.out.println(imageUrls); // 이미지 URL들.*/
                    Elements title = doc.select("tr#faq0 td table tbody tr td table tbody tr td strong");
                    titleTmp = title.text();
                   /* Elements price = doc.select("");
                    priceTmp = price.text();
                    Elements info = doc.select("p.t1");
                    infoTmp = info.text();
                    Elements cafe = doc.select("");
                    cafeTmp = cafe.text();
                    Elements rating = doc.select("");
                    ratingTmp = rating.text();*/


                    /*Elements contents = doc.select("#lottoDrwNo");          //회차 id값 가져오기
                    nums += contents.text() +"회 :";

                    for(int i = 1; i < 7; i++){
                        contents = doc.select("#drwtNo"+i);                 //복권 번호 6개 가져오기
                        nums += " "+contents.text();
                    }
                    nums += doc.select("#bnusNo").text();                   //보너스 번호 contents 변수를 사용하지 않고 가져오는 방법
*/
                    bundle.putString("title", titleTmp);
                    /*bundle.putString("price", priceTmp);
                    bundle.putString("info", infoTmp);
                    bundle.putString("cafe", cafeTmp);
                    bundle.putString("rating", ratingTmp)*/
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
            txtTitle.setText(bundle.getString("title"));
            //txtPrice.setText(bundle.getString("price]"));
           // txtInfo.setText(bundle.getString("info"));
           // txtCafe.setText(bundle.getString("cafe"));
          //  txtRating.setText(bundle.getString("Rating"));
        }
    };
}

