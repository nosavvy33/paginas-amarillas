package com.undead.nosavvy.paginasamarillas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.search)
    EditText search;
    @BindView(R.id.btn_search)
    ImageView btn_search;
    @OnClick(R.id.btn_search)
    public void search(){
        String to_search = String.valueOf(search.getText());
        Intent i = new Intent(this,ResultActivity.class);
        i.putExtra("word",to_search);
        startActivity(i);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
