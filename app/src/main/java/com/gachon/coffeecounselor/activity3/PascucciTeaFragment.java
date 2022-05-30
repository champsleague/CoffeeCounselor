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

public class PascucciTeaFragment extends Fragment {
    String[] imgArr = new String[15];
    String[] txtArr = new String[15];

    ImageButton[] i = new ImageButton[15];
    TextView[] text = new TextView[15];
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pascucci_tea, container, false);
        final Bundle bundle = new Bundle();

        i[1] = v.findViewById(R.id.tea1);
        i[2] = v.findViewById(R.id.tea2);
        i[3] = v.findViewById(R.id.tea3);
        i[4] = v.findViewById(R.id.tea4);
        i[5] = v.findViewById(R.id.tea5);
        i[6] = v.findViewById(R.id.tea6);
        i[7] = v.findViewById(R.id.tea7);
        i[8] = v.findViewById(R.id.tea8);
        i[9] = v.findViewById(R.id.tea9);
        i[10] = v.findViewById(R.id.tea10);
        i[11] = v.findViewById(R.id.tea11);


        text[1] = v.findViewById(R.id.tea_menu1);
        text[2] = v.findViewById(R.id.tea_menu2);
        text[3] = v.findViewById(R.id.tea_menu3);
        text[4] = v.findViewById(R.id.tea_menu4);
        text[5] = v.findViewById(R.id.tea_menu5);
        text[6] = v.findViewById(R.id.tea_menu6);
        text[7] = v.findViewById(R.id.tea_menu7);
        text[8] = v.findViewById(R.id.tea_menu8);
        text[9] = v.findViewById(R.id.tea_menu9);
        text[10] = v.findViewById(R.id.tea_menu10);
        text[11] = v.findViewById(R.id.tea_menu11);



        for (int j=1;j<=11;j++) {

            int finalJ = j;
            i[j].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), MegaCoffeeActivity.class);
                    intent.putExtra("code2", 1060 + finalJ);
                    startActivity(intent);
                }
            });
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    //coffee
                    Document doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();
                    Elements image = doc.select("tr#faq11 td table tbody tr td img");
                    Elements title = doc.select("tr#faq11 td table tbody tr td table tbody tr td strong");
                    imgArr[1] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[1] = title.text();
                    image = doc.select("tr#faq12 td table tbody tr td img");
                    title = doc.select("tr#faq12 td table tbody tr td table tbody tr td strong");
                    imgArr[2] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[2] = title.text();
                    image = doc.select("tr#faq21 td table tbody tr td img");
                    title = doc.select("tr#faq21 td table tbody tr td table tbody tr td strong");
                    imgArr[3] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[3] = title.text();
                    image = doc.select("tr#faq14 td table tbody tr td img");
                    title = doc.select("tr#faq14 td table tbody tr td table tbody tr td strong");
                    imgArr[4] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[4] = title.text();
                    image = doc.select("tr#faq22 td table tbody tr td img");
                    title = doc.select("tr#faq22 td table tbody tr td table tbody tr td strong");
                    imgArr[5] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[5] = title.text();
                    image = doc.select("tr#faq10 td table tbody tr td img");
                    title = doc.select("tr#faq10 td table tbody tr td table tbody tr td strong");
                    imgArr[6] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[6] = title.text();
                    image = doc.select("tr#faq13 td table tbody tr td img");
                    title = doc.select("tr#faq13 td table tbody tr td table tbody tr td strong");
                    imgArr[7] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[7] = title.text();
                    image = doc.select("tr#faq20 td table tbody tr td img");
                    title = doc.select("tr#faq20 td table tbody tr td table tbody tr td strong");
                    imgArr[8] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[8] = title.text();
                    image = doc.select("tr#faq23 td table tbody tr td img");
                    title = doc.select("tr#faq23 td table tbody tr td table tbody tr td strong");
                    imgArr[9] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[9] = title.text();
                    image = doc.select("tr#faq24 td table tbody tr td img");
                    title = doc.select("tr#faq24 td table tbody tr td table tbody tr td strong");
                    imgArr[10] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[10] = title.text();
                    image = doc.select("tr#faq25 td table tbody tr td img");
                    title = doc.select("tr#faq25 td table tbody tr td table tbody tr td strong");
                    imgArr[11] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[11] = title.text();


                    for(int j=1;j<=11;j++)
                    {
                        bundle.putString("i"+j, imgArr[j]);
                        bundle.putString("tea_menu"+j, txtArr[j]);
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
            for(int j=1;j<=11;j++)
            {
                Picasso.get().load(bundle.getString("i"+j)).into(i[j]);
                text[j].setText(bundle.getString("tea_menu"+j));
            }
        }
    };
}
