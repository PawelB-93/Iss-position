package com.example.IssPositionapp.web;

import com.example.IssPositionapp.service.IssService;
import com.example.IssPositionapp.repository.model.Iss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/iss")
@RestController
public class IssController {
    private final IssService issService;

    @Autowired
    public IssController(IssService issService) {
        this.issService = issService;
    }

    @GetMapping
    Iss getCurrentIssPosition() {
        return issService.getCurrentIssPosition();
    }


}
