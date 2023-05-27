package com.bankapplication.util;

public class BankApplicationQueries {

    private BankApplicationQueries() {}

    public static final String GET_OPEN_ACCOUNTS = 
    "SELECT ACC_N0, HLDR_NAME, CELL_NO, ADDRESS, "
    + "CURNTBLNC " 
    + "FROM ACC_DATA";

    public static final String GET_NON_OPEN_ACCOUNTS = 
    "SELECT ACC_N0, HLDR_NAME, CELL_NO, ADDRESS, "
    + "CURNTBLNC " 
    + "FROM ACC_TYP";


}

