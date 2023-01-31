package com.example.rickandmortyapp.Model.Character;

import java.util.List;

public class Character {
    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private Origin origin;
    private ShortLocation location;
    private String imageUrl;
    private List<String> episodesUrls;
    private String url;
    private String created;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getSpecies() {
        return species;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public Origin getOrigin() {
        return origin;
    }

    public ShortLocation getLocation() {
        return location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public List<String> getEpisodesUrls() {
        return episodesUrls;
    }

    public String getUrl() {
        return url;
    }

    public String getCreated() {
        return created;
    }
}
