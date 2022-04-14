
package com.example.usingrest.service;

import com.example.usingrest.model.Stocks;

import java.util.List;

public interface StockService {

    List<Stocks> getStock();

    void saveNewStock(Stocks stocks);

    Stocks findStock(String name);

    void deleteStock(Long id);
}

