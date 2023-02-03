package com.example.rickandmortyapp.Interfaces;

import com.example.rickandmortyapp.Model.Character.Response.CharacterResponse;
import com.example.rickandmortyapp.Model.Episode.Episode;
import com.example.rickandmortyapp.Model.Location.Location;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceAPI {
    @GET("character")
    Call<List<CharacterResponse>> getCharactersResponse();
    @GET("location")
    Call<List<Location>> getLocations();
    @GET("episode")
    Call<List<Episode>> getEpisodes();
}
