package com.nttdata.proyectofinal.service.impl;

import com.nttdata.proyectofinal.model.ExchangeRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeRateServiceImpl implements com.nttdata.proyectofinal.service.ExchangeRateService {

    @Autowired
    private ExchangeRateRepository exchangeRateRepository;

    public ExchangeRate getExchangeRate(String currency) {
        ExchangeRate exchangeRate = exchangeRateRepository.findByCurrency(currency);
        if (exchangeRate == null) {
            throw new RuntimeException("Exchange rate not found for currency: " + currency);
        }
        return exchangeRate;
    }
}
