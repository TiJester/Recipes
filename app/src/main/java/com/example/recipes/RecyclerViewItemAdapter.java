package com.example.recipes;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewItemAdapter extends RecyclerView.Adapter<RecyclerViewItemAdapter.RecyclerViewViewHolder> {

    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;
        public TextView textView3;

        public RecyclerViewViewHolder(@NonNull View itemView) { // Связываем поля с разметкой
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textName);
            textView2 = itemView.findViewById(R.id.textDescription);
            textView3 = itemView.findViewById(R.id.textInstruction);
        }
    }

    private ArrayList<RecyclerViewItem> arrayList;

    public RecyclerViewItemAdapter(ArrayList<RecyclerViewItem> arrayList){
        this.arrayList = arrayList;
    }
    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { // передача разметки
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
