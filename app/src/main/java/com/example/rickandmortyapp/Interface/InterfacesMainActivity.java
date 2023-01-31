package com.example.rickandmortyapp.Interface;

import com.example.rickandmortyapp.Model.Episode.Episode;
import com.example.rickandmortyapp.Model.Location.Location;

import java.util.List;

import retrofit2.Call;

public interface InterfacesMainActivity {
    interface View {

    }

    interface Presenter {

    }

    interface Model {
        Call<List<Character>> getCharacters();
        Call<List<Location>> getLocations();
        Call<List<Episode>> getEpisodes();
    }

}
