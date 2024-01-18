package com.linuxtips.reactivefeignstarwars.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class StarshipsResponse {

    private String name;
    private String model;
    private String starship_class;
    private String manufacturer;
    private String cost_in_credits;
    private String length;
    private String crew;
    private String passengers;
    private String max_atmosphering_speed;
    private String hyperdrive_rating;
    private String MGLT;
    private String cargo_capacity;
    private String consumables;
    private List<String> films;
    private List<String> pilots;
    private String url;
    private String created;
    private String edited;

    @Override
    public String toString() {
        return "StarshipsResponse{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", starship_class='" + starship_class + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", cost_in_credits='" + cost_in_credits + '\'' +
                ", length='" + length + '\'' +
                ", crew='" + crew + '\'' +
                ", passengers='" + passengers + '\'' +
                ", max_atmosphering_speed='" + max_atmosphering_speed + '\'' +
                ", hyperdrive_rating='" + hyperdrive_rating + '\'' +
                ", MGLT='" + MGLT + '\'' +
                ", cargo_capacity='" + cargo_capacity + '\'' +
                ", consumables='" + consumables + '\'' +
                ", films=" + films +
                ", pilots=" + pilots +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                '}';
    }
}
