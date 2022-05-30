package com.gachon.coffeecounselor.activity3;

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
import com.squareup.picasso.Picasso;
import com.gachon.coffeecounselor.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gachon.coffeecounselor.R;

public class PascucciDessertFragment extends Fragment {
    String[] imgArr = new String[40];
    String[] txtArr = new String[40];

    ImageButton[] i = new ImageButton[40];
    TextView[] text = new TextView[40];
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pascucci_dessert, container, false);
        final Bundle bundle = new Bundle();

        i[1] = v.findViewById(R.id.dea1);
        i[2] = v.findViewById(R.id.dea2);
        i[3] = v.findViewById(R.id.dea3);
        i[4] = v.findViewById(R.id.dea4);
        i[5] = v.findViewById(R.id.dea5);
        i[6] = v.findViewById(R.id.dea6);
        i[7] = v.findViewById(R.id.dea7);
        i[8] = v.findViewById(R.id.dea8);
        i[9] = v.findViewById(R.id.dea9);
        i[10] = v.findViewById(R.id.dea10);
        i[11] = v.findViewById(R.id.dea11);
        i[12] = v.findViewById(R.id.dea12);
        i[13] = v.findViewById(R.id.dea13);
        i[14] = v.findViewById(R.id.dea14);
        i[15] = v.findViewById(R.id.dea15);
        i[16] = v.findViewById(R.id.dea16);
        i[17] = v.findViewById(R.id.dea17);
        i[18] = v.findViewById(R.id.dea18);
        i[19] = v.findViewById(R.id.dea19);
        i[20] = v.findViewById(R.id.dea20);
        i[21] = v.findViewById(R.id.dea21);
        i[22] = v.findViewById(R.id.dea22);
        i[23] = v.findViewById(R.id.dea23);
        i[24] = v.findViewById(R.id.dea24);
        i[25] = v.findViewById(R.id.dea25);
        i[26] = v.findViewById(R.id.dea26);
        i[27] = v.findViewById(R.id.dea27);
        i[28] = v.findViewById(R.id.dea28);
        i[29] = v.findViewById(R.id.dea29);
        i[30] = v.findViewById(R.id.dea30);
        i[31] = v.findViewById(R.id.dea31);
        i[32] = v.findViewById(R.id.dea32);
        i[33] = v.findViewById(R.id.dea33);
        i[34] = v.findViewById(R.id.dea34);
        i[35] = v.findViewById(R.id.dea35);
        i[36] = v.findViewById(R.id.dea36);
        i[37] = v.findViewById(R.id.dea37);
        i[38] = v.findViewById(R.id.dea38);



        text[1] = v.findViewById(R.id.des_menu1);
        text[2] = v.findViewById(R.id.des_menu2);
        text[3] = v.findViewById(R.id.des_menu3);
        text[4] = v.findViewById(R.id.des_menu4);
        text[5] = v.findViewById(R.id.des_menu5);
        text[6] = v.findViewById(R.id.des_menu6);
        text[7] = v.findViewById(R.id.des_menu7);
        text[8] = v.findViewById(R.id.des_menu8);
        text[9] = v.findViewById(R.id.des_menu9);
        text[10] = v.findViewById(R.id.des_menu10);
        text[11] = v.findViewById(R.id.des_menu11);
        text[12] = v.findViewById(R.id.des_menu12);
        text[13] = v.findViewById(R.id.des_menu13);
        text[14] = v.findViewById(R.id.des_menu14);
        text[15] = v.findViewById(R.id.des_menu15);
        text[16] = v.findViewById(R.id.des_menu16);
        text[17] = v.findViewById(R.id.des_menu17);
        text[18] = v.findViewById(R.id.des_menu18);
        text[19] = v.findViewById(R.id.des_menu19);
        text[20] = v.findViewById(R.id.des_menu20);
        text[21] = v.findViewById(R.id.des_menu21);
        text[22] = v.findViewById(R.id.des_menu22);
        text[23] = v.findViewById(R.id.des_menu23);
        text[24] = v.findViewById(R.id.des_menu24);
        text[25] = v.findViewById(R.id.des_menu25);
        text[26] = v.findViewById(R.id.des_menu26);
        text[27] = v.findViewById(R.id.des_menu27);
        text[28] = v.findViewById(R.id.des_menu28);
        text[29] = v.findViewById(R.id.des_menu29);
        text[30] = v.findViewById(R.id.des_menu30);
        text[31] = v.findViewById(R.id.des_menu31);
        text[32] = v.findViewById(R.id.des_menu32);
        text[33] = v.findViewById(R.id.des_menu33);
        text[34] = v.findViewById(R.id.des_menu34);
        text[35] = v.findViewById(R.id.des_menu35);
        text[36] = v.findViewById(R.id.des_menu36);
        text[37] = v.findViewById(R.id.des_menu37);
        text[38] = v.findViewById(R.id.des_menu38);



        for (int j=1;j<=38;j++) {

            int finalJ = j;
            i[j].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), MegaCoffeeActivity.class);
                    intent.putExtra("code2", 1071 + finalJ);
                    startActivity(intent);
                }
            });
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    //coffee
                    Document doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();
                    Elements image = doc.select("tr#faq21 td table tbody tr td img");
                    Elements title = doc.select("tr#faq21 td table tbody tr td table tbody tr td strong");
                    imgArr[1] = "http://www.megacoffee.me" +image.attr("src");
                    txtArr[1] = title.text();
                    image = doc.select("tr#faq22 td table tbody tr td img");
                    title = doc.select("tr#faq22 td table tbody tr td table tbody tr td strong");
                    imgArr[2] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[2] = title.text();
                    image = doc.select("tr#faq23 td table tbody tr td img");
                    title = doc.select("tr#faq23 td table tbody tr td table tbody tr td strong");
                    imgArr[3] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[3] = title.text();
                    image = doc.select("tr#faq6 td table tbody tr td img");
                    title = doc.select("tr#faq6 td table tbody tr td table tbody tr td strong");
                    imgArr[4] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[4] = title.text();
                    image = doc.select("tr#faq7 td table tbody tr td img");
                    title = doc.select("tr#faq7 td table tbody tr td table tbody tr td strong");
                    imgArr[5] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[5] = title.text();
                    image = doc.select("tr#faq8 td table tbody tr td img");
                    title = doc.select("tr#faq8 td table tbody tr td table tbody tr td strong");
                    imgArr[6] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[6] = title.text();
                    image = doc.select("tr#faq18 td table tbody tr td img");
                    title = doc.select("tr#faq18 td table tbody tr td table tbody tr td strong");
                    imgArr[7] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[7] = title.text();
                    image = doc.select("tr#faq19 td table tbody tr td img");
                    title = doc.select("tr#faq19 td table tbody tr td table tbody tr td strong");
                    imgArr[8] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[8] = title.text();
                    image = doc.select("tr#faq20 td table tbody tr td img");
                    title = doc.select("tr#faq20 td table tbody tr td table tbody tr td strong");
                    imgArr[9] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[9] = title.text();
                    image = doc.select("tr#faq11 td table tbody tr td img");
                    title = doc.select("tr#faq11 td table tbody tr td table tbody tr td strong");
                    imgArr[10] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[10] = title.text();
                    image = doc.select("tr#faq3 td table tbody tr td img");
                    title = doc.select("tr#faq3 td table tbody tr td table tbody tr td strong");
                    imgArr[11] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[11] = title.text();
                    image = doc.select("tr#faq4 td table tbody tr td img");
                    title = doc.select("tr#faq4 td table tbody tr td table tbody tr td strong");
                    imgArr[12] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[12] = title.text();
                    image = doc.select("tr#faq5 td table tbody tr td img");
                    title = doc.select("tr#faq5 td table tbody tr td table tbody tr td strong");
                    imgArr[13] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[13] = title.text();
                    image = doc.select("tr#faq10 td table tbody tr td img");
                    title = doc.select("tr#faq10 td table tbody tr td table tbody tr td strong");
                    imgArr[14] = image.attr("src");
                    txtArr[14] = title.text();
                    image = doc.select("tr#faq12 td table tbody tr td img");
                    title = doc.select("tr#faq12 td table tbody tr td table tbody tr td strong");
                    imgArr[15] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[15] = title.text();
                    image = doc.select("tr#faq9 td table tbody tr td img");
                    title = doc.select("tr#faq9 td table tbody tr td table tbody tr td strong");
                    imgArr[16] = image.attr("src");
                    txtArr[16] = title.text();
                    image = doc.select("tr#faq16 td table tbody tr td img");
                    title = doc.select("tr#faq16 td table tbody tr td table tbody tr td strong");
                    imgArr[17] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[17] = title.text();
                    image = doc.select("tr#faq17 td table tbody tr td img");
                    title = doc.select("tr#faq17 td table tbody tr td table tbody tr td strong");
                    imgArr[18] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[18] = title.text();
                    image = doc.select("tr#faq24 td table tbody tr td img");
                    title = doc.select("tr#faq24 td table tbody tr td table tbody tr td strong");
                    imgArr[19] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[19] = title.text();
                    image = doc.select("tr#faq0 td table tbody tr td img");
                    title = doc.select("tr#faq0 td table tbody tr td table tbody tr td strong");
                    imgArr[20] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[20] = title.text();
                    image = doc.select("tr#faq1 td table tbody tr td img");
                    title = doc.select("tr#faq1 td table tbody tr td table tbody tr td strong");
                    imgArr[21] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[21] = title.text();
                    image = doc.select("tr#faq2 td table tbody tr td img");
                    title = doc.select("tr#faq2 td table tbody tr td table tbody tr td strong");
                    imgArr[22] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[22] = title.text();
                    image = doc.select("tr#faq13 td table tbody tr td img");
                    title = doc.select("tr#faq13 td table tbody tr td table tbody tr td strong");
                    imgArr[23] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[23] = title.text();
                    image = doc.select("tr#faq14 td table tbody tr td img");
                    title = doc.select("tr#faq14 td table tbody tr td table tbody tr td strong");
                    imgArr[24] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[24] = title.text();
                    image = doc.select("tr#faq15 td table tbody tr td img");
                    title = doc.select("tr#faq15 td table tbody tr td table tbody tr td strong");
                    imgArr[25] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[25] = title.text();
                    image = doc.select("tr#faq25 td table tbody tr td img");
                    title = doc.select("tr#faq25 td table tbody tr td table tbody tr td strong");
                    imgArr[26] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[26] = title.text();
                    image = doc.select("tr#faq26 td table tbody tr td img");
                    title = doc.select("tr#faq26 td table tbody tr td table tbody tr td strong");
                    imgArr[27] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[27] = title.text();
                    image = doc.select("tr#faq27 td table tbody tr td img");
                    title = doc.select("tr#faq27 td table tbody tr td table tbody tr td strong");
                    imgArr[28] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[28] = title.text();
                    image = doc.select("tr#faq28 td table tbody tr td img");
                    title = doc.select("tr#faq28 td table tbody tr td table tbody tr td strong");
                    imgArr[29] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[29] = title.text();
                    image = doc.select("tr#faq29 td table tbody tr td img");
                    title = doc.select("tr#faq29 td table tbody tr td table tbody tr td strong");
                    imgArr[30] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[30] = title.text();
                    image = doc.select("tr#faq30 td table tbody tr td img");
                    title = doc.select("tr#faq30 td table tbody tr td table tbody tr td strong");
                    imgArr[31] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[31] = title.text();
                    image = doc.select("tr#faq31 td table tbody tr td img");
                    title = doc.select("tr#faq31 td table tbody tr td table tbody tr td strong");
                    imgArr[32] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[32] = title.text();
                    image = doc.select("tr#faq32 td table tbody tr td img");
                    title = doc.select("tr#faq32 td table tbody tr td table tbody tr td strong");
                    imgArr[33] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[33] = title.text();
                    image = doc.select("tr#faq33 td table tbody tr td img");
                    title = doc.select("tr#faq33 td table tbody tr td table tbody tr td strong");
                    imgArr[34] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[34] = title.text();
                    image = doc.select("tr#faq34 td table tbody tr td img");
                    title = doc.select("tr#faq34 td table tbody tr td table tbody tr td strong");
                    imgArr[35] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[35] = title.text();
                    image = doc.select("tr#faq35 td table tbody tr td img");
                    title = doc.select("tr#faq35 td table tbody tr td table tbody tr td strong");
                    imgArr[36] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[36] = title.text();
                    image = doc.select("tr#faq36 td table tbody tr td img");
                    title = doc.select("tr#faq36 td table tbody tr td table tbody tr td strong");
                    imgArr[37] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[37] = title.text();
                    image = doc.select("tr#faq37 td table tbody tr td img");
                    title = doc.select("tr#faq37 td table tbody tr td table tbody tr td strong");
                    imgArr[38] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[38] = title.text();

                    for(int j=1;j<=38;j++)
                    {
                        bundle.putString("i"+j, imgArr[j]);
                        bundle.putString("des_menu"+j, txtArr[j]);
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
            for(int j=1;j<=38;j++)
            {
                Picasso.get().load(bundle.getString("i"+j)).into(i[j]);
                text[j].setText(bundle.getString("des_menu"+j));
            }
        }
    };
}
