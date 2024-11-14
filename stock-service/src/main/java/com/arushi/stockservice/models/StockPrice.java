package com.arushi.stockservice.models;

import java.time.LocalDateTime;

public record StockPrice(String symbol,
                         Double price,
                         LocalDateTime time) {

}
