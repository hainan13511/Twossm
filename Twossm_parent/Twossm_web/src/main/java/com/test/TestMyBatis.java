package com.test;

import com.Account;
import com.dao.IAccountdao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: Twossm
 * @description: 11
 * DevelopTools : IntelliJ IDEA 2019.3.1
 * DevelopSystem : windows 10
 * Company : org.yhn
 * @author : YangHaiNan
 * @create: 2020-01-23 20:54
 * @version : 1.0
 */
public class TestMyBatis {
    @Test
    public void run1() throws IOException {
        Account account =new Account();
        account.setName("杜永蓝");
        account.setMoney(200d);
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        IAccountdao dao = session.getMapper(IAccountdao.class);

        // 保存
        dao.saveAccount(account);

        // 提交事务
        session.commit();

        // 关闭资源
        session.close();
        in.close();
    }

    @Test
    public void run2() throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = factory.openSession();

        IAccountdao dao = session.getMapper(IAccountdao.class);

        List<Account> list = dao.findAll();
        for (Account account: list ) {
            System.out.println(account);
        }

        session.close();
        in.close();
    }
}
