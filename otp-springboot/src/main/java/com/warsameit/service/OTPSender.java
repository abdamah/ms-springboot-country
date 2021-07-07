package com.warsameit.service;

import org.springframework.stereotype.Service;

@Service
public class OTPSender {

    public void sendOTP(long otp){
        //TODO sending OTP via mail
        System.out.println(otp);
    }


}
