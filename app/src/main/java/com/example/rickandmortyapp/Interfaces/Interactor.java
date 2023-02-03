package com.example.rickandmortyapp.Interfaces;

import com.example.rickandmortyapp.Model.Episode.Episode;
import com.example.rickandmortyapp.Model.Location.Location;

import java.util.List;

import retrofit2.Call;

public interface Interactor {

    public void obtainData();
    public void obtainLocations();
    public void obtainEpisodes();
}
