//package com.bankapplication.entity;
//
//import lombok.Data;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Data
//@Entity
//@Table(name = "LOAN_DTLS")
//public class LoanAccountDatailsEntity {
//
//    @Id
//    @Column(name = "PAN_NMBR")
//    private String panCardNumber;
//    @Column(name = "LOAN_ACC_NMBR")
//    private String loanAccountNumber;
//    @Column(name = "LOAN_STS")
//    private String loanStatus;
//    @Column(name = "NMBR_OF_LOANS")
//    private int numberOfLoans;
//    @Column(name = "APLCTN_STS")
//    private String loanApplicationStatus;
//    @Column(name = "LOAN_MESG")
//    private String loanMessage;
//    @Column(name = "ELGBLT_RUPS")
//    private String loanEligibilityRupees;
//
//    public String getPanCardNumber() {
//        return panCardNumber;
//    }
//
//    public void setPanCardNumber(String panCardNumber) {
//        this.panCardNumber = panCardNumber;
//    }
//
//    public String getLoanAccountNumber() {
//        return loanAccountNumber;
//    }
//
//    public void setLoanAccountNumber(String loanAccountNumber) {
//        this.loanAccountNumber = loanAccountNumber;
//    }
//
//    public String getLoanStatus() {
//        return loanStatus;
//    }
//
//    public void setLoanStatus(String loanStatus) {
//        this.loanStatus = loanStatus;
//    }
//
//    public int getNumberOfLoans() {
//        return numberOfLoans;
//    }
//
//    public void setNumberOfLoans(int numberOfLoans) {
//        this.numberOfLoans = numberOfLoans;
//    }
//
//    public String getLoanApplicationStatus() {
//        return loanApplicationStatus;
//    }
//
//    public void setLoanApplicationStatus(String loanApplicationStatus) {
//        this.loanApplicationStatus = loanApplicationStatus;
//    }
//
//    public String getLoanMessage() {
//        return loanMessage;
//    }
//
//    public void setLoanMessage(String loanMessage) {
//        this.loanMessage = loanMessage;
//    }
//
//    public String getLoanEligibilityRupees() {
//        return loanEligibilityRupees;
//    }
//
//    public void setLoanEligibilityRupees(String loanEligibilityRupees) {
//        this.loanEligibilityRupees = loanEligibilityRupees;
//    }
//}
