package com.example.usingrest.repository;


import com.example.usingrest.model.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface StockRepository extends JpaRepository<Stocks, Long> {
    Stocks findByName(String name);
}
