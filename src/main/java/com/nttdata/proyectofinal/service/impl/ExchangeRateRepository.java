package com.nttdata.proyectofinal.service.impl;

import com.nttdata.proyectofinal.model.ExchangeRate;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.springframework.beans.factory.annotation.Autowired;

@ApplicationScoped
public class ExchangeRateRepository implements PanacheMongoRepository<ExchangeRate> {
    @Autowired
    private ExchangeRateRepository exchangeRateRepository;
    public ExchangeRate findByCurrency(String currency) {
        return exchangeRateRepository.findByCurrency(currency);
    }
}