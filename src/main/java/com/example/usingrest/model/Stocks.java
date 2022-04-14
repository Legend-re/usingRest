package com.example.usingrest.model;

import javax.persistence.*;
import java.sql.Timestamp;



@Entity
@Table(name = "stock_table")
public class Stocks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stock_name",unique = true)
    private String name;

    @Column(name = "current_price")
    private Double currentPrice;

    @Column(name = "last_update")
    private Timestamp lastUpdate;

    public Stocks() {
    }

    public Stocks(Long id, String name, Double currentPrice, Timestamp lastUpdate) {
        this.id = id;
        this.name = name;
        this.currentPrice = currentPrice;
        this.lastUpdate = lastUpdate;
    }

    public Stocks(String name, Double currentPrice, Timestamp lastUpdate) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.lastUpdate = lastUpdate;

    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Stocks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", currentPrice=" + currentPrice +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
