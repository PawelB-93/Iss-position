package com.example.IssPositionapp.issPosition.location.repository;

import java.util.Optional;

public class Components {
    private String city;
    private String continent;
    private String country;
    private String state;
    private String postcode;
    private String neighbourhood;

    public String getCity() {
        return Optional.ofNullable(city).orElse("Not available");
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContinent() {
        return Optional.ofNullable(continent).orElse("Not available");
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return Optional.ofNullable(country).orElse("Not available");
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return Optional.ofNullable(state).orElse("Not available");
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return Optional.ofNullable(postcode).orElse("Not available");
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getNeighbourhood() {
        return Optional.ofNullable(neighbourhood).orElse("Not available");

    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }
}
