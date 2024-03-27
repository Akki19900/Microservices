package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {


    // This function is used to create a new account
    void createAccount(CustomerDto customerDto);

    // This function is used to get account details
    CustomerDto fetchAccount(String mobileNumber);

    // This function is used to update account details
    boolean updateAccountDetails(CustomerDto customerDto);

    // This function is used to delete account details with the mobile number
    boolean deleteAccount(String mobileNumber);

}
