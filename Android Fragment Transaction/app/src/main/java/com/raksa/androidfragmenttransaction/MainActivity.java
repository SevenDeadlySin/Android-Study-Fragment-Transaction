package com.raksa.androidfragmenttransaction;

import android.support.v4.app.FragmentManager;
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

        final FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentA fragmentA = new FragmentA();
        final FragmentB fragmentB = new FragmentB();

        buttonAddA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().add(R.id.containerA,fragmentA).commit();
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
                fragmentManager.beginTransaction().add(R.id.containerB,fragmentB).commit();
            }
        });

        buttonRemB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
