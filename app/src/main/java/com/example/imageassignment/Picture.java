package com.example.imageassignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class Picture extends Activity {

    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private int imageid1, imageid2, imageid3, imageid4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picture_layout);


    addPlaceView();

    initListeners();

    extractInput();

   }

    private void extractInput()
    {
        Intent intent =getIntent();
        Bundle bundle = intent.getExtras();

        imageid1 =bundle.getInt("img1");
        imageid2 =bundle.getInt("img2");
        imageid3 =bundle.getInt("img3");
        imageid4 =bundle.getInt("img4");

        img1.setImageResource(imageid1);
        img2.setImageResource(imageid2);
        img3.setImageResource(imageid3);
        img4.setImageResource(imageid4);

    }
    private void addPlaceView()
    {
        img1 =findViewById(R.id.imageid1);
        img2 =findViewById(R.id.imageid2);
        img3 =findViewById(R.id.imageid3);
        img4 =findViewById(R.id.imageid4);
    }
    private void initListeners()
    {
        img1.setOnClickListener(new Place1Click());
        img2.setOnClickListener(new Place2Click());
        img3.setOnClickListener(new Place3Click());
        img4.setOnClickListener(new Place4Click());

    }

    private class Place1Click implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            Intent resultIntent= new Intent();
            resultIntent.putExtra("result",imageid1);
            setResult(1,resultIntent);
            finish();

        }
    }

    private class Place2Click implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            Intent resultIntent= new Intent();
            resultIntent.putExtra("result",imageid2);
            setResult(1,resultIntent);
            finish();

        }
    }
    private class Place3Click implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            Intent resultIntent= new Intent();
            resultIntent.putExtra("result",imageid3);
            setResult(1,resultIntent);
            finish();

        }
    }
    private class Place4Click implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            Intent resultIntent= new Intent();
            resultIntent.putExtra("result",imageid4);
            setResult(1,resultIntent);
            finish();

        }
    }
}
