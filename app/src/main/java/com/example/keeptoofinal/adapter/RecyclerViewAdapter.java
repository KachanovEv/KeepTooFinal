package com.example.keeptoofinal.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.keeptoofinal.R;
import com.example.keeptoofinal.model.Data;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Data> items;

    public void setData(ArrayList<Data> itemsData) {
        this.items = itemsData;
        notifyDataSetChanged();
    }

    @NotNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent,
                                                             int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int position) {
        Glide.with(viewHolder.itemView.getContext())
                .load(items.get(position).imageId).into(viewHolder.media_image);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView media_image;

        ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            media_image = itemLayoutView.findViewById(R.id.media_image);
        }
    }
}