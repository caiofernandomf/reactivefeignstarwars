package com.linuxtips.reactivefeignstarwars.controller.impl;

import com.linuxtips.reactivefeignstarwars.client.FeignClient;
import com.linuxtips.reactivefeignstarwars.controller.AbstractController;
import com.linuxtips.reactivefeignstarwars.response.VehiclesResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/linux-wars/vehicles/")
public class VehicleController extends AbstractController<VehiclesResponse> {
    public VehicleController(FeignClient client){
        super(client,"/vehicles/", VehiclesResponse.class);
    }

}
