package com.app.repository;
import com.app.model.Account;

public interface UserRepository {
    void createAccount (Account account);
    void logInAccount (Account account);
    public void updateAccount (Account account, int choice);
}