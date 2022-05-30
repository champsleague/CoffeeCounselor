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

public class MegaBeverageFragment extends Fragment {

    String[] imgArr = new String[20];
    String[] txtArr = new String[20];

    ImageButton[] i = new ImageButton[20];
    TextView[] text = new TextView[20];
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mega_beverage, container, false);
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


        text[1] = v.findViewById(R.id.bev_menu1);
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

        for (int j=1;j<=18;j++) {

            int finalJ = j;
            i[j].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), MegaCoffeeActivity.class);
                    intent.putExtra("code2", 1000 + finalJ);
                    startActivity(intent);
                }
            });
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    //coffee
                    Document doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();
                    Elements image = doc.select("tr#faq5 td table tbody tr td img");
                    Elements title = doc.select("tr#faq5 td table tbody tr td table tbody tr td strong");
                    imgArr[1] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[1] = title.text();
                    image = doc.select("tr#faq6 td table tbody tr td img");
                    title = doc.select("tr#faq6 td table tbody tr td table tbody tr td strong");
                    imgArr[2] = "http://www.megacoffee.me" +image.attr("src");
                    txtArr[2] = title.text();
                    image = doc.select("tr#faq7 td table tbody tr td img");
                    title = doc.select("tr#faq7 td table tbody tr td table tbody tr td strong");
                    imgArr[3] = image.attr("src");
                    txtArr[3] = title.text();
                    image = doc.select("tr#faq8 td table tbody tr td img");
                    title = doc.select("tr#faq8 td table tbody tr td table tbody tr td strong");
                    imgArr[4] = image.attr("src");
                    txtArr[4] = title.text();
                    image = doc.select("tr#faq9 td table tbody tr td img");
                    title = doc.select("tr#faq9 td table tbody tr td table tbody tr td strong");
                    imgArr[5] = image.attr("src");
                    txtArr[5] = title.text();
                    Document doc2 = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();
                    image = doc2.select("tr#faq10 td table tbody tr td img");
                    title = doc2.select("tr#faq10 td table tbody tr td table tbody tr td strong");
                    imgArr[6] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[6] = title.text();
                    image = doc2.select("tr#faq11 td table tbody tr td img");
                    title = doc2.select("tr#faq11 td table tbody tr td table tbody tr td strong");
                    imgArr[7] = image.attr("src");
                    txtArr[7] = title.text();
                    image = doc2.select("tr#faq12 td table tbody tr td img");
                    title = doc2.select("tr#faq12 td table tbody tr td table tbody tr td strong");
                    imgArr[8] = image.attr("src");
                    txtArr[8] = title.text();
                    image = doc2.select("tr#faq13 td table tbody tr td img");
                    title = doc2.select("tr#faq13 td table tbody tr td table tbody tr td strong");
                    imgArr[9] = image.attr("src");
                    txtArr[9] = title.text();
                    image = doc2.select("tr#faq14 td table tbody tr td img");
                    title = doc2.select("tr#faq14 td table tbody tr td table tbody tr td strong");
                    imgArr[10] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[10] = title.text();
                    image = doc2.select("tr#faq15 td table tbody tr td img");
                    title = doc2.select("tr#faq15 td table tbody tr td table tbody tr td strong");
                    imgArr[11] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[11] = title.text();
                    image = doc2.select("tr#faq16 td table tbody tr td img");
                    title = doc2.select("tr#faq16 td table tbody tr td table tbody tr td strong");
                    imgArr[12] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[12] = title.text();
                    image = doc2.select("tr#faq17 td table tbody tr td img");
                    title = doc2.select("tr#faq17 td table tbody tr td table tbody tr td strong");
                    imgArr[13] = image.attr("src");
                    txtArr[13] = title.text();
                    image = doc2.select("tr#faq18 td table tbody tr td img");
                    title = doc2.select("tr#faq18 td table tbody tr td table tbody tr td strong");
                    imgArr[14] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[14] = title.text();
                    Document doc3 = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu9").get();
                    image = doc3.select("tr#faq0 td table tbody tr td img");
                    title = doc3.select("tr#faq0 td table tbody tr td table tbody tr td strong");
                    imgArr[15] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[15] = title.text();
                    image = doc3.select("tr#faq2 td table tbody tr td img");
                    title = doc3.select("tr#faq2 td table tbody tr td table tbody tr td strong");
                    imgArr[16] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[16] = title.text();
                    image = doc3.select("tr#faq4 td table tbody tr td img");
                    title = doc3.select("tr#faq4 td table tbody tr td table tbody tr td strong");
                    imgArr[17] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[17] = title.text();
                    image = doc3.select("tr#faq6 td table tbody tr td img");
                    title = doc3.select("tr#faq6 td table tbody tr td table tbody tr td strong");
                    imgArr[18] = "http://www.megacoffee.me" + image.attr("src");
                    txtArr[18] = title.text();


                    for(int j=1;j<=18;j++)
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
            for(int j=1;j<=18;j++)
            {
                Picasso.get().load(bundle.getString("i"+j)).into(i[j]);
                text[j].setText(bundle.getString("coffee_menu"+j));
            }
        }
    };
}
