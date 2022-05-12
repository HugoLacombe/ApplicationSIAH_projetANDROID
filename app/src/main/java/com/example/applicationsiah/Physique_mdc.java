package com.example.applicationsiah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Physique_mdc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physique_mdc);
        ImageView image1 = (ImageView) findViewById(R.id.imageendurance);
        Button endurance = (Button) findViewById(R.id.btn_exo_1);
        ImageView image2 = (ImageView) findViewById(R.id.imagevivacite);
        image2.setVisibility(View.INVISIBLE);
        TextView text1 = (TextView) findViewById(R.id.textendurance);
        TextView text2 = (TextView) findViewById(R.id.textvivacite);
        Button vivacite = (Button) findViewById(R.id.btn_exo2);
        text2.setVisibility((View.INVISIBLE));
        ImageView image3 = (ImageView) findViewById(R.id.imageexplosivite);
        image3.setVisibility(View.INVISIBLE);
        Button explosivite = (Button) findViewById(R.id.btn_exo_3);
        TextView text3 = (TextView) findViewById(R.id.textexplosivite);
        text3.setVisibility((View.INVISIBLE));
        vivacite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.INVISIBLE);

                text1.setVisibility((View.INVISIBLE));
                text2.setVisibility((View.VISIBLE));
                text3.setVisibility((View.INVISIBLE));
            }
        });
        endurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);

                text2.setVisibility((View.INVISIBLE));
                text1.setVisibility((View.VISIBLE));
                text3.setVisibility((View.INVISIBLE));
            }
        });
        explosivite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.VISIBLE);

                text2.setVisibility((View.INVISIBLE));
                text1.setVisibility((View.INVISIBLE));
                text3.setVisibility((View.VISIBLE));
            }
        });
    }
}