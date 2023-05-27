package com.bankapplication.entity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ACC_TYP")
public class NonOpenAccountHolderEntity {

    @Id
    @Column(name = "NUM_OF_ACC")
    private String numberOfAcc;
    @Column(name = "ACC_TYP")
    private String accountType;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getNumberOfAcc() {
        return numberOfAcc;
    }

    public void setNumberOfAcc(String nimberOfAcc) {
        this.numberOfAcc = nimberOfAcc;
    }

    /**
     * @return String return the currentBalance
     */
    public String getCurrentBalance() {
        return accountType;
    }

    /**
     * @param currentBalance the currentBalance to set
     */
    public void setCurrentBalance(String currentBalance) {
        this.accountType = currentBalance;
    }

}
