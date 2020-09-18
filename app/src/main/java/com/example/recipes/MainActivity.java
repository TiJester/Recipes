package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView; // для связи разметки и кода
    private RecyclerView.Adapter adapter; // мост между данными и их отображением на экране
    private RecyclerView.LayoutManager layoutManager; // управление расположением элементов

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.image1, Utils.RECIPES_TITLE_1,
                Utils.RECIPES_DESCRIPTION_1, Utils.RECIPES_INFO_1));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.image2, Utils.RECIPES_TITLE_2,
                Utils.RECIPES_DESCRIPTION_2, Utils.RECIPES_INFO_2));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.image3, Utils.RECIPES_TITLE_3,
                Utils.RECIPES_DESCRIPTION_3, Utils.RECIPES_INFO_3));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.image4, Utils.RECIPES_TITLE_4,
                Utils.RECIPES_DESCRIPTION_4, Utils.RECIPES_INFO_4));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewItemAdapter(recyclerViewItems);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);


    }
}