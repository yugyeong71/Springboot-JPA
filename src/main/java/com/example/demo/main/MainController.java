package com.example.demo.main;

import com.example.demo.account.CurrentUser;
import com.example.demo.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(@CurrentUser Account account, Model model){
        if(account != null){ // 인증된 사용자인 경우
            model.addAttribute(account);
        }
    return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
