package com.example.tubes;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class GenreFragment extends Fragment implements AdapterView.OnItemClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_genre, container, false);
        return  view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] genre = {
                "Action","Adventure","Comedy","Dementia","Demons","Drama","Ecchi","Fantasy","Game","Harem","Historical","Horror",
                "Josei","Kids","Magic","Martial Arts","Mecha","Military","Music","Mystery","Parody","Police","Psychological","Romance",
                "Samurai","School","Sci-Fi","Seinen","Shoujo","Shoujo-Ai","Shounen","Slice Of Life","Space","Sports","Super Power",
                "Supernatural","Thriller","Vampire","Yuri"
        };

        ListView listView = (ListView)view.findViewById(R.id.listGenre);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, genre);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        switch (position){
            case 0:
                Intent_Genre("Action");
                break;
            case 1:
                Intent_Genre("Adventure");
                break;
            case 2:
                Intent_Genre("Comedy");
                break;
            case 3:
                Intent_Genre("Dementia");
                break;
            case 4:
                Intent_Genre("Demons");
                break;
            case 5:
                Intent_Genre("Drama");
                break;
            case 6:
                Intent_Genre("Ecchi");
                break;
            case 7:
                Intent_Genre("Fantasy");
                break;
            case 8:
                Intent_Genre("Game");
                break;
            case 9:
                Intent_Genre("Harem");
                break;
            case 10:
                Intent_Genre("Historical");
                break;
            case 11:
                Intent_Genre("Horror");
                break;
            case 12:
                Intent_Genre("Josei");
                break;
            case 13:
                Intent_Genre("Kids");
                break;
            case 14:
                Intent_Genre("Magic");
                break;
            case 15:
                Intent_Genre("Martial Arts");
                break;
            case 16:
                Intent_Genre("Mecha");
                break;
            case 17:
                Intent_Genre("Military");
                break;
            case 18:
                Intent_Genre("Music");
                break;
            case 19:
                Intent_Genre("Mystery");
                break;
            case 20:
                Intent_Genre("Parody");
                break;
            case 21:
                Intent_Genre("Police");
                break;
            case 22:
                Intent_Genre("Psychological");
                break;
            case 23:
                Intent_Genre("Romance");
                break;
            case 24:
                Intent_Genre("Samurai");
                break;
            case 25:
                Intent_Genre("School");
                break;
            case 26:
                Intent_Genre("Sci-fi");
                break;
            case 27:
                Intent_Genre("Seinen");
                break;
            case 28:
                Intent_Genre("Shoujo");
                break;
            case 29:
                Intent_Genre("Shoujo-Ai");
                break;
            case 30:
                Intent_Genre("Shounen");
                break;
            case 31:
                Intent_Genre("Slice Of Life");
                break;
            case 32:
                Intent_Genre("Space");
                break;
            case 33:
                Intent_Genre("Sports");
                break;
            case 34:
                Intent_Genre("Super Power");
                break;
            case 35:
                Intent_Genre("Supernatural");
                break;
            case 36:
                Intent_Genre("Thriller");
                break;
            case 37:
                Intent_Genre("Vampire");
                break;
            case 38:
                Intent_Genre("Yuri");
                break;
        }
    }

    public void Intent_Genre(String value){
        Intent intent = new Intent(getActivity(), GenreActivity.class);
        intent.putExtra("nama_genre", value);
        startActivity(intent);
    }
}