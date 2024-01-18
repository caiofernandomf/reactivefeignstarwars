package com.linuxtips.reactivefeignstarwars.controller.impl;

import com.linuxtips.reactivefeignstarwars.client.FeignClient;
import com.linuxtips.reactivefeignstarwars.controller.AbstractController;
import com.linuxtips.reactivefeignstarwars.response.StarshipsResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/linux-wars/starships/")
public class StarshipController extends AbstractController<StarshipsResponse> {

    public StarshipController(FeignClient client){
        super(client,"/starships/", StarshipsResponse.class);
    }
}
