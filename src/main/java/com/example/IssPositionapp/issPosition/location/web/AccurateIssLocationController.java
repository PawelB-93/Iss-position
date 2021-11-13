package com.example.IssPositionapp.issPosition.location.web;

import com.example.IssPositionapp.issPosition.location.repository.AccurateLocation;
import com.example.IssPositionapp.issPosition.location.service.AccurateLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/iss_position")
@RestController
public class AccurateIssLocationController {
    private final AccurateLocationService accurateLocationService;

    @Autowired
    public AccurateIssLocationController(AccurateLocationService accurateLocationService) {
        this.accurateLocationService = accurateLocationService;
    }

    @GetMapping
    AccurateLocation getAccurateIssLocation() {
        return accurateLocationService.getIssAccurateLocation();
    }

}
