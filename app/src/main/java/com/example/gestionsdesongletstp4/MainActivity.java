package com.example.gestionsdesongletstp4;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.gestionsdesongletstp4.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Créer un adaptateur qui retourne un fragment
        // pour chacune des sections de l'activité
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());

        // dire au viewpager d'utiliser cet adaptateur
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        //On décide de ne pas afficher le tabLayout
        // Décommenter la partie ci-dessous et celle du tablout dans activity_main.xml pour l'afficher
        /*TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);*/


        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Snackbar snackbar = Snackbar.make(findViewById(R.id.view_pager),"This is a snakbar for Setting", Snackbar.LENGTH_INDEFINITE);
            snackbar.show();
            return true;
        }

        if (id == R.id.message) {
            Snackbar snackbar = Snackbar.make(findViewById(R.id.view_pager),"This is a snakbar for message", Snackbar.LENGTH_INDEFINITE);
            snackbar.show();
            return true;
        }

        if (id == R.id.notif) {
            Snackbar snackbar = Snackbar.make(findViewById(R.id.view_pager),"This is a snakbar for notif", Snackbar.LENGTH_INDEFINITE);
            snackbar.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}