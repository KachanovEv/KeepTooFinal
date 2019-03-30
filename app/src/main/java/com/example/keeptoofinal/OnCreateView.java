package com.example.keeptoofinal;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.keeptoofinal.model.Data;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


abstract class OnCreateView extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    private List<Data> Data;

    public void onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        recyclerView = findViewById(R.id.recyclerViewImages);
        recyclerView.setHasFixedSize(true);
        ArrayList<Data> data= new ArrayList<>();

        data.add(new Data( R.drawable.mask1 ));
        data.add(new Data( R.drawable.mask ));
        data.add(new Data( R.drawable.maskcopy2 ));
        data.add(new Data( R.drawable.maskcopy ));



        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(llm);

    }

    protected abstract Context getActivity();

}
