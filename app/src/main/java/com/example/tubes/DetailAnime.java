package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailAnime extends AppCompatActivity {

    ImageView imageViewAnimeDetail;
    TextView textViewAnimeDetail, textViewInfoAnime;
    Button btnLinkAnime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_anime);

        Toolbar toolbar = findViewById(R.id.toolbarDetail);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageViewAnimeDetail = findViewById(R.id.imageViewAnimeDetail);
        textViewAnimeDetail = findViewById(R.id.textViewAnimeDetail);
        textViewInfoAnime = findViewById(R.id.textViewInfoAnime);
        btnLinkAnime = findViewById(R.id.btnLink);

        Glide.with(this).load(getIntent().getIntExtra("foto_Anime",0)).into(imageViewAnimeDetail);
        textViewAnimeDetail.setText(getIntent().getStringExtra("nama_Anime"));
        textViewInfoAnime.setText(getIntent().getStringExtra("info_Anime"));

        btnLinkAnime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);

                browserIntent.setData(Uri.parse(getIntent().getStringExtra("link_Anime")));

                startActivity(browserIntent);
            }
        });
    }
}

