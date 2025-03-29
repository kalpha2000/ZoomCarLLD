package org.example.Repository;

import org.example.dto.Account.Account;

public interface AccountRepository {
    public Account fetchAccount(String id);
    public void createAccount(Account account);
}
