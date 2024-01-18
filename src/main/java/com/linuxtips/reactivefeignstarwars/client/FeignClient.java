package com.linuxtips.reactivefeignstarwars.client;

import com.linuxtips.reactivefeignstarwars.response.PageData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@ReactiveFeignClient( name = "star-wars-test",url = "https://swapi.dev/api/")
public interface FeignClient {
    @GetMapping("{uri}/{id}")
    <T>Mono<T> getById(@PathVariable String uri,@PathVariable(value = "id") String id,Class<T> t);

    @GetMapping("{uri}")
    <T>Flux<PageData<T>> get(@PathVariable String uri, @RequestParam String search, @RequestParam Integer page, Class<T> t);

    @GetMapping("{uri}")
    <T>Flux<PageData<T>> getAll(@PathVariable String uri, @RequestParam String search, @RequestParam Integer page);

}
