package com.gachon.coffeecounselor.activity3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.os.Handler;

import com.gachon.coffeecounselor.CafeinfoActivity;
import com.gachon.coffeecounselor.activity4.AmericanoActivity;
import com.squareup.picasso.Picasso;
import com.gachon.coffeecounselor.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CoffeeFragment extends Fragment {

    ImageView[] coffeeArr = new ImageView[12];
    String[] imageArr = new String[12];

    public static final class buttonID {
        public static final String b1 = "b1";
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_coffee, container, false);
        final Bundle bundle = new Bundle();

        for(int i=1;i<=12;i++){
            int resID = getResources().getIdentifier("b1", "buttonID", "com.gachon.coffeecounselor");
            coffeeArr[i] = (ImageButton) v.findViewById(resID);
        }

        for(int i=1;i<=12;i++){
            coffeeArr[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), AmericanoActivity.class);
                    intent.putExtra("code",0);
                    startActivity(intent);
                }
            });
        }

        new Thread(){
            @Override
            public void run() {
                try{
                    Document doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();

                    Elements images = doc.select("tr td table tbody tr td img");
                    int i = 0;
                    for(Element image : images){
                        imageArr[i] = image.attr("src");
                    }

                    for(int j=1;j<=12;j++){
                        bundle.putString("i"+Integer.toString(i), imageArr[i]);
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
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            Bundle bundle = msg.getData();

            for(int i=1;i<=12;i++){
                Picasso.get().load(bundle.getString("i"+Integer.toString(i))).into(coffeeArr[i]);
            }

        }
    };
}
