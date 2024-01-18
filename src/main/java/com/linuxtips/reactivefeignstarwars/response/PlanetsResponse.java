package com.linuxtips.reactivefeignstarwars.response;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Generated("jsonschema2pojo")
public class PlanetsResponse {

    @JsonProperty("name")
    private String name;
    @JsonProperty("rotation_period")
    private String rotationPeriod;
    @JsonProperty("orbital_period")
    private String orbitalPeriod;
    @JsonProperty("diameter")
    private String diameter;
    @JsonProperty("climate")
    private String climate;
    @JsonProperty("gravity")
    private String gravity;
    @JsonProperty("terrain")
    private String terrain;
    @JsonProperty("surface_water")
    private String surfaceWater;
    @JsonProperty("population")
    private String population;
    @JsonProperty("residents")
    private List<String> residents;
    @JsonProperty("films")
    private List<String> films;
    @JsonProperty("created")
    private String created;
    @JsonProperty("edited")
    private String edited;
    @JsonProperty("url")
    private String url;


}

