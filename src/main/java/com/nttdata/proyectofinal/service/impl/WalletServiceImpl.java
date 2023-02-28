package com.nttdata.proyectofinal.service.impl;

import com.nttdata.proyectofinal.controller.WalletRepository;
import com.nttdata.proyectofinal.model.Wallet;
import com.nttdata.proyectofinal.service.WalletService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.Optional;

@ApplicationScoped
public class WalletServiceImpl implements WalletService {
    private WalletRepository walletRepository;

    @Inject
    public void WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }  

    @Transactional
    public Wallet createWallet(Wallet wallet) {
        S save = walletRepository.save(wallet);
        return save;
    }

    @Transactional
    public void deleteWalletById(String id) {
        walletRepository.deleteById(id);
    }

    @Transactional
    public void updateWallet(Wallet wallet) {
        walletRepository.update(wallet);
    }

    public boolean walletExists(String id) {
        return walletRepository.findById(id).isPresent();
    }

    @Override
    public void saveWallet(Wallet userWallet) {
        
    }
}
