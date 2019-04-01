package com.example.keeptoofinal.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.keeptoofinal.R;
import com.example.keeptoofinal.model.Data;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<Data> itemsData;

    public void setData(ArrayList<Data> itemsData) {
        this.itemsData = itemsData;
        notifyDataSetChanged();


    }


    public RecyclerViewAdapter() {
        this.itemsData = itemsData;
    }


    @NotNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent,
                                                             int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item, parent, false);

        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int position) {
//        Glide.with(this.context).load(itemsData.get(position).imageId).into(viewHolder.media_image);
    }



    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView media_image;

        ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            media_image = itemLayoutView.findViewById(R.id.media_image);
        }
    }


    @Override
    public int getItemCount() {
        return itemsData.size();
    }
}