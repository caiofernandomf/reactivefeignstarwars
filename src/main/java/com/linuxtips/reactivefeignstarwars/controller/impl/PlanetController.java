package com.linuxtips.reactivefeignstarwars.controller.impl;

import com.linuxtips.reactivefeignstarwars.client.FeignClient;
import com.linuxtips.reactivefeignstarwars.controller.AbstractController;
import com.linuxtips.reactivefeignstarwars.response.PlanetsResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/linux-wars/planets/")
public class PlanetController extends AbstractController<PlanetsResponse> {
    public PlanetController(FeignClient client) {
        super(client,"/planets/", PlanetsResponse.class);
    }
}
