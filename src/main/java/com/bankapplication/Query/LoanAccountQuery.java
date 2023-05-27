//package com.bankapplication.Query;
//
//import com.bankapplication.entity.LoanAccountDatailsEntity;
//import com.bankapplication.repository.LoanAccountDatailsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class LoanAccountQuery {
//
//    private final LoanAccountDatailsRepository repository;
//
//    @Autowired
//    public LoanAccountQuery(LoanAccountDatailsRepository repository) {
//        this.repository = repository;
//    }
//
//    public List<LoanAccountDatailsEntity> findAllOpenLoans() {
//        return repository.findAllByLoanStatus("Open");
//    }
//
//    public List<LoanAccountDatailsEntity> findAllClosedLoans() {
//        return repository.findAllByLoanStatus("Closed");
//    }
//
//    public List<LoanAccountDatailsEntity> findAllInProgressLoans() {
//        return repository.findAllByLoanStatus("InProgress");
//    }
//
//    public List<LoanAccountDatailsEntity> findAllApprovedLoans() {
//        return repository.findAllByLoanApplicationStatus("Approved");
//    }
//
//    public List<LoanAccountDatailsEntity> findAllRejectedLoans() {
//        return repository.findAllByLoanApplicationStatus("Rejected");
//    }
//}
