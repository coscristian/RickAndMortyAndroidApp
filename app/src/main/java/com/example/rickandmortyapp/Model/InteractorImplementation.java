package com.example.rickandmortyapp.Model;

import com.example.rickandmortyapp.Interfaces.Interactor;
import com.example.rickandmortyapp.Interfaces.PresenterInterface;
import com.example.rickandmortyapp.Interfaces.ServiceAPI;
import com.example.rickandmortyapp.Model.Character.Response.CharacterResponse;
import com.example.rickandmortyapp.Model.Episode.Episode;
import com.example.rickandmortyapp.Model.Location.Location;
import com.example.rickandmortyapp.Presenter.PresenterImplementation;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class InteractorImplementation implements Interactor {
    Retrofit retrofit;
    private final ServiceAPI modelApi;
    private final PresenterImplementation presenter;

    public InteractorImplementation(PresenterImplementation presenter) {
        this.presenter = presenter;
        String API_BASE_URL = "https://rickandmortyapi.com/api/";
        retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .build();
        modelApi = retrofit.create(ServiceAPI.class);
    }

    @Override
    public void obtainData() {
        Call<List<CharacterResponse>> call = modelApi.getCharactersResponse();
        call.enqueue(new Callback<List<CharacterResponse>>() {
            @Override
            public void onResponse(Call<List<CharacterResponse>> call, Response<List<CharacterResponse>> response) {
                if(!response.isSuccessful()) {
                    presenter.sendErrorInfo("Error code: " + response.code());
                }else {
                    // In a list obtain all the data provided by the API

                }
            }

            @Override
            public void onFailure(Call<List<CharacterResponse>> call, Throwable t) {

            }
        });
    }

    @Override
    public void obtainLocations() {

    }

    @Override
    public void obtainEpisodes() {

    }

}
