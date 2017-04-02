package com.raksa.androidfragmenttransaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAddA = (Button) findViewById(R.id.buttonAdd1);
        Button buttonRemA = (Button) findViewById(R.id.buttonRem1);
        Button buttonAddB = (Button) findViewById(R.id.buttonAdd2);
        Button buttonRemB = (Button) findViewById(R.id.buttonRem2);


        buttonAddA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttonRemA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        buttonAddB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttonRemB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
