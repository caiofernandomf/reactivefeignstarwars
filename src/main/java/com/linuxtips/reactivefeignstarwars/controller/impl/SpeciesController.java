package com.linuxtips.reactivefeignstarwars.controller.impl;

import com.linuxtips.reactivefeignstarwars.client.FeignClient;
import com.linuxtips.reactivefeignstarwars.controller.AbstractController;
import com.linuxtips.reactivefeignstarwars.response.SpeciesResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/linux-wars/species/")
public class SpeciesController extends AbstractController<SpeciesResponse> {

    private static final String url ="/species/";
    public SpeciesController(FeignClient client) {
        super(client, url, SpeciesResponse.class);
    }
}
