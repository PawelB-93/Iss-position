package com.example.IssPositionapp.issPosition.location.service;

import com.example.IssPositionapp.issPosition.iss.repository.IssRepository;
import com.example.IssPositionapp.issPosition.location.repository.AccurateLocation;
import com.example.IssPositionapp.issPosition.location.repository.AccurateLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccurateLocationService {
    private final AccurateLocationRepository accurateLocationRepository;
    private final IssRepository issRepository;

    @Autowired
    public AccurateLocationService(AccurateLocationRepository accurateLocationRepository, IssRepository issRepository) {
        this.accurateLocationRepository = accurateLocationRepository;
        this.issRepository = issRepository;
    }

    public AccurateLocation getIssAccurateLocation() {
        return accurateLocationRepository.getAccurateLocation(issRepository.getCurrentIssPosition().getIssPosition().getLatitude(), issRepository.getCurrentIssPosition().getIssPosition().getLongitude());
    }


}
