package com.warsameit.auth;

import com.warsameit.model.User;
import com.warsameit.exceptions.ApiRequestException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class AuthenticationManager {

    //
    @Value("${com.warsameit.userid}")
    private String username;
    @Value("${com.warsameit.password}")
    private String password;

    private boolean authenticate(String username, String password){
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password))
                throw new ApiRequestException("All field are required", HttpStatus.FORBIDDEN);
        return this.password.equals(password.trim()) && this.username.equals(username.trim());
    }
    public void authenticateUser(User user){
        if(!authenticate(user.getUserId(),user.getPassword()))
            throw  new ApiRequestException("Username and password is failed", HttpStatus.FORBIDDEN);
    }


}
