package com.example.demo.account;

// 스프링 시큐리티가 다루는 유저 정보와 도메인에서 다루는 유저 정보 사이를 이어주는 역할

import com.example.demo.domain.Account;
import lombok.Getter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.List;

@Getter
public class UserAccount extends User { // Principal 객체로 사용할 것임

    private Account account;

    public UserAccount(Account account){
        super(account.getNickname(), account.getPassword(), List.of(new SimpleGrantedAuthority("ROLE_USER")));
        this.account = account;
    }
}
