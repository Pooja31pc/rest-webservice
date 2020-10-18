package com.learn.shoeproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    AdminRepository adminrepo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Admin c = adminrepo.getUserByUsername(s);
        if (c == null){
            throw new UsernameNotFoundException("User Not Found");
        }

        return new MyUserDetails(c);

    }
}
