package com.example.mishlahul.nbabasketballteams;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.mishlahul.nbabasketballteams.adapter.MainAdapter;
import com.example.mishlahul.nbabasketballteams.model.MainModel;

import java.util.LinkedList;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<MainModel> listTim = new LinkedList<>();
    private RecyclerView recyclerView;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        changeLanguage();

        String dCeltics = "Boston Celtics adalah tim bola basket dari kota Boston, Massachusetts, Amerika Serikat yang tergabung dalam National Basketball Association. Mereka sampai saat ini masih memegang rekor juara NBA sebanyak 17 kali (1957, 1959, 1960, 1961, 1962, 1963, 1964, 1965, 1966, 1968, 1969, 1974, 1976, 1981, 1984, 1986 dan 2008).";
        String dKnicks = "New York Knicks adalah tim bola basket Amerika Serikat yang tergabung dalam National Basketball Association. Tim ini berbasis di New York City, New York. Klub New York Knicks berkompetisi di liga NBA di Divisi Atlantik, Wilayah Timur.";
        String dBulls = "Chicago Bulls adalah tim bola basket Amerika Serikat yang tergabung dalam National Basketball Association. Tim ini berbasis di Chicago, Illinois. Nama Chicago Bulls diberikan oleh pemilik klub, Dick Klein, berdasarkan nama sebuah industri peternakan yang ada di kota tersebut";
        String dCavaliers = "Cleveland Cavaliers adalah tim bola basket Amerika yang tergabung dalam National Basketball Association. Tim ini berbasis di Cleveland, Ohio. Tim ini mulai bermain di NBA pada tahun 1970 sebagai sebuah tim baru. Prestasi terbaik tim ini adalah menjadi juara Wilayah Timur (untuk pertama kali pada tahun 2007.";
        String dBucks = "Milwaukee Bucks adalah tim bola basket Amerika yang tergabung dalam National Basketball Association. Tim ini berbasis di Milwaukee, Wisconsin.";
        String dHeat = "Miami Heat adalah tim bola basket Amerika yang tergabung dalam National Basketball Association. Tim ini berbasis di Miami, Florida. Didirikan pada tahun 1988. Klub ini memainkan pertandingan kandangnya di American Airlines Arena sejak tahun 1999. Seragam mereka berwarna merah. Hingga saat ini, mereka berhasil meraih tiga gelar juara, yaitu pada tahun 2006, 2012, dan 2013.";

        listTim.addLast(new MainModel("Boston Celtics", "Boston, MA", dCeltics, R.drawable.celtics));
        listTim.addLast(new MainModel("New York Knicks","New York, NY", dKnicks, R.drawable.knicks));
        listTim.addLast(new MainModel("Chicago Bulls","Chicago, IL", dBulls, R.drawable.bulls));
        listTim.addLast(new MainModel("Cleveland Cavaliers","Cleveland, OH", dCavaliers, R.drawable.cavs));
        listTim.addLast(new MainModel("Milwaukee Bucks","Milwaukee, WI", dBucks, R.drawable.bucks));
        listTim.addLast(new MainModel("Miami Heat","Miami, FL", dHeat, R.drawable.heat));

        recyclerView = findViewById(R.id.list_menu);
        mainAdapter = new MainAdapter(MainActivity.this,listTim);
        recyclerView.setAdapter(mainAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void changeLanguage() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.profile:
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                return true;
            case R.id.gantiBahasa:
                Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(mIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
