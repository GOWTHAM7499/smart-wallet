package com.example.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.wallet.entity.Wallet;
import com.example.wallet.repository.WalletRepository;

@Service
public class WalletService {

    @Autowired
    private WalletRepository repo;

    public Wallet createWallet(Long userId) {
        Wallet wallet = new Wallet();
        wallet.setUserId(userId);
        wallet.setBalance(0);
        return repo.save(wallet);
    }

    public Wallet addMoney(Long userId, double amount) {
        Wallet wallet = repo.findByUserId(userId);
        wallet.setBalance(wallet.getBalance() + amount);
        return repo.save(wallet);
    }
}