package com.iyadaltoubah.Services;


import com.iyadaltoubah.Models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
    User findByUsername (String username);
}
