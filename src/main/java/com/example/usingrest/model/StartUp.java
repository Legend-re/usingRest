
package com.example.usingrest.model;

import com.example.usingrest.repository.StockRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class StartUp implements CommandLineRunner {
    private final StockRepository stockRepository;

    Logger log = LoggerFactory.getLogger(StartUp.class);

    public StartUp(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stocks first = stockRepository.findByName("FIRST");
        if (first==null){
            Stocks stock = new Stocks();
            stock.getName();
            stockRepository.save(new Stocks());
        }
        else
            log.info("First stock already created");
    }
}

