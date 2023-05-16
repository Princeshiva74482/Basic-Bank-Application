package com.bankapplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
@Table(name = "ACC_DATA")
public class AccountHolderEntity {
    @Id
    @EmbeddedId
    @Column(name = "ACC_NO")
    private String accountNumber;
    @Column(name = "HLDR_NAME")
    private String accountHolderName;
    @Column(name = "CELL_NO")
    private String mobileNumber;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CURNTBLNC")
    private String currentBalance;

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
