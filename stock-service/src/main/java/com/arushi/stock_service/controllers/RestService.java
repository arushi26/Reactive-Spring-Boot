package com.arushi.stock_service.controllers;

import com.arushi.stock_service.models.StockPrice;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

import static java.time.LocalDateTime.now;

@RestController
public class RestService {

    @GetMapping(value="/stocks/{symbol}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    private Flux<StockPrice> prices(@PathVariable String symbol) {
        // Create new StockPrice for each second
        return Flux.interval(Duration.ofSeconds(1))
                .map( s -> new StockPrice(symbol, randomStockPrice(), now()));
    }

    private Double randomStockPrice() {
        return ThreadLocalRandom.current().nextDouble(100.0);
    }

}
