package com.citec.asus.crecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Fotografia> fotos;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView)findViewById(R.id.recycler);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);

        inicializarDatos();
        inicializarAdapter();
    }

    public void inicializarDatos(){
        fotos = new ArrayList<>();
        fotos.add(new Fotografia("Foto Autor: Javer Bardem", R.drawable.paris));
        fotos.add(new Fotografia("Foto Autor: Ernesto Gutierrez", R.drawable.tierra));
        fotos.add(new Fotografia("Foto Autor: Martin Adan", R.drawable.cielo));
    }

    public void inicializarAdapter(){
        RecyclerAdap reAda = new RecyclerAdap(fotos);
        rv.setAdapter(reAda);
    }
}
