package com.example.applicationsiah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class menu_basket extends AppCompatActivity {
    boolean retour=false;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);

        return true;
        //  retu rn super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.retour) {
            retour = true;
            retour();
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_basket);
        Button button_meneur = (Button) findViewById(R.id.button_meneur);
        button_meneur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visualiser_menu_basket_meneur();
            }

            });
            Button button_aillier = (Button) findViewById(R.id.button_aillier);
            button_aillier.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    visualiser_menu_basket_aillier();
                }


            });

            Button button_interieur = (Button) findViewById(R.id.button_interieur);
            button_interieur.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    visualiser_menu_basket_interieur();
                }
            });

        }


        private void visualiser_menu_basket_meneur () {
            Intent intent1 = new Intent(this, menu_basket_meneur.class);
            startActivity(intent1);
        }


        private void visualiser_menu_basket_aillier () {
            Intent intent2 = new Intent(this, menu_basket_aillier.class);
            startActivity(intent2);
        }

        private void visualiser_menu_basket_interieur () {
            Intent intent3 = new Intent(this, menu_basket_interieur.class);
            startActivity(intent3);
        }
    private void retour() {
        Intent intent60 = new Intent(this, Menu_sport.class);
        startActivity(intent60);
    }

    }
