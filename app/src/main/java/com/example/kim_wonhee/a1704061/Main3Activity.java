package com.example.kim_wonhee.a1704061;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kim_wonhee.a1704061.R;

public class Main3Activity extends AppCompatActivity {


    TextView name, menu1, menu2, menu3, phone, page, now;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("나의 맛집");
        init();
        //
        // write_data();
    }

    void init() {

        name = (TextView) findViewById(R.id.txtname);
        menu1 = (TextView) findViewById(R.id.tvMenu1);
        menu2 = (TextView) findViewById(R.id.tvMenu2);
        menu3 = (TextView) findViewById(R.id.tvMenu3);
        phone = (TextView) findViewById(R.id.tvTel);
        page = (TextView) findViewById(R.id.tvURL);
        now = (TextView) findViewById(R.id.tvRegdate);

        image = (ImageView) findViewById(R.id.imgno);


        Intent intent = getIntent();
        Data store = intent.getParcelableExtra("data");

        name.setText(store.getName());
        menu1.setText(store.getMenu1());
        menu2.setText(store.getMenu2());
        menu3.setText(store.getMenu3());
        phone.setText(store.getPhone());
        page.setText(store.getPage());
        now.setText(store.getNow());

        if (store.getFood().toString().equals("치킨")) {
            image.setImageResource(R.drawable.chicken);
        } else if (store.getFood().toString().equals("피자")) {
            image.setImageResource(R.drawable.pizza);
        } else if (store.getFood().toString().equals("버거")) {
            image.setImageResource(R.drawable.burger);
        }

    }

    public void onClick(View v) {

        if (v.getId() == R.id.imageView2) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:/" + phone.getText()));
            startActivity(intent);
        } else if (v.getId() == R.id.imageView3) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + page.getText()));
            startActivity(intent);
        } else if (v.getId() == R.id.btnback) {
            Intent intent = new Intent();
            setResult(RESULT_OK, intent);
            finish();
        }

    }

    void write_data() {


    }


}