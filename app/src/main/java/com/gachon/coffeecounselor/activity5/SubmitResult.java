package com.gachon.coffeecounselor.activity5;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gachon.coffeecounselor.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//import com.bytecode.opencsv.CSVWriter; // Need to import CSVWriter (to save 2d array)
// -> not working properly yet...
import com.opencsv.CSVWriter;


public class SubmitResult extends AppCompatActivity {

    /*
    // executing python file from java -> not working properly yet...
    if (!Python.isStarted()){
        Python.start(new AndroidPlatform());
    }
    */

    Document doc;
    Elements Nutrition;
    String sugarTmp, caffeineTmp;
    int index;
    // arrays to save X:caffeine, Y=sugar
    String[] X = new String[50];
    String[] Y = new String[50];
    String[][] data = new String[50][2];
    int cnt1 = 0, cnt2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_result);

        final Bundle bundle = new Bundle();

        new Thread(){
            @Override
            public void run(){
                try {
                    // menu1
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu1").get();
                    Nutrition = doc.select("tr#faq5 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }

                    // menu3
                    /*
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu3").get();
                    for(int i=10;i<=14;i++){
                    }
                    for(int i=20;i<=25;i++){
                    }
                    */

                    // menu4
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu4").get();
                    Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }

                    // menu5
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu5").get();
                    Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq4 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq5 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq6 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }

                    // menu6
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu6").get();
                    Nutrition = doc.select("tr#faq0 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq1 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq2 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq3 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq7 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq8 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq9 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq10 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq11 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq12 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq13 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }
                    Nutrition = doc.select("tr#faq14 td table tbody tr td table tr[class=text13explain] td");
                    index=0;
                    for(Element nutrition : Nutrition){
                        if(index == 7)  sugarTmp = nutrition.text(); sugarTmp = sugarTmp.substring(0,-2);
                        if(index == 11)  caffeineTmp = nutrition.text(); caffeineTmp = caffeineTmp.substring(0,-3);
                        X[cnt1++] = caffeineTmp; Y[cnt2++] = sugarTmp;
                        index += 1;
                    }


                    /*
                    // menu7
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu7").get();
                    for(int i=0;i<=37;i+=2){

                    }

                    // menu9
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu9").get();
                    for(int i=0;i<=6;i+=2){

                    }

                    // menu10
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu10").get();
                    for(int i=10;i<=18;i++){

                    }
                    for(int i=30;i<=39;i++){

                    }

                    // menu11
                    doc = Jsoup.connect("http://www.megacoffee.me/bbs/content.php?co_id=menu11").get();
                    for(int i=0;i<=4;i++){

                    }
                    */


                    // get appropriate userSugar, userCaffeine value from Recommendation class
                    Intent intent = getIntent();
                    int userSugar = intent.getIntExtra("userSugar", 0);
                    int userCaffeine = intent.getIntExtra("userCaffeine", 0);

                    // write data using CSVWriter
                    CSVWriter writer = new CSVWriter(new FileWriter("./sample.csv"));
                    String[] entries1 = {Integer.toString(userSugar), Integer.toString(userCaffeine)};
                    writer.writeNext(entries1);

                    writer.close();

                    /*
                    for(int j=0;j<2;j++){
                        for(int i=0;i<X.length;j++){
                            if(j==0) data[i][j] = X[i];
                            if(j==1) data[i][j] = Y[i];
                        }
                    }
                    */

                    //exportDataToExcel("C:\\Users\\chado\\clustering.csv", data);



                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }.start();


    }


    /*
    public static void exportDataToExcel(String fileName, int[][] data) throws FileNotFoundException, IOException
    {
        File file = new File(fileName);
        if (!file.isFile())
            file.createNewFile();

        CSVWriter csvWriter = new CSVWriter(new FileWriter(file));

        int rowCount = data.length;

        for (int i = 0; i < rowCount; i++)
        {
            int columnCount = data[i].length;
            String[] values = new String[columnCount];
            for (int j = 0; j < columnCount; j++)
            {
                values[j] = data[i][j] + "";
            }
            csvWriter.writeNext(values);
        }

        csvWriter.flush();
        csvWriter.close();
    }
    */


}
