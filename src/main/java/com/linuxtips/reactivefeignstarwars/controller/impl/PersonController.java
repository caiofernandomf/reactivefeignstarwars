package com.linuxtips.reactivefeignstarwars.controller.impl;

import com.linuxtips.reactivefeignstarwars.client.FeignClient;
import com.linuxtips.reactivefeignstarwars.controller.AbstractController;
import com.linuxtips.reactivefeignstarwars.response.PersonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/linux-wars/people/")
public class PersonController extends AbstractController<PersonResponse> {

    public PersonController(FeignClient client){
        super(client,"/people/", PersonResponse.class);
    }
}
