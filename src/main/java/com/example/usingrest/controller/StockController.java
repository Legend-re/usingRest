
package com.example.usingrest.controller;


import com.example.usingrest.model.Stocks;
import com.example.usingrest.service.StockServiceImp;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/stocks")
public class StockController {
    private final StockServiceImp stockService;


    public StockController(StockServiceImp stockService) {
        this.stockService = stockService;
    }

    @GetMapping(path = "/get")
    public List<Stocks> getStock() {
    return stockService.getStock();
        }

    @PostMapping(path = "/add")
    public void saveNewStocks(Stocks stocks){
    stockService.saveNewStock(stocks);
        }

    @GetMapping(path = "/api/stocks/1")
    public Stocks findStock(@PathVariable(value ="name")String name) {
    return stockService.findStock(name);
        }

    @DeleteMapping(path = "/api/stocks/1")
    public void deleteStock(@PathVariable(value = "studentId")Long id){
    stockService.deleteStock(id);
        }
 }




