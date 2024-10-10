package com.example.oauth2_spring_security.service;

import com.example.oauth2_spring_security.model.User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User createUser(OAuth2User oAuth2User){
        User user = new User();
        //Set user attributes from oAuth2User
        user.setName(oAuth2User.getAttribute("name"));
        user.setEmail(oAuth2User.getAttribute("email"));
        return user;
    }
}
