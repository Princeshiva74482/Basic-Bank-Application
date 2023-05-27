package com.bankapplication.service;

import com.bankapplication.entity.NonOpenAccountHolderEntity;
import com.bankapplication.entity.OpenAccountHolderEntity;
import com.bankapplication.inout.UserInput;
import com.bankapplication.inout.UserOutput;
import com.bankapplication.repository.AccountHolderRepository;
import com.bankapplication.util.BankApplicationQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class AccountHolderService {
    private final AccountHolderRepository accountHolderRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public AccountHolderService(AccountHolderRepository accountHolderRepository) {
        this.accountHolderRepository = accountHolderRepository;
    }

    /*public UserOutput getUserOutput(UserInput userInput) {
        UserOutput userOutput = new UserOutput();
        if (userInput.isOpen()) {
            OpenAccountHolderEntity accountHolder = accountHolderRepository.findByUserIdAndAccountNumber(
                    userInput.getUserId(), userInput.getAccountKey());
            if (accountHolder != null) {
                mapToUserOutput(accountHolder, userOutput);
            }
        } else {
            List<NonOpenAccountHolderEntity> accountHolders = getNonOpenAccountHolders(userInput);
            if (!accountHolders.isEmpty()) {
                mapToUserOutput(accountHolders.get(0), userOutput);
            }
        }

        return userOutput;
    }*/
    public UserOutput getUserOutput(UserInput userInput) {
        UserOutput userOutput = new UserOutput();
        if (userInput.isOpen()) {
            OpenAccountHolderEntity accountHolder = accountHolderRepository.findByUserIdAndAccountNumber(userInput.getUserId(), userInput.getAccountNumber());
            if (accountHolder != null) {
                mapToUserOutput(accountHolder, userOutput);
            }
        } else {
            // ...
        }

        return userOutput;
    }

    private List<NonOpenAccountHolderEntity> getNonOpenAccountHolders(UserInput userInput) {
        TypedQuery<NonOpenAccountHolderEntity> query = entityManager.createQuery(
                BankApplicationQueries.GET_NON_OPEN_ACCOUNTS, NonOpenAccountHolderEntity.class);
        return query.getResultList();
    }

    private void mapToUserOutput(OpenAccountHolderEntity accountHolder, UserOutput userOutput) {
        userOutput.setAccountNumber(accountHolder.getAccountNumber());
        userOutput.setAccountHolderName(accountHolder.getAccountHolderName());
        userOutput.setMobileNumber(accountHolder.getMobileNumber());
        userOutput.setAddress(accountHolder.getAddress());
        userOutput.setCurrentBalance(accountHolder.getCurrentBalance());
        userOutput.setAccountType(accountHolder.getAccountType());
    }

    private void mapToUserOutput(NonOpenAccountHolderEntity accountHolder, UserOutput userOutput) {
        userOutput.setNumberOfAcc(accountHolder.getNumberOfAcc());
        userOutput.setAccountType(accountHolder.getAccountType());
    }
}
