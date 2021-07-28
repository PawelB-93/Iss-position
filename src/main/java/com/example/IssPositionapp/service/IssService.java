package com.example.IssPositionapp.service;

import com.example.IssPositionapp.repository.model.Iss;
import com.example.IssPositionapp.repository.IssRepository;
import org.springframework.stereotype.Service;

@Service
public class IssService {
    private final IssRepository issRepository;

    public IssService(IssRepository issRepository) {
        this.issRepository = issRepository;
    }

    public Iss getCurrentIssPosition() {
        return issRepository.getCurrentIssPosition();
    }


}
