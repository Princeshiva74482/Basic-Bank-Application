//package com.bankapplication.controller;
//
//import com.bankapplication.inout.UserOutputVo;
//import com.bankapplication.inout.UserInput;
//import com.bankapplication.service.LoanAccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/loan")
//public class LoanAccountController {
//
//    private final LoanAccountService service;
//
//    @Autowired
//    public LoanAccountController(LoanAccountService service) {
//        this.service = service;
//    }
//
//    @PostMapping("/getUserLoansByUserId")
//    public List<UserOutputVo> getUserLoansByUserId(@RequestBody UserInput userInput) {
//        String userId = userInput.getUserId();
//        return service.getUserLoansByUserId(userId);
//    }
//
//    @PostMapping("/getUserLoansByPanCardNumber")
//    public List<UserOutputVo> getUserLoansByPanCardNumber(@RequestBody UserInput userInput) {
//        String panCardNumber = userInput.getPanCardNumber();
//        return service.getUserLoansByPanCardNumber(panCardNumber);
//    }
//
//    @PostMapping("/getUserLoansByUserIdAndPanCardNumber")
//    public List<UserOutputVo> getUserLoansByUserIdAndPanCardNumber(@RequestBody UserInput userInput) {
//        String userId = userInput.getUserId();
//        String panCardNumber = userInput.getPanCardNumber();
//        return service.getUserLoansByUserIdAndPanCardNumber(userId, panCardNumber);
//    }
//}
