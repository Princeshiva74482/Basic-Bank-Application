//package com.bankapplication.service;
//
//import com.bankapplication.entity.LoanAccountDatailsEntity;
//import com.bankapplication.inout.UserOutputVo;
//import com.bankapplication.repository.LoanAccountDatailsRepository;
//import com.bankapplication.mapper.LoanAccountDatailsMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class LoanAccountService {
//
//    private final LoanAccountDatailsRepository repository;
//    private final LoanAccountDatailsMapper mapper;
//
//    @Autowired
//    public LoanAccountService(LoanAccountDatailsRepository repository, LoanAccountDatailsMapper mapper) {
//        this.repository = repository;
//        this.mapper = mapper;
//    }
//
//    public List<UserOutputVo> getUserLoansByUserId(String userId) {
//        List<LoanAccountDatailsEntity> loanEntities = repository.findAllByUserId(userId);
//        return mapEntitiesToUserOutputVo(loanEntities);
//    }
//
//    public List<UserOutputVo> getUserLoansByPanCardNumber(String panCardNumber) {
//        List<LoanAccountDatailsEntity> loanEntities = repository.findAllByPanCardNumber(panCardNumber);
//        return mapEntitiesToUserOutputVo(loanEntities);
//    }
//
//    public List<UserOutputVo> getUserLoansByUserIdAndPanCardNumber(String userId, String panCardNumber) {
//        List<LoanAccountDatailsEntity> loanEntities = repository.findAllByUserIdAndPanCardNumber(userId, panCardNumber);
//        return mapEntitiesToUserOutputVo(loanEntities);
//    }
//
//    private List<UserOutputVo> mapEntitiesToUserOutputVo(List<LoanAccountDatailsEntity> loanEntities) {
//        List<UserOutputVo> userOutputVos = new ArrayList<>();
//        for (LoanAccountDatailsEntity entity : loanEntities) {
//            userOutputVos.add(mapper.toUserOutputVo(entity));
//        }
//        return userOutputVos;
//    }
//}
