package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URI;

public class Recipes_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes_activity);

        ImageView imageView = findViewById(R.id.imageView);
        TextView  textName = findViewById(R.id.textViewTitle);
        TextView textInstruction = findViewById(R.id.textViewInfo);

        Intent intent = getIntent();
        if (intent != null) {
            //imageView.setImageURI(URI.parse);
            //imageView.setImageURI(intent);
            textName.setText(intent.getStringExtra("textName"));
            textInstruction.setText(intent.getStringExtra("textInstruction"));
        }

    }
}