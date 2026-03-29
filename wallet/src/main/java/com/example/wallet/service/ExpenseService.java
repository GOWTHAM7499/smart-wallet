package com.example.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.wallet.entity.Expense;
import com.example.wallet.repository.ExpenseRepository;
import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repo;

    @Autowired
    private WalletRepository walletRepo;

    public Expense addExpense(Expense expense) {
        return repo.save(expense);
    }

    public List<Expense> getExpenses(Long userId) {
        return repo.findByUserId(userId);
    }
}