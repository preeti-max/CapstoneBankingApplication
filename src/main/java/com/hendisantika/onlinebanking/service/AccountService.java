package com.hendisantika.onlinebanking.service;

import com.hendisantika.onlinebanking.model.PrimaryAccount;
import com.hendisantika.onlinebanking.model.SavingsAccount;

import java.security.Principal;

public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}