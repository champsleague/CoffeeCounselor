package com.gachon.coffeecounselor.activity5;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.PointsGraphSeries;
import com.gachon.coffeecounselor.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class SubmitResult extends AppCompatActivity {

    public SubmitResult() throws IOException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing our variable for graph view.
        GraphView graphView = findViewById(R.id.idGraphView);

        // on below line we are creating a new data
        // point series for our point graph series.
        // we are calling get data point method to add
        // data point to our point graph series.
        PointsGraphSeries<DataPoint> series = new PointsGraphSeries<>(getDataPoint());

        // below line is to add series
        // to our graph view.
        graphView.addSeries(series);

        // below line is to activate
        // horizontal scrolling.
        graphView.getViewport().setScrollable(true);

        // below line is to activate horizontal
        // zooming and scrolling.
        graphView.getViewport().setScalable(true);

        // below line is to activate vertical and
        // horizontal zoom with scrolling.
        graphView.getViewport().setScalableY(true);

        // below line is to activate vertical scrolling.
        graphView.getViewport().setScrollableY(true);

        // below line is to set shape
        // for the point of graph view.
        series.setShape(PointsGraphSeries.Shape.TRIANGLE);

        // below line is to set
        // the size of our shape.
        series.setSize(12);

        // below line is to add color
        // to our shape of graph view.
        series.setColor(R.color.purple_200);
    }

    Intent intent = getIntent();
    Bundle bundle1 = intent.getExtras();
    int userSugar = bundle1.getInt("sugar");
    int userCaffeine = bundle1.getInt("caffeine");


    Document doc;
    Elements Nutritions;
    int index;
    String sugarTmp, caffeineTmp;
    try{
        doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();
        Nutritions = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
        index = 0;
        for(Element nutrition : Nutritions){
            if(index == 8)  sugarTmp = nutrition.text();
            if(index ==11)  caffeineTmp = nutrition.text();
            index += 1;
        }

        Nutritions = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
        index = 0;
        for(Element nutrition : Nutritions){
            if(index == 8)  sugarTmp = nutrition.text();
            if(index ==11)  caffeineTmp = nutrition.text();
            index += 1;
        }
    } catch (IOException e){
        e.printStackTrace();
    }



    private DataPoint[] getDataPoint() {
        // creating a variable for data point.
        DataPoint[] dataPoints = new DataPoint[]
                {
                        // on below line we are adding a new
                        // data point to our Data Point class.
                        new DataPoint(userSugar, userCaffeine),
                        new DataPoint(0, 1),
                        new DataPoint(1, 2),
                        new DataPoint(2, 3),
                        new DataPoint(3, 5),
                        new DataPoint(4, 1),
                        new DataPoint(4, 3),
                        new DataPoint(5, 3),
                        new DataPoint(6, 2)
                };
        // at last we are returning
        // the data point class.
        return dataPoints;
    }
}
