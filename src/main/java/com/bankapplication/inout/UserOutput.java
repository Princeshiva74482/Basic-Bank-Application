package com.bankapplication.inout;


import lombok.Data;

@Data
public class UserOutput {

    private String accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String address;
    private String currentBalance;
    private String numberOfAcc;
    private String accountType;

    public String getNumberOfAcc() {
        return numberOfAcc;
    }

    public void setNumberOfAcc(String nimberOfAcc) {
        this.numberOfAcc = nimberOfAcc;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }
}
