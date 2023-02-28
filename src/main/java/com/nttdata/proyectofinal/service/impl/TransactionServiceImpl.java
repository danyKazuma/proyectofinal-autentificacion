package com.nttdata.proyectofinal.service.impl;

import com.nttdata.proyectofinal.model.Response;
import com.nttdata.proyectofinal.model.Transaction;
import com.nttdata.proyectofinal.model.Wallet;
import com.nttdata.proyectofinal.service.TransactionService;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import com.nttdata.proyectofinal.service.WalletService;
import com.nttdata.proyectofinal.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private WalletService walletService;


}

