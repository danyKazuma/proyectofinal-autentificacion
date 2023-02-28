package com.nttdata.proyectofinal.controller;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "wallets")
public class Wallet {

    @Id
    private String id;
    private Long userId;
    private Double bootCoinBalance;

    public Wallet(Long userId, Double bootCoinBalance) {
        this.userId = userId;
        this.bootCoinBalance = bootCoinBalance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getBootCoinBalance() {
        return bootCoinBalance;
    }

    public void setBootCoinBalance(Double bootCoinBalance) {
        this.bootCoinBalance = bootCoinBalance;
    }

    public void addBootCoins(Double amount) {
        this.bootCoinBalance += amount;
    }

    public void subtractBootCoins(Double amount) {
        this.bootCoinBalance -= amount;
    }

}