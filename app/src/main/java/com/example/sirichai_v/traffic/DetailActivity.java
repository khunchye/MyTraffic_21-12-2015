package com.example.sirichai_v.traffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปล
    private TextView titilTextView, detailTextView;
    private ImageView trafficImageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind  Widget
        bindWidget();

        //Show View
        showView();


    }   //Main Method

    private void showView() {

        //Show Title
        String strTitle = getIntent().getStringExtra("Title");
        titilTextView.setText(strTitle);

        //Show Image
        int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageview.setImageResource(intIcon);

        //Show Detail
        String[] strDetail = getResources().getStringArray(R.array.detail_long);
        int intIndex = getIntent().getIntExtra("Index", 0);
        detailTextView.setText(strDetail[intIndex]);


    }   //Show View

    private void bindWidget() {
        titilTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        trafficImageview = (ImageView) findViewById(R.id.imageView2);
    }

}   // Maim Class
