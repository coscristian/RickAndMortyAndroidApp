package com.example.rickandmortyapp.Model.Character.Response;

public class InfoResponse {
    private Integer count, pages;
    private String next;
    private String prev;

    public Integer getCount() {
        return count;
    }

    public Integer getPages() {
        return pages;
    }

    public String getNext() {
        return next;
    }

    public String getPrev() {
        return prev;
    }
}
