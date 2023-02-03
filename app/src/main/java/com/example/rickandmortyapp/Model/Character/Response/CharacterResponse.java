package com.example.rickandmortyapp.Model.Character.Response;

import java.util.List;

public class CharacterResponse {
    private InfoResponse info;
    private List<Character> characters;

    public InfoResponse getInfo() {
        return info;
    }

    public List<Character> getCharacters() {
        return characters;
    }
}
