
package com.example.usingrest.service;

import com.example.usingrest.model.Stocks;
import com.example.usingrest.repository.StockRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImp implements StockService {

    private final StockRepository stockRepository;

    public StockServiceImp(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public List<Stocks> getStock() {
        return stockRepository.findAll();
    }

    @Override
    public void saveNewStock(Stocks stocks){
    stockRepository.save(stocks);
    }

    @Override
    public Stocks findStock(String name){
        return stockRepository.findByName(name);
    }

    @Override
    public void deleteStock(Long id){
    stockRepository.deleteById(id);
    }


}


