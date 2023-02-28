package com.nttdata.proyectofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private final WalletRepository walletRepository;

    @Autowired
    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Wallet createWallet(Wallet wallet) {
        return walletRepository.save(wallet);
    }

    public Wallet getWalletByUserId(Long userId) {
        return walletRepository.findByUserId(userId);
    }

    public Wallet updateWallet(String id, Wallet wallet) {
        walletRepository.save(wallet);
        return wallet;
    }

    public void deleteWallet(String id) {
        walletRepository.deleteById(id);
    }

    public Wallet getWalletById(Long userId) {
        return walletRepository.findByUserId(userId);
    }
}
