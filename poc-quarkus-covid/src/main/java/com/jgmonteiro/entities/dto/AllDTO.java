package com.jgmonteiro.entities.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllDTO {

    public int confirmed;
    public int recovered;
    public int deaths;
    public String country;
    public int population;
    public int sq_km_area;
    public String life_expectancy;
    public int elevation_in_meters;
    public String continent;
    public String abbreviation;
    public String location;
    public int iso;
    public String capital_city;
    public String lat;
    @JsonProperty("long")
    public String lon;
    public String updated;

    public AllDTO() {
    }

    public AllDTO(int confirmed, int recovered, int deaths, String country, int population, int sq_km_area, String life_expectancy, int elevation_in_meters, String continent, String abbreviation, String location, int iso, String capital_city, String lat, String lon, String updated) {
        this.confirmed = confirmed;
        this.recovered = recovered;
        this.deaths = deaths;
        this.country = country;
        this.population = population;
        this.sq_km_area = sq_km_area;
        this.life_expectancy = life_expectancy;
        this.elevation_in_meters = elevation_in_meters;
        this.continent = continent;
        this.abbreviation = abbreviation;
        this.location = location;
        this.iso = iso;
        this.capital_city = capital_city;
        this.lat = lat;
        this.lon = lon;
        this.updated = updated;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSq_km_area() {
        return sq_km_area;
    }

    public void setSq_km_area(int sq_km_area) {
        this.sq_km_area = sq_km_area;
    }

    public String getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(String life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public int getElevation_in_meters() {
        return elevation_in_meters;
    }

    public void setElevation_in_meters(int elevation_in_meters) {
        this.elevation_in_meters = elevation_in_meters;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getIso() {
        return iso;
    }

    public void setIso(int iso) {
        this.iso = iso;
    }

    public String getCapital_city() {
        return capital_city;
    }

    public void setCapital_city(String capital_city) {
        this.capital_city = capital_city;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}
