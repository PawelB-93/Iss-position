package com.example.IssPositionapp.repository;

import com.example.IssPositionapp.repository.model.Iss;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class IssRepository {

    public Iss getCurrentIssPosition() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://api.open-notify.org/iss-now.json";
        return restTemplate.getForObject(url, Iss.class);
    }
}
