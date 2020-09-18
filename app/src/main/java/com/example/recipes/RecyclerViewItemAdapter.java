package com.example.recipes;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewItemAdapter extends RecyclerView.Adapter<RecyclerViewItemAdapter.RecyclerViewViewHolder> {

    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{ // Кастомный класс

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

        @Override
        public void onClick(View view) {

        }
    }

    private ArrayList<RecyclerViewItem> arrayList;

    public RecyclerViewItemAdapter(ArrayList<RecyclerViewItem> arrayList){
        this.arrayList = arrayList;
    }
    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { // передача разметки
        // return null;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,
                parent, false);
        RecyclerViewViewHolder recyclerViewViewHolder = new RecyclerViewViewHolder(view);
        return recyclerViewViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        RecyclerViewItem recyclerViewItem = arrayList.get(position);

        holder.imageView.setImageResource(recyclerViewItem.getImageResource());
        holder.textView1.setText(recyclerViewItem.getTextName());
        holder.textView2.setText(recyclerViewItem.getTextDescription());
        holder.textView3.setText(recyclerViewItem.getTextInstruction());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
