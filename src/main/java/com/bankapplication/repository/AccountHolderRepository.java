package com.bankapplication.repository;

import com.bankapplication.entity.AccountHolderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountHolderRepository extends JpaRepository<AccountHolderEntity, String> {
    AccountHolderEntity findByAccountNumber(String accountNumber);
}