package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<String> ulkelerList;
    private BasitRVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        // rv.setLayoutManager(new LinearLayoutManager(this)); Dikeyde listeleme yapar
        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        ulkelerList = new ArrayList<>();
        ulkelerList.add("Türkiye");
        ulkelerList.add("Almanya");
        ulkelerList.add("Japonya");
        ulkelerList.add("İsveç");
        ulkelerList.add("Slovenya");
        ulkelerList.add("Letonya");
        ulkelerList.add("Portekiz");
        ulkelerList.add("İspanya");

        adapter = new BasitRVAdapter(this, ulkelerList);
        rv.setAdapter(adapter);
    }
}