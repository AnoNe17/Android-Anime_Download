package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class GenreActivity extends AppCompatActivity {

    TextView txGenre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        Toolbar toolbar = findViewById(R.id.toolbarGenre);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txGenre = findViewById(R.id.txgenre);
        txGenre.setText((getIntent().getStringExtra("nama_genre")));
    }
}