package com.bankapplication.controller;

import com.bankapplication.inout.UserInput;
import com.bankapplication.inout.UserOutput;
import com.bankapplication.service.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountHolderController {

    private final AccountHolderService accountHolderService;

    @Autowired
    public AccountHolderController(AccountHolderService accountHolderService) {
        this.accountHolderService = accountHolderService;
    }

    @GetMapping("/details/{userId}/{accountKey}")
    public UserOutput getAccountDetails(@PathVariable String userId, @PathVariable String accountKey) {
        UserInput userInput = new UserInput();
        userInput.setUserId(userId);
        userInput.setAccountKey(accountKey);
        return accountHolderService.getAccountDetails(userInput);
    }
}
