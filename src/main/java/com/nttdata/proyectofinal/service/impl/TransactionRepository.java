package com.nttdata.proyectofinal.service.impl;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.nttdata.proyectofinal.model.Transaction;
import com.nttdata.proyectofinal.service.WalletService;
import io.quarkus.security.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class TransactionRepository {
    @Inject
    MongoClient mongoClient;
    @Autowired
    private TransactionRepository transactionRepository;

    private MongoCollection<Transaction> getTransactionCollection() {
        MongoDatabase database = mongoClient.getDatabase("bootcoin");
        return database.getCollection("transactions", Transaction.class);
    }

    public void createTransaction(Transaction transaction) {
        getTransactionCollection().insertOne(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return getTransactionCollection().find().into(new ArrayList<>());
    }

    public Transaction getTransactionById(String id) {
        return getTransactionCollection().find().first();
    }

    public List<Transaction> getTransactionsBySenderId(String senderId) {
        return getTransactionCollection().find().into(new ArrayList<>());
    }

    public List<Transaction> getTransactionsByReceiverId(String receiverId) {
        return getTransactionCollection().find().into(new ArrayList<>());
    }

    public List<Transaction> getTransactionsByUserId(String userId) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(getTransactionsBySenderId(userId));
        transactions.addAll(getTransactionsByReceiverId(userId));
        return transactions;
    }

    public Iterable<Transaction> findByUser(User user) {
        return transactionRepository.findByUser(user);
    }

    public void save(Transaction transaction) {
    }
}