package com.web;

import com.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @program: Twossm
 * @description: 22
 * DevelopTools : IntelliJ IDEA 2019.3.1
 * DevelopSystem : windows 10
 * Company : org.yhn
 * @author : YangHaiNan
 * @create: 2020-01-23 16:56
 * @version : 1.0
 */
@Controller
public class AccountController {

    @Autowired   //按类型注入
    private AccountService accountService;

    /**
     * @Description: findAll
     * @param model 存数据， Model对象
     * @return: java.lang.String
     * @Author: Mr.Yang
     * @Date: 2020-01-28 14:51
     */
    @RequestMapping("/account/findAll")
    public String findAll(Model model) {
        System.out.println("Controller表现层：查询所有账户...");
        // 调用service的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }

    /**
     * @Description:
     * @param account 账号
     * @param request 请求
     * @param response 返回
     * @return: void
     * @Author: Mr.Yang
     * @Date: 2020-01-28 14:54
     */
    @RequestMapping("/account/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
    }

}

