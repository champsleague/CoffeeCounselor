package com.gachon.coffeecounselor.activity3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.os.Handler;
import android.widget.TextView;

import com.gachon.coffeecounselor.activity4.MegaCoffeeActivity;
import com.gachon.coffeecounselor.activity4.PascucciActivity;
import com.squareup.picasso.Picasso;
import com.gachon.coffeecounselor.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class PascucciCoffeeFragment extends Fragment {

    String[] imgArr = new String[30];
    String[] txtArr = new String[30];

    ImageButton[] i = new ImageButton[30];
    TextView[] text = new TextView[30];
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pascucci_coffee, container, false);
        final Bundle bundle = new Bundle();

        i[1] = v.findViewById(R.id.b1);
        i[2] = v.findViewById(R.id.b2);
        i[3] = v.findViewById(R.id.b3);
        i[4] = v.findViewById(R.id.b4);
        i[5] = v.findViewById(R.id.b5);
        i[6] = v.findViewById(R.id.b6);
        i[7] = v.findViewById(R.id.b7);
        i[8] = v.findViewById(R.id.b8);
        i[9] = v.findViewById(R.id.b9);
        i[10] = v.findViewById(R.id.b10);
        i[11] = v.findViewById(R.id.b11);
        i[12] = v.findViewById(R.id.b12);
        i[13] = v.findViewById(R.id.b13);
        i[14] = v.findViewById(R.id.b14);
        i[15] = v.findViewById(R.id.b15);
        i[16] = v.findViewById(R.id.b16);
        i[17] = v.findViewById(R.id.b17);
        i[18] = v.findViewById(R.id.b18);
        i[19] = v.findViewById(R.id.b19);
        i[20] = v.findViewById(R.id.b20);
        i[21] = v.findViewById(R.id.b21);
        i[22] = v.findViewById(R.id.b22);
        i[23] = v.findViewById(R.id.b23);
        i[24] = v.findViewById(R.id.b24);
        i[25] = v.findViewById(R.id.b25);
        i[26] = v.findViewById(R.id.b26);
        i[27] = v.findViewById(R.id.b27);
        i[28] = v.findViewById(R.id.b28);
        i[29] = v.findViewById(R.id.b29);

        text[1] = v.findViewById(R.id.coffee_menu1);
        text[2] = v.findViewById(R.id.coffee_menu2);
        text[3] = v.findViewById(R.id.coffee_menu3);
        text[4] = v.findViewById(R.id.coffee_menu4);
        text[5] = v.findViewById(R.id.coffee_menu5);
        text[6] = v.findViewById(R.id.coffee_menu6);
        text[7] = v.findViewById(R.id.coffee_menu7);
        text[8] = v.findViewById(R.id.coffee_menu8);
        text[9] = v.findViewById(R.id.coffee_menu9);
        text[10] = v.findViewById(R.id.coffee_menu10);
        text[11] = v.findViewById(R.id.coffee_menu11);
        text[12] = v.findViewById(R.id.coffee_menu12);
        text[13] = v.findViewById(R.id.coffee_menu13);
        text[14] = v.findViewById(R.id.coffee_menu14);
        text[15] = v.findViewById(R.id.coffee_menu15);
        text[16] = v.findViewById(R.id.coffee_menu16);
        text[17] = v.findViewById(R.id.coffee_menu17);
        text[18] = v.findViewById(R.id.coffee_menu18);
        text[19] = v.findViewById(R.id.coffee_menu19);
        text[20] = v.findViewById(R.id.coffee_menu20);
        text[21] = v.findViewById(R.id.coffee_menu21);
        text[22] = v.findViewById(R.id.coffee_menu22);
        text[23] = v.findViewById(R.id.coffee_menu23);
        text[24] = v.findViewById(R.id.coffee_menu24);
        text[25] = v.findViewById(R.id.coffee_menu25);
        text[26] = v.findViewById(R.id.coffee_menu26);
        text[27] = v.findViewById(R.id.coffee_menu27);
        text[28] = v.findViewById(R.id.coffee_menu28);
        text[29] = v.findViewById(R.id.coffee_menu29);

        for (int j=1;j<=29;j++) {

            int finalJ = j;
            i[j].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), PascucciActivity.class);
                    intent.putExtra("code3", 1000 + finalJ);
                    startActivity(intent);
                }
            });
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    //coffee
                    Document doc = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00010010").get();
                    Elements image = doc.select("div.productWr a.product[data-productseq=1] figure div.proListImg img");
                    Elements title = doc.select("div.productWr a.product[data-productseq=1] figure figcaption h2");
                    imgArr[1] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[1] = title.text();
                    image = doc.select("div.productWr a.product[data-productseq=2] figure div.proListImg img");
                    title = doc.select("div.productWr a.product[data-productseq=2] figure figcaption h2");
                    imgArr[2] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[2] = title.text();
                    image = doc.select("div.productWr a.product[data-productseq=3] figure div.proListImg img");
                    title = doc.select("div.productWr a.product[data-productseq=3] figure figcaption h2");
                    imgArr[3] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[3] = title.text();
                    image = doc.select("div.productWr a.product[data-productseq=632] figure div.proListImg img");
                    title = doc.select("div.productWr a.product[data-productseq=632] figure figcaption h2");
                    imgArr[4] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[4] = title.text();
                    Document doc2 = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100020").get();
                    image = doc2.select("div.productWr a.product[data-productseq=1309] figure div.proListImg img");
                    title = doc2.select("div.productWr a.product[data-productseq=1309] figure figcaption h2");
                    imgArr[5] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[5] = title.text();
                    image = doc2.select("div.productWr a.product[data-productseq=19] figure div.proListImg img");
                    title = doc2.select("div.productWr a.product[data-productseq=19] figure figcaption h2");
                    imgArr[6] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[6] = title.text();
                    image = doc2.select("div.productWr a.product[data-productseq=18] figure div.proListImg img");
                    title = doc2.select("div.productWr a.product[data-productseq=18] figure figcaption h2");
                    imgArr[7] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[7] = title.text();
                    image = doc2.select("div.productWr a.product[data-productseq=17] figure div.proListImg img");
                    title = doc2.select("div.productWr a.product[data-productseq=17] figure figcaption h2");
                    imgArr[8] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[8] = title.text();
                    image = doc2.select("div.productWr a.product[data-productseq=6] figure div.proListImg img");
                    title = doc2.select("div.productWr a.product[data-productseq=6] figure figcaption h2");
                    imgArr[9] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[9] = title.text();
                    image = doc2.select("div.productWr a.product[data-productseq=15] figure div.proListImg img");
                    title = doc2.select("div.productWr a.product[data-productseq=15] figure figcaption h2");
                    imgArr[10] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[10] = title.text();
                    image = doc2.select("div.productWr a.product[data-productseq=14] figure div.proListImg img");
                    title = doc2.select("div.productWr a.product[data-productseq=14] figure figcaption h2");
                    imgArr[11] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[11] = title.text();
                    image = doc2.select("div.productWr a.product[data-productseq=16] figure div.proListImg img");
                    title = doc2.select("div.productWr a.product[data-productseq=16] figure figcaption h2");
                    imgArr[12] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[12] = title.text();
                    Document doc3 = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100030").get();
                    image = doc3.select("div.productWr a.product[data-productseq=1310] figure div.proListImg img");
                    title = doc3.select("div.productWr a.product[data-productseq=1310] figure figcaption h2");
                    imgArr[13] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[13] = title.text();
                    image = doc3.select("div.productWr a.product[data-productseq=1068] figure div.proListImg img");
                    title = doc3.select("div.productWr a.product[data-productseq=1068] figure figcaption h2");
                    imgArr[14] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[14] = title.text();
                    image = doc3.select("div.productWr a.product[data-productseq=28] figure div.proListImg img");
                    title = doc3.select("div.productWr a.product[data-productseq=28] figure figcaption h2");
                    imgArr[15] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[15] = title.text();
                    image = doc3.select("div.productWr a.product[data-productseq=27] figure div.proListImg img");
                    title = doc3.select("div.productWr a.product[data-productseq=27] figure figcaption h2");
                    imgArr[16] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[16] = title.text();
                    image = doc3.select("div.productWr a.product[data-productseq=26] figure div.proListImg img");
                    title = doc3.select("div.productWr a.product[data-productseq=26] figure figcaption h2");
                    imgArr[17] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[17] = title.text();
                    image = doc3.select("div.productWr a.product[data-productseq=25] figure div.proListImg img");
                    title = doc3.select("div.productWr a.product[data-productseq=25] figure figcaption h2");
                    imgArr[18] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[18] = title.text();
                    image = doc3.select("div.productWr a.product[data-productseq=24] figure div.proListImg img");
                    title = doc3.select("div.productWr a.product[data-productseq=24] figure figcaption h2");
                    imgArr[19] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[19] = title.text();
                    image = doc3.select("div.productWr a.product[data-productseq=23] figure div.proListImg img");
                    title = doc3.select("div.productWr a.product[data-productseq=23] figure figcaption h2");
                    imgArr[20] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[20] = title.text();
                    Document doc4 = Jsoup.connect("https://www.caffe-pascucci.co.kr/product/productList.asp?typeCode=00100040").get();
                    image = doc4.select("div.productWr a.product[data-productseq=1169] figure div.proListImg img");
                    title = doc4.select("div.productWr a.product[data-productseq=1169] figure figcaption h2");
                    imgArr[21] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[21] = title.text();
                    image = doc4.select("div.productWr a.product[data-productseq=1168] figure div.proListImg img");
                    title = doc4.select("div.productWr a.product[data-productseq=1168] figure figcaption h2");
                    imgArr[22] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[22] = title.text();
                    image = doc4.select("div.productWr a.product[data-productseq=467] figure div.proListImg img");
                    title = doc4.select("div.productWr a.product[data-productseq=467] figure figcaption h2");
                    imgArr[23] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[23] = title.text();
                    image = doc4.select("div.productWr a.product[data-productseq=1293] figure div.proListImg img");
                    title = doc4.select("div.productWr a.product[data-productseq=1293] figure figcaption h2");
                    imgArr[24] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[24] = title.text();
                    image = doc4.select("div.productWr a.product[data-productseq=466] figure div.proListImg img");
                    title = doc4.select("div.productWr a.product[data-productseq=466] figure figcaption h2");
                    imgArr[25] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[25] = title.text();
                    image = doc4.select("div.productWr a.product[data-productseq=1292] figure div.proListImg img");
                    title = doc4.select("div.productWr a.product[data-productseq=1292] figure figcaption h2");
                    imgArr[26] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[26] = title.text();
                    image = doc4.select("div.productWr a.product[data-productseq=893] figure div.proListImg img");
                    title = doc4.select("div.productWr a.product[data-productseq=893] figure figcaption h2");
                    imgArr[27] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[27] = title.text();
                    image = doc4.select("div.productWr a.product[data-productseq=1291] figure div.proListImg img");
                    title = doc4.select("div.productWr a.product[data-productseq=1291] figure figcaption h2");
                    imgArr[28] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[28] = title.text();
                    image = doc4.select("div.productWr a.product[data-productseq=469] figure div.proListImg img");
                    title = doc4.select("div.productWr a.product[data-productseq=469] figure figcaption h2");
                    imgArr[29] = "https://www.caffe-pascucci.co.kr/" + image.attr("src");
                    txtArr[29] = title.text();





                    for(int j=1;j<=29;j++)
                    {
                        bundle.putString("i"+j, imgArr[j]);
                        bundle.putString("coffee_menu"+j, txtArr[j]);
                    }



                    Message msg = handler.obtainMessage();
                    msg.setData(bundle);
                    handler.sendMessage(msg);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        return v;

    }
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            Bundle bundle = msg.getData();
            for(int j=1;j<=29;j++)
            {
                Picasso.get().load(bundle.getString("i"+j)).into(i[j]);
                text[j].setText(bundle.getString("coffee_menu"+j));
            }
        }
    };
}

