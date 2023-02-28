package com.nttdata.proyectofinal.model;

public class ExchangeRate {

    private String currencyFrom;
    private String currencyTo;
    private double buyRate;
    private double sellRate;

    public ExchangeRate(String currencyFrom, String currencyTo, double buyRate, double sellRate) {
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.buyRate = buyRate;
        this.sellRate = sellRate;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public double getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(double buyRate) {
        this.buyRate = buyRate;
    }

    public double getSellRate() {
        return sellRate;
    }

    public void setSellRate(double sellRate) {
        this.sellRate = sellRate;
    }

}