package com.bankapplication.repository;

import com.bankapplication.entity.OpenAccountHolderEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountHolderRepository extends JpaRepository<OpenAccountHolderEntity, String> {
    
    // Find account holder by account number
    OpenAccountHolderEntity findByAccountNumber(String accountNumber);

    // Find account holder by account holder name
    OpenAccountHolderEntity findByAccountHolderName(String accountHolderName);

    // Find account holder by mobile number
    OpenAccountHolderEntity findByMobileNumber(String mobileNumber);
    
    // Find account holder by address
    OpenAccountHolderEntity findByAddress(String address);

    // Find account holder by current balance
    OpenAccountHolderEntity findByCurrentBalance(String currentBalance);
    
    // Find account holder by user ID and account key
    OpenAccountHolderEntity findByUserIdAndAccountKey(String userId, String accountKey);
}