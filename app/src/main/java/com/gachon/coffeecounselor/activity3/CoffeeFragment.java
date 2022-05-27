package com.gachon.coffeecounselor.activity3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.os.Handler;
import com.squareup.picasso.Picasso;
import com.gachon.coffeecounselor.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CoffeeFragment extends Fragment {

    ImageButton i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
    String i1Tmp,i2Tmp,i3Tmp,i4Tmp,i5Tmp,i6Tmp,i7Tmp,i8Tmp,i9Tmp,i10Tmp;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_coffee, container, false);
        final Bundle bundle = new Bundle();
        i1 = v.findViewById(R.id.b1);
        i2 = v.findViewById(R.id.b2);
        i3 = v.findViewById(R.id.b3);
        i4 = v.findViewById(R.id.b4);
        i5 = v.findViewById(R.id.b5);
        i6 = v.findViewById(R.id.b6);
        i7 = v.findViewById(R.id.b7);
        i8 = v.findViewById(R.id.b8);
        i9 = v.findViewById(R.id.b9);
        i10 = v.findViewById(R.id.b10);

        new Thread(){
            @Override
            public void run() {
                try{
                    Document doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();
                    Elements image1 = doc.select("tr#faq0 td table tbody tr td img");
                    i1Tmp = image1.attr("src");
                    Elements image2 = doc.select("tr#faq1 td table tbody tr td img");
                    i2Tmp = image2.attr("src");
                    Elements image3 = doc.select("tr#faq2 td table tbody tr td img");
                    i3Tmp = image3.attr("src");
                    Elements image4 = doc.select("tr#faq3 td table tbody tr td img");
                    i4Tmp = image4.attr("src");
                    Elements image5 = doc.select("tr#faq7 td table tbody tr td img");
                    i5Tmp = image5.attr("src");
                    Document doc2 = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();
                    Elements image6 = doc2.select("tr#faq0 td table tbody tr td img");
                    i6Tmp = image6.attr("src");
                    Elements image7 = doc2.select("tr#faq1 td table tbody tr td img");
                    i7Tmp = image7.attr("src");
                    Elements image8 = doc2.select("tr#faq2 td table tbody tr td img");
                    i8Tmp = image8.attr("src");
                    Elements image9 = doc2.select("tr#faq3 td table tbody tr td img");
                    i9Tmp = image9.attr("src");
                    Elements image10 = doc2.select("tr#faq4 td table tbody tr td img");
                    i10Tmp = image10.attr("src");

                    bundle.putString("i1",i1Tmp);
                    bundle.putString("i2",i2Tmp);
                    bundle.putString("i3",i3Tmp);
                    bundle.putString("i4",i4Tmp);
                    bundle.putString("i5",i5Tmp);
                    bundle.putString("i6",i6Tmp);
                    bundle.putString("i7",i7Tmp);
                    bundle.putString("i8",i8Tmp);
                    bundle.putString("i9",i9Tmp);
                    bundle.putString("i10",i10Tmp);


                    Message msg = handler.obtainMessage();
                    msg.setData(bundle);
                    handler.sendMessage(msg);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        return v;
//
    }
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            Bundle bundle = msg.getData();
            Picasso.get().load(bundle.getString("i1")).into(i1);
            Picasso.get().load(bundle.getString("i2")).into(i2);
            Picasso.get().load(bundle.getString("i3")).into(i3);
            Picasso.get().load(bundle.getString("i4")).into(i4);
            Picasso.get().load(bundle.getString("i5")).into(i5);
            Picasso.get().load(bundle.getString("i6")).into(i6);
            Picasso.get().load(bundle.getString("i7")).into(i7);
            Picasso.get().load(bundle.getString("i8")).into(i8);
            Picasso.get().load(bundle.getString("i9")).into(i9);
            Picasso.get().load(bundle.getString("i10")).into(i10);

        }
    };
}
