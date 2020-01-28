package com.dao;

import com.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountdao {

    /**
     * @Description: findAll
     * @return: java.util.List<com.Account>     
     * @Author: Mr.Yang
     * @Date: 2020-01-28 14:59
     */
    @Select("select * from account")
    List<Account> findAll();
    
    /**
     * @Description: 保存账号
     * @return: void
     * @param account 账号
     * @Author: Mr.Yang
     * @Date: 2020-01-28 15:00
     */
    @Insert("insert into account (name,money) value(#{name},#{money})")
    void saveAccount(Account account);
}
