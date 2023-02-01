package com.example.rickandmortyapp.Interface;

import com.example.rickandmortyapp.Model.Character.Response.CharacterResponse;
import com.example.rickandmortyapp.Model.Episode.Episode;
import com.example.rickandmortyapp.Model.Location.Location;

import java.util.List;

import retrofit2.Call;

public interface InterfacesMainActivity {
    interface View {
        public void showItem();
    }

    interface Presenter {
        public void searchCharacterName(String name);
        public void sendCharacters();
    }

    interface Model {
        Call<List<CharacterResponse>> getCharacters();
        Call<List<Location>> getLocations();
        Call<List<Episode>> getEpisodes();
    }

}
