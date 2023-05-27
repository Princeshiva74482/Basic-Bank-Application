package com.bankapplication.repository;

import com.bankapplication.entity.OpenAccountHolderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountHolderRepository extends JpaRepository<OpenAccountHolderEntity, Long> {

    OpenAccountHolderEntity findByUserIdAndAccountNumber(String userId, String accountNumber);


    OpenAccountHolderEntity findByUserId(String userId);

}
