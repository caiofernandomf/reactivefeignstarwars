package com.linuxtips.reactivefeignstarwars.controller;

import com.linuxtips.reactivefeignstarwars.client.FeignClient;
import com.linuxtips.reactivefeignstarwars.response.PageData;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GenericController<T> {

    FeignClient getClient();

    public Mono<T> findById(@PathVariable(name = "id") String id);


    public Flux<PageData<T>> get(@RequestParam(name = "search",required = false) String search,
                                @RequestParam(name = "page",required = true,defaultValue = "1")Integer page);
}
