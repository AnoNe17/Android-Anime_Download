package com.example.tubes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterAnime extends RecyclerView.Adapter<AdapterAnime.ViewHolder> {
    private ArrayList<Integer> fotoAnime = new ArrayList<>();
    private ArrayList<String> namaAnime = new ArrayList<>();
    private ArrayList<String> infoAnime = new ArrayList<>();
    private ArrayList<String> linkAnime = new ArrayList<>();
    private Context context;

    public AdapterAnime(ArrayList<Integer> fotoAnime, ArrayList<String> namaAnime, ArrayList<String> infoAnime, ArrayList<String> linkAnime, Context context){
        this.fotoAnime = fotoAnime;
        this.namaAnime = namaAnime;
        this.infoAnime = infoAnime;
        this.linkAnime = linkAnime;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_anime , parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageViewAnime.setImageResource(fotoAnime.get(position));
        holder.textViewNamaAnime.setText(namaAnime.get(position));

        holder.layoutAnime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailAnime.class);

                intent.putExtra("foto_Anime", fotoAnime.get(position));
                intent.putExtra("nama_Anime", namaAnime.get(position));
                intent.putExtra("info_Anime", infoAnime.get(position));
                intent.putExtra("link_Anime", linkAnime.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaAnime.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewAnime;
        TextView textViewNamaAnime;
        ConstraintLayout layoutAnime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewAnime = itemView.findViewById(R.id.imageViewAnime);
            textViewNamaAnime = itemView.findViewById(R.id.textViewAnime);
            layoutAnime = itemView.findViewById(R.id.constraintLayoutAnime);
        }
    }

}
