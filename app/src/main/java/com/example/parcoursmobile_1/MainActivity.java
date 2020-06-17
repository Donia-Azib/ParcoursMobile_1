package com.example.parcoursmobile_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //3 etapes
    //1 decalration des var : before onCreate
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AY TRAITEMENT T7EBOU YOUDHHOR LEL USER LEZEM YKOUN MAWJOUD FEL onCreate
        //2 la relation entre btn(xml) --> btn(java)
        btn = findViewById(R.id.submit);

        //3 gerer l'action
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THANK U FOR UR HELP.....!", Toast.LENGTH_LONG).show();
                //Activity 1 : MainActivity -----> Activity 2 :Poor_1 ==>Intent
                Intent intent = new Intent(MainActivity.this,Poor_1.class);
                startActivity(intent);
            }
        });



    }





}
