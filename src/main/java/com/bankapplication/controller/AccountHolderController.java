package com.bankapplication.controller;

import com.bankapplication.inputoutput.UserInput;
import com.bankapplication.inputoutput.UserOutput;
import com.bankapplication.service.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountHolderController {

    private final AccountHolderService accountHolderService;

    @Autowired
    public AccountHolderController(AccountHolderService accountHolderService) {
        this.accountHolderService = accountHolderService;
    }

    @PostMapping("/account/details")
    public ResponseEntity<UserOutput> getAccountDetails(@RequestBody UserInput userInput) {
        UserOutput userOutput = accountHolderService.getAccountDetails(userInput);
        if (userOutput != null) {
            return new ResponseEntity<>(userOutput, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}