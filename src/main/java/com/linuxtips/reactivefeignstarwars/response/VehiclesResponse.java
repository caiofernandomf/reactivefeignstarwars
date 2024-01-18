package com.linuxtips.reactivefeignstarwars.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class VehiclesResponse {
   private String name;
    private String model;
    private String vehicle_class;// string -- The class of this vehicle, such as "Wheeled" or "Repulsorcraft".
    private String manufacturer;// string -- The manufacturer of this vehicle. Comma separated if more than one.
    private String length; // string -- The length of this vehicle in meters.
    private String cost_in_credits; // string -- The cost of this vehicle new, in Galactic Credits.
    private String crew; //string -- The number of personnel needed to run or pilot this vehicle.
    private String passengers; //string -- The number of non-essential people this vehicle can transport.
    private String max_atmosphering_speed;  // string -- The maximum speed of this vehicle in the atmosphere.
    private String cargo_capacity; //string -- The maximum number of kilograms that this vehicle can transport.
    private String consumables; //*string
    //The maximum length of time that this vehicle can provide consumables for its entire crew without having to resupply.
    private List<String> films; // array -- An array of Film URL Resources that this vehicle has appeared in.
    private List<String> pilots; //array -- An array of People URL Resources that this vehicle has been piloted by.
    private String url; // string -- the hypermedia URL of this resource.
    private String created; // string -- the ISO 8601 date format of the time that this resource was created.
    private String edited; // string --
}
