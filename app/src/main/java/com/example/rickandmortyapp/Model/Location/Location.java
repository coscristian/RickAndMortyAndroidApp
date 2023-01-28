package com.example.rickandmortyapp.Model.Location;

import java.util.List;

public class Location {
    private Integer id;
    private String name;
    private String type;
    private String dimension;
    private List<String> residentsUrls;
    private String url;
    private String timeCreated;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDimension() {
        return dimension;
    }

    public List<String> getResidentsUrls() {
        return residentsUrls;
    }

    public String getUrl() {
        return url;
    }

    public String getTimeCreated() {
        return timeCreated;
    }
}
