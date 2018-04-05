package com.undead.nosavvy.paginasamarillas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.undead.nosavvy.paginasamarillas.adapters.BusinessAdapter;
import com.undead.nosavvy.paginasamarillas.repositories.BusinessRepository;

public class ResultActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        String word = getIntent().getStringExtra("word");
        BusinessAdapter businessAdapter = new BusinessAdapter();
       // businessAdapter.setBusiness(BusinessRepository.getList());
        //INVOCAR FUNCION LAMBDA
        businessAdapter.setBusiness(BusinessRepository.search(word));
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        recyclerView.setAdapter(businessAdapter);

    }
}
