package com.example.IssPositionapp.issPosition.location.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class AccurateLocationRepository {
    public AccurateLocation getAccurateLocation(double latitude, double longitude) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("https://api.opencagedata.com/geocode/v1/json?q=%f+%f&key=9f8a3b52a2ac499b8aa50c4d97701d96", latitude, longitude);
        return restTemplate.getForObject(url, AccurateLocation.class);
    }

}
