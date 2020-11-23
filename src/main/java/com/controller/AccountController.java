package com.controller;

import com.pojo.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/accountServlet")
public class AccountController {
    @Autowired
    private AccountService as;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("servlet层：查询所有账户");
        List<Account> list = as.findAll();
        model.addAttribute("list",list);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("servlet层：保存账户");
        as.saveAccount(account);
        //这个保存后的跳转我们进行重定向，不再跳转那个success页面了，而是跳转到findAll方法中，再次去查询所有数据
        //相当于我添加信息后再重新刷新查询，将新添加的信息也在页面中打印出来
        response.sendRedirect(request.getContextPath()+"/accountServlet/findAll");
        return;
    }
}
