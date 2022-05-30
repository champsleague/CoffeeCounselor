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

public class PascucciBeverageFragment extends Fragment {

    String[] imgArr = new String[50];
    String[] txtArr = new String[50];

    ImageButton[] i = new ImageButton[50];
    TextView[] text = new TextView[50];
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pascucci_beverage, container, false);
        final Bundle bundle = new Bundle();

        i[1] = v.findViewById(R.id.bev1);
        i[2] = v.findViewById(R.id.bev2);
        i[3] = v.findViewById(R.id.bev3);
        i[4] = v.findViewById(R.id.bev4);
        i[5] = v.findViewById(R.id.bev5);
        i[6] = v.findViewById(R.id.bev6);
        i[7] = v.findViewById(R.id.bev7);
        i[8] = v.findViewById(R.id.bev8);
        i[9] = v.findViewById(R.id.bev9);
        i[10] = v.findViewById(R.id.bev10);
        i[11] = v.findViewById(R.id.bev11);
        i[12] = v.findViewById(R.id.bev12);
        i[13] = v.findViewById(R.id.bev13);
        i[14] = v.findViewById(R.id.bev14);
        i[15] = v.findViewById(R.id.bev15);
        i[16] = v.findViewById(R.id.bev16);
        i[17] = v.findViewById(R.id.bev17);
        i[18] = v.findViewById(R.id.bev18);
        i[19] = v.findViewById(R.id.bev19);
        i[20] = v.findViewById(R.id.bev20);
        i[21] = v.findViewById(R.id.bev21);
        i[22] = v.findViewById(R.id.bev22);
        i[23] = v.findViewById(R.id.bev23);
        i[24] = v.findViewById(R.id.bev24);
        i[25] = v.findViewById(R.id.bev25);
        i[26] = v.findViewById(R.id.bev26);
        i[27] = v.findViewById(R.id.bev27);
        i[28] = v.findViewById(R.id.bev28);
        i[29] = v.findViewById(R.id.bev29);
        i[30] = v.findViewById(R.id.bev30);
        i[31] = v.findViewById(R.id.bev31);
        i[32] = v.findViewById(R.id.bev32);
        i[33] = v.findViewById(R.id.bev33);
        i[34] = v.findViewById(R.id.bev34);
        i[35] = v.findViewById(R.id.bev35);
        i[36] = v.findViewById(R.id.bev36);
        i[37] = v.findViewById(R.id.bev37);
        i[38] = v.findViewById(R.id.bev38);
        i[39] = v.findViewById(R.id.bev39);
        i[40] = v.findViewById(R.id.bev40);
        i[41] = v.findViewById(R.id.bev41);
        i[42] = v.findViewById(R.id.bev42);



        text[1] = v.findViewById(R.id.bev_menu1);
        text[2] = v.findViewById(R.id.bev_menu2);
        text[3] = v.findViewById(R.id.bev_menu3);
        text[4] = v.findViewById(R.id.bev_menu4);
        text[5] = v.findViewById(R.id.bev_menu5);
        text[6] = v.findViewById(R.id.bev_menu6);
        text[7] = v.findViewById(R.id.bev_menu7);
        text[8] = v.findViewById(R.id.bev_menu8);
        text[9] = v.findViewById(R.id.bev_menu9);
        text[10] = v.findViewById(R.id.bev_menu10);
        text[11] = v.findViewById(R.id.bev_menu11);
        text[12] = v.findViewById(R.id.bev_menu12);
        text[13] = v.findViewById(R.id.bev_menu13);
        text[14] = v.findViewById(R.id.bev_menu14);
        text[15] = v.findViewById(R.id.bev_menu15);
        text[16] = v.findViewById(R.id.bev_menu16);
        text[17] = v.findViewById(R.id.bev_menu17);
        text[18] = v.findViewById(R.id.bev_menu18);
        text[19] = v.findViewById(R.id.bev_menu19);
        text[20] = v.findViewById(R.id.bev_menu20);
        text[21] = v.findViewById(R.id.bev_menu21);
        text[22] = v.findViewById(R.id.bev_menu22);
        text[23] = v.findViewById(R.id.bev_menu23);
        text[24] = v.findViewById(R.id.bev_menu24);
        text[25] = v.findViewById(R.id.bev_menu25);
        text[26] = v.findViewById(R.id.bev_menu26);
        text[27] = v.findViewById(R.id.bev_menu27);
        text[28] = v.findViewById(R.id.bev_menu28);
        text[29] = v.findViewById(R.id.bev_menu29);
        text[30] = v.findViewById(R.id.bev_menu30);
        text[31] = v.findViewById(R.id.bev_menu31);
        text[32] = v.findViewById(R.id.bev_menu32);
        text[33] = v.findViewById(R.id.bev_menu33);
        text[34] = v.findViewById(R.id.bev_menu34);
        text[35] = v.findViewById(R.id.bev_menu35);
        text[36] = v.findViewById(R.id.bev_menu36);
        text[37] = v.findViewById(R.id.bev_menu37);
        text[38] = v.findViewById(R.id.bev_menu38);
        text[39] = v.findViewById(R.id.bev_menu39);
        text[40] = v.findViewById(R.id.bev_menu40);
        text[41] = v.findViewById(R.id.bev_menu41);
        text[42] = v.findViewById(R.id.bev_menu42);
        for (int j=1;j<=42;j++) {

            int finalJ = j;
            i[j].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), MegaCoffeeActivity.class);
                    intent.putExtra("code2", 1018 + finalJ);
                    startActivity(intent);
                }
            });
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    //coffee
                    Document doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();
                    Elements image = doc.select("tr#faq30 td table tbody tr td img");
                    Elements title = doc.select("tr#faq30 td table tbody tr td table tbody tr td strong");
                    imgArr[1] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[1] = title.text();
                    image = doc.select("tr#faq31 td table tbody tr td img");
                    title = doc.select("tr#faq31 td table tbody tr td table tbody tr td strong");
                    imgArr[2] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[2] = title.text();
                    image = doc.select("tr#faq32 td table tbody tr td img");
                    title = doc.select("tr#faq32 td table tbody tr td table tbody tr td strong");
                    imgArr[3] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[3] = title.text();
                    image = doc.select("tr#faq33 td table tbody tr td img");
                    title = doc.select("tr#faq33 td table tbody tr td table tbody tr td strong");
                    imgArr[4] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[4] = title.text();
                    image = doc.select("tr#faq34 td table tbody tr td img");
                    title = doc.select("tr#faq34 td table tbody tr td table tbody tr td strong");
                    imgArr[5] = image.attr("src");
                    txtArr[5] = title.text();
                    image = doc.select("tr#faq35 td table tbody tr td img");
                    title = doc.select("tr#faq35 td table tbody tr td table tbody tr td strong");
                    imgArr[6] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[6] = title.text();
                    image = doc.select("tr#faq36 td table tbody tr td img");
                    title = doc.select("tr#faq36 td table tbody tr td table tbody tr td strong");
                    imgArr[7] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[7] = title.text();
                    image = doc.select("tr#faq37 td table tbody tr td img");
                    title = doc.select("tr#faq37 td table tbody tr td table tbody tr td strong");
                    imgArr[8] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[8] = title.text();
                    image = doc.select("tr#faq38 td table tbody tr td img");
                    title = doc.select("tr#faq38 td table tbody tr td table tbody tr td strong");
                    imgArr[9] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[9] = title.text();
                    image = doc.select("tr#faq39 td table tbody tr td img");
                    title = doc.select("tr#faq39 td table tbody tr td table tbody tr td strong");
                    imgArr[10] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[10] = title.text();
                    Document doc2 = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu11").get();
                    image = doc2.select("tr#faq0 td table tbody tr td img");
                    title = doc2.select("tr#faq0 td table tbody tr td table tbody tr td strong");
                    imgArr[11] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[11] = title.text();
                    image = doc2.select("tr#faq1 td table tbody tr td img");
                    title = doc2.select("tr#faq1 td table tbody tr td table tbody tr td strong");
                    imgArr[12] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[12] = title.text();
                    image = doc2.select("tr#faq2 td table tbody tr td img");
                    title = doc2.select("tr#faq2 td table tbody tr td table tbody tr td strong");
                    imgArr[13] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[13] = title.text();
                    image = doc2.select("tr#faq3 td table tbody tr td img");
                    title = doc2.select("tr#faq3 td table tbody tr td table tbody tr td strong");
                    imgArr[14] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[14] = title.text();
                    image = doc2.select("tr#faq4 td table tbody tr td img");
                    title = doc2.select("tr#faq4 td table tbody tr td table tbody tr td strong");
                    imgArr[15] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[15] = title.text();
                    Document doc3 = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();
                    image = doc3.select("tr#faq11 td table tbody tr td img");
                    title = doc3.select("tr#faq11 td table tbody tr td table tbody tr td strong");
                    imgArr[16] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[16] = title.text();
                    image = doc3.select("tr#faq12 td table tbody tr td img");
                    title = doc3.select("tr#faq12 td table tbody tr td table tbody tr td strong");
                    imgArr[17] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[17] = title.text();
                    image = doc3.select("tr#faq7 td table tbody tr td img");
                    title = doc3.select("tr#faq7 td table tbody tr td table tbody tr td strong");
                    imgArr[18] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[18] = title.text();
                    image = doc3.select("tr#faq3 td table tbody tr td img");
                    title = doc3.select("tr#faq3 td table tbody tr td table tbody tr td strong");
                    imgArr[19] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[19] = title.text();
                    image = doc3.select("tr#faq10 td table tbody tr td img");
                    title = doc3.select("tr#faq10 td table tbody tr td table tbody tr td strong");
                    imgArr[20] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[20] = title.text();
                    image = doc3.select("tr#faq14 td table tbody tr td img");
                    title = doc3.select("tr#faq14 td table tbody tr td table tbody tr td strong");
                    imgArr[21] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[21] = title.text();
                    image = doc3.select("tr#faq9 td table tbody tr td img");
                    title = doc3.select("tr#faq9 td table tbody tr td table tbody tr td strong");
                    imgArr[22] =  image.attr("src");
                    txtArr[22] = title.text();
                    image = doc3.select("tr#faq0 td table tbody tr td img");
                    title = doc3.select("tr#faq0 td table tbody tr td table tbody tr td strong");
                    imgArr[23] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[23] = title.text();
                    image = doc3.select("tr#faq2 td table tbody tr td img");
                    title = doc3.select("tr#faq2 td table tbody tr td table tbody tr td strong");
                    imgArr[24] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[24] = title.text();
                    image = doc3.select("tr#faq1 td table tbody tr td img");
                    title = doc3.select("tr#faq1 td table tbody tr td table tbody tr td strong");
                    imgArr[25] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[25] = title.text();
                    image = doc3.select("tr#faq8 td table tbody tr td img");
                    title = doc3.select("tr#faq8 td table tbody tr td table tbody tr td strong");
                    imgArr[26] = image.attr("src");
                    txtArr[26] = title.text();
                    image = doc3.select("tr#faq13 td table tbody tr td img");
                    title = doc3.select("tr#faq13 td table tbody tr td table tbody tr td strong");
                    imgArr[27] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[27] = title.text();
                    Document doc4 = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu4").get();
                    image = doc4.select("tr#faq0 td table tbody tr td img");
                    title = doc4.select("tr#faq0 td table tbody tr td table tbody tr td strong");
                    imgArr[28] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[28] = title.text();
                    image = doc4.select("tr#faq1 td table tbody tr td img");
                    title = doc4.select("tr#faq1 td table tbody tr td table tbody tr td strong");
                    imgArr[29] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[29] = title.text();
                    image = doc4.select("tr#faq2 td table tbody tr td img");
                    title = doc4.select("tr#faq2 td table tbody tr td table tbody tr td strong");
                    imgArr[30] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[30] = title.text();
                    image = doc4.select("tr#faq3 td table tbody tr td img");
                    title = doc4.select("tr#faq3 td table tbody tr td table tbody tr td strong");
                    imgArr[31] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[31] = title.text();
                    Document doc5 = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();
                    image = doc5.select("tr#faq2 td table tbody tr td img");
                    title = doc5.select("tr#faq2 td table tbody tr td table tbody tr td strong");
                    imgArr[32] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[32] = title.text();
                    image = doc5.select("tr#faq3 td table tbody tr td img");
                    title = doc5.select("tr#faq3 td table tbody tr td table tbody tr td strong");
                    imgArr[33] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[33] = title.text();
                    image = doc5.select("tr#faq4 td table tbody tr td img");
                    title = doc5.select("tr#faq4 td table tbody tr td table tbody tr td strong");
                    imgArr[34] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[34] = "메가에이드";
                    image = doc5.select("tr#faq8 td table tbody tr td img");
                    title = doc5.select("tr#faq8 td table tbody tr td table tbody tr td strong");
                    imgArr[35] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[35] = title.text();
                    image = doc5.select("tr#faq9 td table tbody tr td img");
                    title = doc5.select("tr#faq9 td table tbody tr td table tbody tr td strong");
                    imgArr[36] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[36] = title.text();
                    image = doc5.select("tr#faq0 td table tbody tr td img");
                    title = doc5.select("tr#faq0 td table tbody tr td table tbody tr td strong");
                    imgArr[37] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[37] = title.text();
                    image = doc5.select("tr#faq1 td table tbody tr td img");
                    title = doc5.select("tr#faq1 td table tbody tr td table tbody tr td strong");
                    imgArr[38] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[38] = title.text();
                    image = doc5.select("tr#faq10 td table tbody tr td img");
                    title = doc5.select("tr#faq10 td table tbody tr td table tbody tr td strong");
                    imgArr[39] = image.attr("src");
                    txtArr[39] = title.text();
                    image = doc5.select("tr#faq5 td table tbody tr td img");
                    title = doc5.select("tr#faq5 td table tbody tr td table tbody tr td strong");
                    imgArr[40] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[40] = title.text();
                    image = doc5.select("tr#faq7 td table tbody tr td img");
                    title = doc5.select("tr#faq7 td table tbody tr td table tbody tr td strong");
                    imgArr[41] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[41] = title.text();
                    image = doc5.select("tr#faq6 td table tbody tr td img");
                    title = doc5.select("tr#faq6 td table tbody tr td table tbody tr td strong");
                    imgArr[42] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[42] = title.text();


                    for(int j=1;j<=42;j++)
                    {
                        bundle.putString("bev"+j, imgArr[j]);
                        bundle.putString("bev_menu"+j, txtArr[j]);
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
            for(int j=1;j<=42;j++)
            {
                Picasso.get().load(bundle.getString("bev"+j)).into(i[j]);
                text[j].setText(bundle.getString("bev_menu"+j));
            }
        }
    };
}