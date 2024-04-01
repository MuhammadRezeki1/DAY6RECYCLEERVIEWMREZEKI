package com.example.recyclerezeki;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<logoCar> carLogo;
    logoAdapter logoadapter;

    logoCar logocar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        recyclerView.setLayoutManager(gridLayoutManager);


        carLogo = new ArrayList<>();
        logocar = new logoCar("Ferrari",R.drawable.fr, R.string.ferrari,R.string.HargaFerrari, R.string.dFerrari,getString(R.string.tipefr));
        carLogo.add(logocar);
        logoCar bmw = new logoCar("BMW", R.drawable.bmw,R.string.BMW,R.string.hargabmw,R.string.DBMW,getString(R.string.DBMW));
        carLogo.add(bmw);
        logoCar koenig = new logoCar("Koenigsegg",R.drawable.koe,R.string.koe,R.string.hargakoe,R.string.dkoe,getString(R.string.tipekoe));
        carLogo.add(koenig);
        logoCar lotus = new logoCar("Lotus Renault", R.drawable.lotusrenault,R.string.lotus,R.string.hargalotus,R.string.dlotus,getString(R.string.tipelotus));
        carLogo.add(lotus);
        logoCar mcl = new logoCar("Maclaren",R.drawable.maclaren,R.string.maclaren,R.string.hargamcl,R.string.dmcl,getString(R.string.tipemcl));
        carLogo.add(mcl);
        logoCar mersi = new logoCar("Marcedes Benz",R.drawable.mersi,R.string.mersi,R.string.hargamersi,R.string.dmersi,getString(R.string.tipemersi));
        carLogo.add(mersi);
        logoCar petro = new logoCar("Petronas",R.drawable.ptro,R.string.petro,R.string.hargapetro,R.string.dpetro,getString(R.string.tipepetro));
        carLogo.add(petro);
        logoCar redbuls = new logoCar("Red Bulls",R.drawable.redbuls,R.string.redbuls,R.string.hargaredbuls,R.string.dredbuls,getString(R.string.tiperedbuls));
        carLogo.add(redbuls);
        logoCar bugati = new logoCar("Bugatti",R.drawable.bugati,R.string.bugati,R.string.hargabugati,R.string.dbugati,getString(R.string.tipebugati));
        carLogo.add(bugati);
        logoCar maserati = new logoCar("Maserati",R.drawable.maserati,R.string.maserati,R.string.hargamaserati,R.string.dmaserati,getString(R.string.tipemaserati));
        carLogo.add(maserati);
        logoCar lambo = new logoCar("LamborGini",R.drawable.lamborgini,R.string.lambo,R.string.hargalambo,R.string.dlambo,getString(R.string.tipelambo));
        carLogo.add(lambo);
        logoCar porsche = new logoCar("Porsche",R.drawable.porsche,R.string.porsche,R.string.hargaporsche,R.string.dporsche,getString(R.string.tipeporsche));
        carLogo.add(porsche);
        logoCar peu = new logoCar("Peugeot",R.drawable.peugeot,R.string.peugeot,R.string.hargapeu,R.string.dpeu,getString(R.string.tipepeu));
        carLogo.add(peu);
        logoCar nisan = new logoCar("Nissan",R.drawable.nisan,R.string.nissan,R.string.harganisan,R.string.dnisan,getString(R.string.tipenisan));
        carLogo.add(nisan);
        logoCar toyo = new logoCar("Toyota",R.drawable.toyota,R.string.toyota,R.string.hargatoyota,R.string.dtoyo,getString(R.string.tipetoyo));
        carLogo.add(toyo);
        logoadapter = new logoAdapter(MainActivity.this, carLogo);
        recyclerView.setAdapter(logoadapter);



    }

}