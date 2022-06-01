package com.example.imageassignment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView andriodimg;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addView();
        initListener();

    }

    private void addView() {
        andriodimg = findViewById(R.id.imageprofile);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
    }

    private void initListener() {
        button1.setOnClickListener(new BtnmaharashtraClick());
        button2.setOnClickListener(new BtnpanjabClick());
        button3.setOnClickListener(new BtnassamClick());
        button4.setOnClickListener(new BtnrajasthanClick());

    }


    private class BtnmaharashtraClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intentobj = new Intent(MainActivity.this, Picture.class);
            intentobj.putExtra("img1",R.drawable.maharashtra1);
            intentobj.putExtra("img2",R.drawable.maharashtra2);
            intentobj.putExtra("img3",R.drawable.maharashtra3);
            intentobj.putExtra("img4",R.drawable.maharashtra4);

           startActivityForResult(intentobj,1);
           //startActivity(intentobj);

        }
    }
   private class BtnpanjabClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intentobj = new Intent(MainActivity.this, Picture.class);
            intentobj.putExtra("img1",R.drawable.panjab1);
            intentobj.putExtra("img2",R.drawable.panjab2);
            intentobj.putExtra("img3",R.drawable.panjab3);
            intentobj.putExtra("img4",R.drawable.panjab4);

            startActivityForResult(intentobj,1);


        }
    }
    private class BtnassamClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intentobj = new Intent(MainActivity.this, Picture.class);
            intentobj.putExtra("img1",R.drawable.assam1);
            intentobj.putExtra("img2",R.drawable.assam2);
            intentobj.putExtra("img3",R.drawable.assam3);
            intentobj.putExtra("img4",R.drawable.assam4);

            startActivityForResult(intentobj,1);

        }
    }
    private  class BtnrajasthanClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intentobj = new Intent(MainActivity.this, Picture.class);
            intentobj.putExtra("img1",R.drawable.rajasthan1);
            intentobj.putExtra("img2",R.drawable.rajasthan2);
            intentobj.putExtra("img3",R.drawable.rajasthan3);
            intentobj.putExtra("img4",R.drawable.rajasthan4);

            startActivityForResult(intentobj,1);

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data==null)
        {
            return;
        }
        Bundle bundle = data.getExtras();
        result=bundle.getInt("result");
        andriodimg.setImageResource(result);
    }
}