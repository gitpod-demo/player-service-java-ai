package com.playerdb.playerservice.model;

public class TeamRequest {
    private String seedId;
    private int teamSize;

    // Getters and setters
    public String getSeedId() {
        return seedId;
    }

    public void setSeedId(String seedId) {
        this.seedId = seedId;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}