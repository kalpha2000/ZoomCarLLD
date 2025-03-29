package org.example.Repository.Impl;

import org.example.Repository.AccountRepository;
import org.example.dto.Account.Account;
import org.example.dto.Account.User;
import org.example.exceptions.ZoomCarExceptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepositoryImpl implements AccountRepository {
    private Map<String, User> userMap = new HashMap<>();

    @Override
    public Account fetchAccount(String id) throws ZoomCarExceptions{
        Optional<Account> account = Optional.ofNullable(userMap.get(id));
        if(account.isEmpty()) {
            throw new ZoomCarExceptions(String.format("no user account with id : {}", id));
        }
        return account.get();
    }

    @Override
    public void createAccount(Account account) {
        userMap.putIfAbsent(account.getId(), (User) account);
    }
}
