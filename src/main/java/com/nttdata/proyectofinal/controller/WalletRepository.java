package com.nttdata.proyectofinal.controller;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WalletRepository extends MongoRepository<Wallet, String> {

    Wallet findByUserId(Long userId);

    void update(com.nttdata.proyectofinal.model.Wallet wallet);
}