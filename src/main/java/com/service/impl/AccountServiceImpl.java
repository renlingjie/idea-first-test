package com.service.impl;

import com.dao.AccountDao;
import com.pojo.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    @Transactional
    public void saveAccount(Account account) {
        System.out.println("service层：保存账户信息");
        accountDao.saveAccount(account);
    }
    @Override
    public List<Account> findAll() {
        System.out.println("service层：查询所有的账户信息");
        return accountDao.findAll();
    }


}
