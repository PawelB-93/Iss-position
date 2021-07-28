package com.example.IssPositionapp.repository.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Iss {
    @JsonProperty("iss_position")
    private IssPosition issPosition;

    public IssPosition getIssPosition() {
        return issPosition;
    }

    public void setIssPosition(IssPosition issPosition) {
        this.issPosition = issPosition;
    }


}
