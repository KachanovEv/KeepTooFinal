package com.example.keeptoofinal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.keeptoofinal.adapter.RecyclerViewAdapter;
import com.example.keeptoofinal.model.Data;

import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;




public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    private List<Data> Data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerViewImages);
        recyclerView.setHasFixedSize(true);
        ArrayList<Data> Data= new ArrayList<>();

        Data.add(new Data( R.drawable.mask1 ));
        Data.add(new Data( R.drawable.mask ));
        Data.add(new Data( R.drawable.maskcopy2 ));
        Data.add(new Data( R.drawable.maskcopy ));



        RecyclerViewAdapter adapter;
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        adapter = new RecyclerViewAdapter(Data);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }





}
