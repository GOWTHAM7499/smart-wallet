package com.example.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.wallet.entity.Income;
import com.example.wallet.repository.IncomeRepository;
import java.util.List;

@Service
public class IncomeService {

    @Autowired
    private IncomeRepository repo;

    public Income addIncome(Income income) {
        return repo.save(income);
    }

    public List<Income> getIncome(Long userId) {
        return repo.findByUserId(userId);
    }
}