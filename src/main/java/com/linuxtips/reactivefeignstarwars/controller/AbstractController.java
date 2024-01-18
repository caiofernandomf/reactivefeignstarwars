package com.linuxtips.reactivefeignstarwars.controller;

import com.linuxtips.reactivefeignstarwars.client.FeignClient;
import com.linuxtips.reactivefeignstarwars.response.PageData;
import com.linuxtips.reactivefeignstarwars.response.SpeciesResponse;
import org.springframework.core.GenericTypeResolver;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public abstract class AbstractController<T> implements GenericController<T> {

    private final FeignClient client;
    private final String endpoint;

    private final Class<T> t;

    public AbstractController(FeignClient client, String endpoint, Class<T> t1){
        this.client=client;
        this.endpoint=endpoint;
        this.t=t1;
    }

    @Override
    public FeignClient getClient(){
        return this.client;
    }

    @Override
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<T> findById(@PathVariable(name = "id") String id){
        return getClient().getById(endpoint,id, t);
    }

    @Override
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Flux<PageData<T>> get(@RequestParam(name = "search",required = false) String search,
                                @RequestParam(name = "page",required = true,defaultValue = "1")Integer page) {
        return getClient().get(endpoint,search,page,t);

    }
}
