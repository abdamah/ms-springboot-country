package com.warsameit.controller;

import com.warsameit.auth.AuthenticationManager;
import com.warsameit.model.User;
import com.warsameit.exceptions.ApiRequestException;
import com.warsameit.service.OTPSender;
import com.warsameit.service.OTPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private  AuthenticationManager authenticationManager;
    @Autowired
    private  OTPService otpService;
    @Autowired
    private  OTPSender otpSender;


    @PostMapping()
    public ResponseEntity<String> authenticate(@RequestBody User user, HttpServletResponse response){
        if(user == null)
            throw new ApiRequestException("Empty authentication", HttpStatus.BAD_REQUEST);
        // authenticate userId and password
        authenticationManager.authenticateUser(user);
        // generate OTP
        final long generatedOTP = otpService.generateOTP();
        // add to the session cookie
        response.addCookie(new Cookie(String.valueOf(generatedOTP),String.valueOf(generatedOTP)));

        // send OTP to user
        otpSender.sendOTP(generatedOTP);

        System.out.println(generatedOTP);

        return new ResponseEntity<String>("Accepted and OTP '"+generatedOTP+"'", HttpStatus.OK);
    }

}
