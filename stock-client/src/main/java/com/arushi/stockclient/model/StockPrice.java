package com.arushi.stockclient.model;

import java.time.LocalDateTime;

public record StockPrice(String symbol,
                         Double price,
                         LocalDateTime time) {

}
