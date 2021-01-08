package com.michcinski.demo.model;

public class UserRequirements {
    private String country;
    private String season;

    public UserRequirements(String country, String season) {
        this.country = country;
        this.season = season;
    }

    public UserRequirements() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
