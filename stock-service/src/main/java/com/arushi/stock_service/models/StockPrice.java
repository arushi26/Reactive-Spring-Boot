package com.arushi.stock_service.models;

import java.time.LocalDateTime;

public record StockPrice(String symbol,
                         Double price,
                         LocalDateTime time) {

}
