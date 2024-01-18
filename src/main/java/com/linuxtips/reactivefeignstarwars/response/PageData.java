package com.linuxtips.reactivefeignstarwars.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.processing.Generated;
import java.util.List;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PageData<T>{

    @JsonProperty("count")
    public Integer count;
    @JsonProperty("next")
    public String next;
    @JsonProperty("previous")
    public String previous;
    @JsonProperty("results")
    public List<T> results;




    @Override
    public String toString() {
        return "PageData{" +
                "count=" + count +
                ", next='" + next + '\'' +
                ", previous='" + previous + '\'' +
                ", results=" + results +
                '}';
    }


}
