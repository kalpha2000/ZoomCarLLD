package org.example.Repository.Impl;

import org.example.Repository.AccountRepository;
import org.example.enums.AccountType;
import org.example.exceptions.ZoomCarExceptions;

public class AccountRepositoryFactory {
    public AccountRepository getAccountRepository(AccountType accountType) throws ZoomCarExceptions {
        AccountRepository accountRepository;
        switch (accountType) {
            case USER -> accountRepository = new UserRepositoryImpl();
            case ADMIN -> accountRepository = new AdminRepositoryImpl();
            case DRIVER -> accountRepository = new DriverRepositoryImpl();
            default -> throw new ZoomCarExceptions("no implementation found");
        }
        return accountRepository;
    }
}
