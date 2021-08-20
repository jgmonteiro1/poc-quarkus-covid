package com.jgmonteiro.entities.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FrenchGuianaDTO {

    public String lat;
    @JsonProperty("long")
    public String lon;
    public int confirmed;
    public int recovered;
    public int deaths;
    public String updated;

    public FrenchGuianaDTO() {
    }

    public FrenchGuianaDTO(String lat, int confirmed, int recovered, int deaths, String updated) {
        this.lat = lat;
        this.confirmed = confirmed;
        this.recovered = recovered;
        this.deaths = deaths;
        this.updated = updated;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}
