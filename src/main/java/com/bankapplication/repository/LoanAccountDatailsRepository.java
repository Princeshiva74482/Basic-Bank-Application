//package com.bankapplication.repository;
//
//import com.bankapplication.entity.LoanAccountDatailsEntity;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface LoanAccountDatailsRepository extends JpaRepository<LoanAccountDatailsEntity, String>{
//
//    List<LoanAccountDatailsEntity> findAllByLoanStatus(String inProgress);
//
//    List<LoanAccountDatailsEntity> findAllByLoanApplicationStatus(String approved);
//
//    List<LoanAccountDatailsEntity> findAllByUserIdAndPanCardNumber(String userId, String panCardNumber);
//
//    List<LoanAccountDatailsEntity> findAllByPanCardNumber(String panCardNumber);
//
//    List<LoanAccountDatailsEntity> findAllByUserId(String userId);
//}
