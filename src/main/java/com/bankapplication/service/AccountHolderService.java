package com.bankapplication.service;

import com.bankapplication.entity.AccountHolderEntity;
import com.bankapplication.inputoutput.UserInput;
import com.bankapplication.inputoutput.UserOutput;
import com.bankapplication.repository.AccountHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountHolderService {

    private final AccountHolderRepository accountHolderRepository;

    @Autowired
    public AccountHolderService(AccountHolderRepository accountHolderRepository) {
        this.accountHolderRepository = accountHolderRepository;
    }

    public UserOutput getAccountDetails(UserInput userInput) {
        UserOutput userOutput = new UserOutput();

        if (userInput.isClose()) {
            // Handle close logic here if needed
            return null;
        }

        if (userInput.isOpen()) {
            if (userInput.getUserId() != null && userInput.getAccountKey() != null) {
                // Both userId and accountKey provided
                AccountHolderEntity accountHolderEntity = accountHolderRepository.findByAccountNumber(userInput.getAccountKey());
                if (accountHolderEntity != null && accountHolderEntity.getAccountNumber().equals(userInput.getUserId())) {
                    mapEntityToOutput(accountHolderEntity, userOutput);
                }
            } else if (userInput.getUserId() != null) {
                // Only userId provided
                AccountHolderEntity accountHolderEntity = accountHolderRepository.findByAccountNumber(userInput.getUserId());
                if (accountHolderEntity != null) {
                    mapEntityToOutput(accountHolderEntity, userOutput);
                }
            } else if (userInput.getAccountKey() != null) {
                // Only accountKey provided
                AccountHolderEntity accountHolderEntity = accountHolderRepository.findByAccountNumber(userInput.getAccountKey());
                if (accountHolderEntity != null) {
                    mapEntityToOutput(accountHolderEntity, userOutput);
                }
            }
        }

        return userOutput;
    }

    private void mapEntityToOutput(AccountHolderEntity accountHolderEntity, UserOutput userOutput) {
        userOutput.setAccountNumber(accountHolderEntity.getAccountNumber());
        userOutput.setAccountHolderName(accountHolderEntity.getAccountHolderName());
        userOutput.setMobileNumber(accountHolderEntity.getMobileNumber());
        userOutput.setAddress(accountHolderEntity.getAddress());
        userOutput.setCurrentBalance(accountHolderEntity.getCurrentBalance());
    }
}
