package com.bankapplication.controller;

import com.bankapplication.inout.UserInput;
import com.bankapplication.inout.UserOutput;
import com.bankapplication.service.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountHolderController {

    @Autowired
    private AccountHolderService accountHolderService;

    @PostMapping("/getAccountDetails")
    public ResponseEntity<UserOutput> getAccountDetails(@RequestBody UserInput userInput) {
        UserOutput userOutput = accountHolderService.getUserOutput(userInput);
        return new ResponseEntity<>(userOutput, HttpStatus.OK);
    }
}
