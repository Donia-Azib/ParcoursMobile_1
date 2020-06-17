package com.example.parcoursmobile_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Poor_1 extends AppCompatActivity {

    //1 step
    private Button btn;
    private EditText edit_name,edit_amount,edit_cardNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poor_1);

        //2 step
        btn = findViewById(R.id.submit);
        edit_name = findViewById(R.id.edit_name);
        edit_amount = findViewById(R.id.edit_amount);
        edit_cardNumber = findViewById(R.id.edit_cardNumber);


        //3 step
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                String name = edit_name.getText().toString();
                int amount = Integer.parseInt(edit_amount.getText().toString());
                String card_number = edit_cardNumber.getText().toString();

                if(name.isEmpty() || card_number.isEmpty())
                {
                    Toast.makeText(Poor_1.this, "Complete.....", Toast.LENGTH_SHORT).show();
                }
                else
                {
//                        Poor_1 ---> Poor_2 (+ data)
                    Intent intent = new Intent(Poor_1.this,Poor_2.class);
//                  ==> n3abiw intent DATA(==EXTRA)
//                    ---parametere 1 : key (string) --> id
//                    ---parametere 2 : value (string/int/boolean.....)
                    intent.putExtra("str_name",name);
                    intent.putExtra("str_amount",amount);
                    intent.putExtra("str_card_number",card_number);

                    startActivity(intent);
                }
            }
        });
    }
}
