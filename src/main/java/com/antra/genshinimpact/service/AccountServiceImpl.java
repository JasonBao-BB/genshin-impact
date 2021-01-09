package com.antra.genshinimpact.service;

import com.antra.genshinimpact.domain.Account;
import com.antra.genshinimpact.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AccountServiceImpl implements AccountService{

    AccountRepository repository;

    @Autowired
    public AccountServiceImpl(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Account> findAll() {
        Set<Account> accounts = new HashSet<>();
        repository.findAll().forEach(accounts::add);
        return accounts;
    }

    @Override
    public Account findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void saveAccount(Account account) {
        repository.save(account);
    }

    @Override
    public Account updateAccount(Account account) {
        Account current = repository.findById(account.getUid()).get();
        current.setBirth(account.getBirth());
        current.setDescription(account.getDescription());
        current.setLevel(account.getLevel());
        current.setName(account.getName());
        repository.save(current);
        return current;
    }

    @Override
    public void deleteAccountById(Long id) {
        repository.deleteById(id);
    }
}
