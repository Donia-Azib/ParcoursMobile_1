package com.example.parcoursmobile_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Poor_2 extends AppCompatActivity {

    private TextView name,card_number,amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poor_2);


        name = findViewById(R.id.txt_name);
        card_number = findViewById(R.id.txt_card_number);
        amount = findViewById(R.id.txt_amount);

//        --1step : tekho el intent
        Intent reception = getIntent();
        String str_name = reception.getStringExtra("str_name");
//        String str_amount = reception.getStringExtra("str_amount");
        String str_card_number = reception.getStringExtra("str_card_number ");
        int str_amount_int = reception.getIntExtra("str_amount",0);


//        --n3abi les textView
        name.setText("Name : "+str_name);
        card_number.setText("Card Number : "+str_card_number);
        amount.setText("Amount : "+str_amount_int);

    }
}
