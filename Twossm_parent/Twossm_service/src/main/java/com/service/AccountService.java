package com.service;

import com.Account;

import java.util.List;

/**
 * @author : YangHaiNan
 * @version : 1.0
 * @program: Twossm
 * @description: 测试service
 * DevelopTools : IntelliJ IDEA 2019.3.1
 * DevelopSystem : windows 10
 * Company : org.yhn
 * @create: 2020-01-23 14:07
 */
public interface AccountService {

    /**
     * 查询所有账户
     * @return List<Account>
     */
    List<Account> findAll();

    /**
     * 保存帐户信息
     * @param account Account
     */
    void saveAccount(Account account);
}
