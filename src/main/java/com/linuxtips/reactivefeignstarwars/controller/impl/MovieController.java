package com.linuxtips.reactivefeignstarwars.controller.impl;

import com.linuxtips.reactivefeignstarwars.client.FeignClient;
import com.linuxtips.reactivefeignstarwars.controller.AbstractController;
import com.linuxtips.reactivefeignstarwars.response.MoviesResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.TypeVariable;

@RestController
@RequestMapping("/linux-wars/movies/")
public class MovieController extends AbstractController<MoviesResponse> {
    public MovieController(FeignClient movieClient){
        super(movieClient,"/films/",MoviesResponse.class);

    }
}
