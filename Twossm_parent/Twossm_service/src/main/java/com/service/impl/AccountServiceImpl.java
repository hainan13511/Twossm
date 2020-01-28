package com.service.impl;

import com.Account;
import com.dao.IAccountdao;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : YangHaiNan
 * @version : 1.0
 * @program: Twossm
 * @description: 测试
 * DevelopTools : IntelliJ IDEA 2019.3.1
 * DevelopSystem : windows 10
 * Company : org.yhn
 * @create: 2020-01-23 14:12
 */
@Service("accountService")
@Transactional(propagation= Propagation.SUPPORTS,readOnly=true)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private IAccountdao iaccountdao;

    @Override
    public List<Account> findAll() {
        System.out.println("Service业务层：查询所有账户...");
        return iaccountdao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("Service业务层：保存帐户...");
        iaccountdao.saveAccount(account);
    }

}
