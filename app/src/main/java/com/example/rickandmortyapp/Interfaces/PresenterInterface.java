package com.example.rickandmortyapp.Interfaces;

public interface PresenterInterface {
    public void searchCharacterName(String name);
    public void sendCharacters();
    public void sendErrorInfo(String errorCode);
}
