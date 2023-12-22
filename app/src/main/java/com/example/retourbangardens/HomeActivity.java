package com.example.retourbangardens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button tips,stadistic,itemsRegister;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tips=findViewById(R.id.button2);
        stadistis=findViewById(R.id.button3);
        itemsRegister=findViewById(R.id.button4);

        Intent tips= new Intent(getApplicationContext().createPackageContext(),
                TipsActivity.class);

        Intent estadisticas= new Intent(getApplicationContext(),
                StadisticsActivity.class);

        Intent registrarItems= new Intent(getApplicationContext(),
                ItemsRegisterActivity.class);


       tips.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(tips);
           }
      });

        stadistic.setOnClickListener(new View.OnClickListener() {
        }



    }
}