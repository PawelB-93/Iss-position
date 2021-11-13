package com.example.IssPositionapp.issPosition.location.repository;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geometry {
    @JsonProperty("lat")
    double latitude;
    @JsonProperty("lng")
    double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
