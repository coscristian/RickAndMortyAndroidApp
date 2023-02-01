package com.example.rickandmortyapp.Model;

import com.example.rickandmortyapp.Interface.InterfacesMainActivity;
import com.example.rickandmortyapp.Model.Character.Response.CharacterResponse;
import com.example.rickandmortyapp.Model.Episode.Episode;
import com.example.rickandmortyapp.Model.Location.Location;

import java.util.List;

import retrofit2.Call;

public class ModelImplementation implements InterfacesMainActivity.Model {
    @Override
    public Call<List<CharacterResponse>> getCharacters() {
        return null;
    }

    @Override
    public Call<List<Location>> getLocations() {
        return null;
    }

    @Override
    public Call<List<Episode>> getEpisodes() {
        return null;
    }
}
