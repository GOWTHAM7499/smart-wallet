// IncomeRepository
package com.example.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.wallet.entity.Income;
import java.util.List;

public interface IncomeRepository extends JpaRepository<Income, Long> {
    List<Income> findByUserId(Long userId);
}