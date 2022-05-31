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
    String[] sugarTmp = new String[100];
    String[] caffeineTmp = new String[100];

    public void nutriInfo(){

        try{
            // COFFEE
            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();

            Nutritions = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[0] = nutrition.text();
                if(index ==11)  caffeineTmp[0] = nutrition.text();
                index += 1;
            }
            sugarTmp[0] = sugarTmp[0].substring(0,-2);
            caffeineTmp[0] = caffeineTmp[0].substring(0,-3);


            Nutritions = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[1] = nutrition.text();
                if(index ==11)  caffeineTmp[1] = nutrition.text();
                index += 1;
            }
            sugarTmp[1] = sugarTmp[1].substring(0,-2);
            caffeineTmp[1] = caffeineTmp[1].substring(0,-3);

            Nutritions = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[2] = nutrition.text();
                if(index ==11)  caffeineTmp[2] = nutrition.text();
                index += 1;
            }
            sugarTmp[2] = sugarTmp[2].substring(0,-2);
            caffeineTmp[2] = caffeineTmp[2].substring(0,-3);

            Nutritions = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[3] = nutrition.text();
                if(index ==11)  caffeineTmp[3] = nutrition.text();
                index += 1;
            }
            sugarTmp[3] = sugarTmp[3].substring(0,-2);
            caffeineTmp[3] = caffeineTmp[3].substring(0,-3);

            Nutritions = doc.select("tr#faq4 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[4] = nutrition.text();
                if(index ==11)  caffeineTmp[4] = nutrition.text();
                index += 1;
            }
            sugarTmp[4] = sugarTmp[4].substring(0,-2);
            caffeineTmp[4] = caffeineTmp[4].substring(0,-3);

            Nutritions = doc.select("tr#faq5 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[5] = nutrition.text();
                if(index ==11)  caffeineTmp[5] = nutrition.text();
                index += 1;
            }
            sugarTmp[5] = sugarTmp[5].substring(0,-2);
            caffeineTmp[5] = caffeineTmp[5].substring(0,-3);

            Nutritions = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[6] = nutrition.text();
                if(index ==11)  caffeineTmp[6] = nutrition.text();
                index += 1;
            }
            sugarTmp[6] = sugarTmp[6].substring(0,-2);
            caffeineTmp[6] = caffeineTmp[6].substring(0,-3);

            Nutritions = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[7] = nutrition.text();
                if(index ==11)  caffeineTmp[7] = nutrition.text();
                index += 1;
            }
            sugarTmp[7] = sugarTmp[7].substring(0,-2);
            caffeineTmp[7] = caffeineTmp[7].substring(0,-3);

            Nutritions = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[8] = nutrition.text();
                if(index ==11)  caffeineTmp[8] = nutrition.text();
                index += 1;
            }
            sugarTmp[8] = sugarTmp[8].substring(0,-2);
            caffeineTmp[8] = caffeineTmp[8].substring(0,-3);

            Nutritions = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[9] = nutrition.text();
                if(index ==11)  caffeineTmp[9] = nutrition.text();
                index += 1;
            }
            sugarTmp[9] = sugarTmp[9].substring(0,-2);
            caffeineTmp[9] = caffeineTmp[9].substring(0,-3);


            // LATTE
            doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();

            Nutritions = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[10] = nutrition.text();
                if(index ==11)  caffeineTmp[10] = nutrition.text();
                index += 1;
            }
            sugarTmp[10] = sugarTmp[10].substring(0,-2);
            caffeineTmp[10] = caffeineTmp[10].substring(0,-3);

            Nutritions = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[11] = nutrition.text();
                if(index ==11)  caffeineTmp[11] = nutrition.text();
                index += 1;
            }
            sugarTmp[11] = sugarTmp[11].substring(0,-2);
            caffeineTmp[11] = caffeineTmp[11].substring(0,-3);

            Nutritions = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[12] = nutrition.text();
                if(index ==11)  caffeineTmp[12] = nutrition.text();
                index += 1;
            }
            sugarTmp[12] = sugarTmp[12].substring(0,-2);
            caffeineTmp[12] = caffeineTmp[12].substring(0,-3);

            Nutritions = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[13] = nutrition.text();
                if(index ==11)  caffeineTmp[13] = nutrition.text();
                index += 1;
            }
            sugarTmp[13] = sugarTmp[13].substring(0,-2);
            caffeineTmp[13] = caffeineTmp[13].substring(0,-3);

            Nutritions = doc.select("tr#faq4 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[14] = nutrition.text();
                if(index ==11)  caffeineTmp[14] = nutrition.text();
                index += 1;
            }
            sugarTmp[14] = sugarTmp[14].substring(0,-2);
            caffeineTmp[14] = caffeineTmp[14].substring(0,-3);

            Nutritions = doc.select("tr#faq5 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[15] = nutrition.text();
                if(index ==11)  caffeineTmp[15] = nutrition.text();
                index += 1;
            }
            sugarTmp[15] = sugarTmp[15].substring(0,-2);
            caffeineTmp[15] = caffeineTmp[15].substring(0,-3);

            Nutritions = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[16] = nutrition.text();
                if(index ==11)  caffeineTmp[16] = nutrition.text();
                index += 1;
            }
            sugarTmp[16] = sugarTmp[16].substring(0,-2);
            caffeineTmp[16] = caffeineTmp[16].substring(0,-3);

            Nutritions = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[17] = nutrition.text();
                if(index ==11)  caffeineTmp[17] = nutrition.text();
                index += 1;
            }
            sugarTmp[17] = sugarTmp[17].substring(0,-2);
            caffeineTmp[17] = caffeineTmp[17].substring(0,-3);

            Nutritions = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[18] = nutrition.text();
                if(index ==11)  caffeineTmp[18] = nutrition.text();
                index += 1;
            }
            sugarTmp[18] = sugarTmp[18].substring(0,-2);
            caffeineTmp[18] = caffeineTmp[18].substring(0,-3);

            Nutritions = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[19] = nutrition.text();
                if(index ==11)  caffeineTmp[19] = nutrition.text();
                index += 1;
            }
            sugarTmp[19] = sugarTmp[19].substring(0,-2);
            caffeineTmp[19] = caffeineTmp[19].substring(0,-3);

            Nutritions = doc.select("tr#faq11 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[20] = nutrition.text();
                if(index ==11)  caffeineTmp[20] = nutrition.text();
                index += 1;
            }
            sugarTmp[20] = sugarTmp[20].substring(0,-2);
            caffeineTmp[20] = caffeineTmp[20].substring(0,-3);

            Nutritions = doc.select("tr#faq12 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[21] = nutrition.text();
                if(index ==11)  caffeineTmp[21] = nutrition.text();
                index += 1;
            }
            sugarTmp[21] = sugarTmp[21].substring(0,-2);
            caffeineTmp[21] = caffeineTmp[21].substring(0,-3);

            Nutritions = doc.select("tr#faq13 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[22] = nutrition.text();
                if(index ==11)  caffeineTmp[22] = nutrition.text();
                index += 1;
            }
            sugarTmp[22] = sugarTmp[22].substring(0,-2);
            caffeineTmp[22] = caffeineTmp[22].substring(0,-3);

            Nutritions = doc.select("tr#faq14 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[23] = nutrition.text();
                if(index ==11)  caffeineTmp[23] = nutrition.text();
                index += 1;
            }
            sugarTmp[23] = sugarTmp[23].substring(0,-2);
            caffeineTmp[23] = caffeineTmp[23].substring(0,-3);

            Nutritions = doc.select("tr#faq15 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[24] = nutrition.text();
                if(index ==11)  caffeineTmp[24] = nutrition.text();
                index += 1;
            }
            sugarTmp[24] = sugarTmp[24].substring(0,-2);
            caffeineTmp[24] = caffeineTmp[24].substring(0,-3);

            Nutritions = doc.select("tr#faq16 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[25] = nutrition.text();
                if(index ==11)  caffeineTmp[25] = nutrition.text();
                index += 1;
            }
            sugarTmp[25] = sugarTmp[25].substring(0,-2);
            caffeineTmp[25] = caffeineTmp[25].substring(0,-3);

            Nutritions = doc.select("tr#faq17 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[26] = nutrition.text();
                if(index ==11)  caffeineTmp[26] = nutrition.text();
                index += 1;
            }
            sugarTmp[26] = sugarTmp[26].substring(0,-2);
            caffeineTmp[26] = caffeineTmp[26].substring(0,-3);

            Nutritions = doc.select("tr#faq18 td table tbody tr td table tr[class=text13explain] td");
            index = 0;
            for(Element nutrition : Nutritions){
                if(index == 8)  sugarTmp[27] = nutrition.text();
                if(index ==11)  caffeineTmp[27] = nutrition.text();
                index += 1;
            }
            sugarTmp[27] = sugarTmp[27].substring(0,-2);
            caffeineTmp[27] = caffeineTmp[27].substring(0,-3);
        } catch (IOException e){
            e.printStackTrace();
        }


    }


    private DataPoint[] getDataPoint() {
        // creating a variable for data point.
        DataPoint[] dataPoints = new DataPoint[]
                {
                        // on below line we are adding a new
                        // data point to our Data Point class.

                        // save points to python dataframe (via excel if we can),
                        // find centroids of each cluster using k-means clustering
                        // and find the nearest cluster from user dot using distance measures.
                        new DataPoint(Integer.parseInt(sugarTmp[0]), Integer.parseInt(caffeineTmp[0])),
                        new DataPoint(Integer.parseInt(sugarTmp[1]), Integer.parseInt(caffeineTmp[1])),
                        new DataPoint(Integer.parseInt(sugarTmp[2]), Integer.parseInt(caffeineTmp[2])),
                        new DataPoint(Integer.parseInt(sugarTmp[3]), Integer.parseInt(caffeineTmp[3])),
                        new DataPoint(Integer.parseInt(sugarTmp[4]), Integer.parseInt(caffeineTmp[4])),
                        new DataPoint(Integer.parseInt(sugarTmp[5]), Integer.parseInt(caffeineTmp[5])),
                        new DataPoint(Integer.parseInt(sugarTmp[6]), Integer.parseInt(caffeineTmp[6])),
                        new DataPoint(Integer.parseInt(sugarTmp[7]), Integer.parseInt(caffeineTmp[7])),
                        new DataPoint(Integer.parseInt(sugarTmp[8]), Integer.parseInt(caffeineTmp[8])),
                        new DataPoint(Integer.parseInt(sugarTmp[9]), Integer.parseInt(caffeineTmp[9])),
                        new DataPoint(Integer.parseInt(sugarTmp[10]), Integer.parseInt(caffeineTmp[10])),
                        new DataPoint(Integer.parseInt(sugarTmp[11]), Integer.parseInt(caffeineTmp[11])),
                        new DataPoint(Integer.parseInt(sugarTmp[12]), Integer.parseInt(caffeineTmp[12])),
                        new DataPoint(Integer.parseInt(sugarTmp[13]), Integer.parseInt(caffeineTmp[13])),
                        new DataPoint(Integer.parseInt(sugarTmp[14]), Integer.parseInt(caffeineTmp[14])),
                        new DataPoint(Integer.parseInt(sugarTmp[15]), Integer.parseInt(caffeineTmp[15])),
                        new DataPoint(Integer.parseInt(sugarTmp[16]), Integer.parseInt(caffeineTmp[16])),
                        new DataPoint(Integer.parseInt(sugarTmp[17]), Integer.parseInt(caffeineTmp[17])),
                        new DataPoint(Integer.parseInt(sugarTmp[18]), Integer.parseInt(caffeineTmp[18])),
                        new DataPoint(Integer.parseInt(sugarTmp[19]), Integer.parseInt(caffeineTmp[19])),
                        new DataPoint(Integer.parseInt(sugarTmp[20]), Integer.parseInt(caffeineTmp[20])),
                        new DataPoint(Integer.parseInt(sugarTmp[21]), Integer.parseInt(caffeineTmp[21])),
                        new DataPoint(Integer.parseInt(sugarTmp[22]), Integer.parseInt(caffeineTmp[22])),
                        new DataPoint(Integer.parseInt(sugarTmp[23]), Integer.parseInt(caffeineTmp[23])),
                        new DataPoint(Integer.parseInt(sugarTmp[24]), Integer.parseInt(caffeineTmp[24])),
                        new DataPoint(Integer.parseInt(sugarTmp[25]), Integer.parseInt(caffeineTmp[25])),
                        new DataPoint(Integer.parseInt(sugarTmp[26]), Integer.parseInt(caffeineTmp[26])),
                        new DataPoint(Integer.parseInt(sugarTmp[27]), Integer.parseInt(caffeineTmp[27])),
                        new DataPoint(userSugar, userCaffeine)
                };
        // at last we are returning
        // the data point class.
        return dataPoints;
    }
}


