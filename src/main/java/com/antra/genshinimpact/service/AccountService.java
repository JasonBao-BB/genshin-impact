package com.antra.genshinimpact.service;


import com.antra.genshinimpact.domain.Account;

import java.util.Set;

public interface AccountService {
    Set<Account> findAll();
    Account findById(Long id);
    void saveAccount(Account account);
    Account updateAccount(Account account);
    void deleteAccountById(Long id);
}
