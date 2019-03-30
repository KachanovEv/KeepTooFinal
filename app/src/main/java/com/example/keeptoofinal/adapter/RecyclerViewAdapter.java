package com.example.keeptoofinal.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.keeptoofinal.R;
import com.example.keeptoofinal.model.Data;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Data[] itemsData;

    public RecyclerViewAdapter(Data[] itemsData) {
        this.itemsData = itemsData;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item, null);

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {


    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView1;
        public ImageView media_image;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);

        }
    }


    @Override
    public int getItemCount() {
        return itemsData.length;
    }
}