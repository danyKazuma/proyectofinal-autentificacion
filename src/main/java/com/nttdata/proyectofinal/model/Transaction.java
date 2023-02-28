package com.nttdata.proyectofinal.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Transaction {
    private String id;
    private String buyerUserId;
    private String sellerUserId;
    private double amount;
    private String currencyCode;
    private Date date;
    private boolean completed;

    private String User;

    public Transaction() {
        this.id = id;
        this.buyerUserId = buyerUserId;
        this.sellerUserId = sellerUserId;
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.date = date;
        this.completed = completed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public double getAmount() {
        return amount;
    }


    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}