package com.example.kim_wonhee.a1704061;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.kim_wonhee.a1704061.R;

import java.text.SimpleDateFormat;
import java.util.Date;

import static android.R.attr.data;

public class Main2Activity extends AppCompatActivity {

    EditText name, phone, menu1, menu2, menu3, page;

    RadioButton chicken, pizza, burger;

    String data_name, data_food, data_phone, data_menu1, data_menu2, data_menu3, data_page, data_now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("나의 맛집");
        init();
    }

    void init() {

        name = (EditText) findViewById(R.id.etname);
        phone = (EditText) findViewById(R.id.ettel);
        menu1 = (EditText) findViewById(R.id.etmenu1);
        menu2 = (EditText) findViewById(R.id.etmenu2);
        menu3 = (EditText) findViewById(R.id.etmenu3);
        page = (EditText) findViewById(R.id.etaddr);

        chicken = (RadioButton) findViewById(R.id.radio1);
        pizza = (RadioButton) findViewById(R.id.radio2);
        burger = (RadioButton) findViewById(R.id.radio3);

    }

    public void onClick(View v) {

        if (v.getId() == R.id.btnAdd) {

            long now = System.currentTimeMillis();
            Date date = new Date(now);
            SimpleDateFormat sdfnow = new SimpleDateFormat("yyyy/MM/dd");
            data_now = sdfnow.format(date);

            if (chicken.isChecked()) {
                data_food = "치킨";
            } else if (pizza.isChecked()) {
                data_food = "피자";
            } else if (burger.isChecked()) {
                data_food = "버거";
            }

            data_name = name.getText().toString();
            data_phone = phone.getText().toString();
            data_menu1 = menu1.getText().toString();
            data_menu2 = menu2.getText().toString();
            data_menu3 = menu3.getText().toString();
            data_page = page.getText().toString();

            Data store = new Data(data_name, data_food, data_phone, data_menu1, data_menu2, data_menu3, data_page, data_now);

            Intent intent = new Intent();
            intent.putExtra("one", store);
            setResult(RESULT_OK, intent);
            finish();
        } else if (v.getId() == R.id.btnCancel) {
            finish();
        }

    }

}
